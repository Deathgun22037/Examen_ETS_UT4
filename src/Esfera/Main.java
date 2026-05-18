package Esfera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <Esfera> listaEsferas = new ArrayList<>();
        Scanner tec = new Scanner(System.in);
        double esferas = 0, radio = 0;
        boolean puerta = false;
        double pi = Math.PI;

        do {

            System.out.println("Escoja una opcion");
            System.out.println("1. Añadir esfera");
            System.out.println("2. Ver lista de volumen y area de esferas");
            System.out.println("3. Ver esfera de mayor volumen");
            System.out.println("4. Salir");

            int opcion = pedirNum(tec);

            switch (opcion) {
                case 1:
                    radio = pedirNumDouble(tec);
                    Esfera esfera = new Esfera(radio);
                    listaEsferas.add(esfera);
                    System.out.println("Esfera añadida correctamente.");
                    System.out.println(esfera);
                    break;
                case 2:
                    System.out.println("Lista de esferas");
                    for (Esfera e: listaEsferas) {
                        System.out.println(e);
                        System.out.println("Area: "+Esfera.calcularArea(radio, pi));
                        System.out.println("Volumen: "+Esfera.calcularVolumen(radio, pi));
                    }
                    break;
                case 3:
                    double esferaGrande = listaEsferas.get(0).getRadio();
                    double esferaPequeña = listaEsferas.get(1).getRadio();

                    for (Esfera e: listaEsferas) {
                        double radioOrd = e.getRadio();
                        if (radioOrd > esferaGrande) {
                            esferaGrande = radioOrd;
                        } else if (radioOrd < esferaPequeña) {
                            esferaPequeña = radioOrd;
                        }
                    }

                    System.out.println("La esfera mas grande y de mayor es -> "+esferaGrande);
                    break;
                case 4:
                    puerta = true;
                    break;
                default:
                    break;
            }

        } while (!puerta);

        System.out.println("¿Cuantas esferas introducira?");
        esferas = pedirNum(tec);

        for(int i = 0; i < esferas; i++) {
            System.out.println("Introduzca su radio.");
            radio = pedirNum(tec);

        }

    }

    public static double pedirNumDouble(Scanner tec) {
        double numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Introduce un número entero positivo: ");
            String entrada = tec.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                if (numero < 0) {
                    System.out.println("No se permiten números negativos.");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes introducir un número entero.");
            }
        }
        return numero;
    }

    public static int pedirNum(Scanner tec) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Introduce un número entero positivo: ");
            String entrada = tec.nextLine();
            try {
                numero = Integer.parseInt(entrada);
                if (numero < 0) {
                    System.out.println("No se permiten números negativos.");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Debes introducir un número entero.");
            }
        }
        return numero;
    }
}
