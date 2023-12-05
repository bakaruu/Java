/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panaderia;

import static java.lang.Thread.sleep;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EAG
 */
public class Panaderia {

    static boolean abierto = false;
    //almacen de comidas
    static int[] almacen_comida = new int[3];
    static int[] comidas_vendidas = new int[3];
    //SEMAFOROS QUE NECESITAMOS, produccionPanes, clientes y recaudacion
    static Semaphore[] sem_panes = {new Semaphore(1), new Semaphore(1), new Semaphore(1)};
    static Semaphore sem_recaudacion = new Semaphore(1);
    static Semaphore sem_cliente = new Semaphore(1);
    static int cliente;

    Panaderia(int t) {
        cliente = t;
        almacen_comida[0] = 0;
        almacen_comida[1] = 0;
        almacen_comida[2] = 0;
        comidas_vendidas[0] = 0;
        comidas_vendidas[1] = 0;
        comidas_vendidas[2] = 0;
        abierto = true;

    }

    public static class panadero extends Thread {

        @Override
        public void run() {
            while (abierto) {

                try {
                    //cocinando pan integral
                    System.out.println("Cocinando pan integral en 3 segundos");
                    sleep(3000);
                    sem_panes[0].acquire();
                    almacen_comida[0]++;
                    System.out.println("Una pan integral más, hay: " + almacen_comida[0]);
                    sem_panes[0].release();

                    System.out.println("Cocinando croissant en 2 segundos");
                    sleep(2000);
                    sem_panes[1].acquire();
                    almacen_comida[1]++;
                    System.out.println("Una croissant más, hay: " + almacen_comida[1]);
                    sem_panes[1].release();

                    System.out.println("Cocinando baguettes en 2 segundos");
                    sleep(4000);
                    sem_panes[2].acquire();
                    almacen_comida[2]++;
                    System.out.println("Una baguettes más, hay: " + almacen_comida[2]);
                    sem_panes[2].release();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Panaderia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static class cliente extends Thread {

        //Habrá una clase Cliente que querrá comprar un único producto que decidirá de
        //forma aleatoria. El cliente tardará 2 segundos en decidir qué quiere comprar e
        //intentará comprar un producto. Si no hay del producto que quiere, esperará 5
        //segundos y volverá a intentarlo.
        int comida, cantidad;
        String tipo;
        boolean terminado;
        String nombre;

        cliente(String nom) {
            nombre = nom;
            comida = (int) (Math.random() * 2);
            cantidad = (int) (Math.random() * 2)+1;

            switch (comida) {
                case 0:
                    tipo = "Pan Integrales";
                    break;
                case 1:
                    tipo = "Croissants";
                    break;
                default:
                    tipo = "Baguettes";
                    break;

            }
            terminado = false;
        }

        @Override
        public void run() {

           try {
                System.out.println("Soy el cliente " + nombre + " quiero " + cantidad + " " + tipo);
                while (!terminado) {
                    sleep(10000);
                    sem_panes[comida].acquire();
                    if (almacen_comida[comida] == 0) {
                        System.out.println("Cliente " + nombre + " - No quedan " + tipo + "s, sigo esperando");
                        
                    } else {
                        if (almacen_comida[comida] > cantidad) {
                            System.out.println("Cliente " + nombre + " - Hay " + tipo + " de sobra, cojo " + cantidad + " y me voy");
                            almacen_comida[comida] -= cantidad;
                            comidas_vendidas[comida] += cantidad;
                            terminado = true;
                        } else {
                            if (almacen_comida[comida] == cantidad) {
                                System.out.println("Cliente " + nombre + " - Hay justo los " + tipo + " que necesito, me voy");
                                almacen_comida[comida] = 0;
                                comidas_vendidas[comida] += cantidad;
                                terminado = true;
                            } else {
                                System.out.println("Cliente " + nombre + " - No hay suficientes sigo esperando");
                                
                            }
                        }
                    }
                    sem_panes[comida].release();
                }
                System.out.println("Soy el cliente " + nombre + " tengo mi comida, me voy. ADIOS");
                sem_cliente.acquire();
                cliente--;
                if (cliente == 0) {
                    abierto = false;
                }
                sem_cliente.release();
            } catch (InterruptedException ex) {
                Logger.getLogger(Panaderia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sn = new Scanner(System.in);
        System.out.println("Dime número de clientes");
        int n_clientes = sn.nextInt();

        Panaderia c = new Panaderia(n_clientes);

        panadero p = new panadero();
        p.start();
        
        
        cliente[] cli = new cliente[n_clientes];
        
        for (int i = 0; i < n_clientes; i++) {
            String nom = "Cliente " + String.valueOf(i+1);
            cli[i] = new cliente(nom);
            cli[i].start();
        }

        for (int i = 0; i < n_clientes; i++) {
            cli[i].join();
        }

        p.join();

        System.out.println("Hemos cerrado. El resumen del dia es:");
        System.out.println("Cantidad de pan Integral: " + comidas_vendidas[0]);
        System.out.println("Cantidad de croissant: " + comidas_vendidas[1]);
        System.out.println("Cantidad de baguettes: " + comidas_vendidas[2]);
    }

}
