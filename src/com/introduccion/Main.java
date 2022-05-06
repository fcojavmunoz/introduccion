package com.introduccion;

import java.util.Scanner;

public class Main {

          public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Positivo o negativo -->");

            System.out.println("Por favor ingrese un número negativo, positivo o el 0. ");
            Float numeroif = entrada.nextFloat();

            if (numeroif == 0) {
                System.out.println("El " + numeroif +" es 0");
            } else if (numeroif < 0) {
                System.out.println("El " + numeroif +" es negativo, siempre negativo.");
            } else {
                System.out.println("El " + numeroif +" es positivo");
            }
            System.out.println("");
            System.out.println("Bucle while -->");

            System.out.println("Por favor ingrese un número entero inferior a 3");
            int numeroWhile = entrada.nextInt();

            while (numeroWhile < 3) {
                System.out.println("Número: " + numeroWhile);
                numeroWhile = numeroWhile + 1;

                    System.out.println("El número de este bucle ha cambiado a " + numeroWhile);
                } while (numeroWhile < numeroWhile++);

            System.out.println("");
            System.out.println("Do While -->");

            System.out.println("Por favor, introduce un número entero");
            int numeroWhile2 = entrada.nextInt();

            do {
                numeroWhile2 = numeroWhile2 + 1;
                System.out.println("El número de este bucle ha cambiado a " + numeroWhile2);
            } while (numeroWhile2 < numeroWhile2++);
            System.out.println("");
            System.out.println("For -->");

            int numeroFor = 0;

            for (int i=0; numeroFor <= 3; i++){
                System.out.println("Número For: " + numeroFor);
                numeroFor = numeroFor +1;
            }
            System.out.println("");
            System.out.println("Switch -->");

            System.out.println("");
            System.out.println("Por favor ingrese una estación del año en minusculas");
            var estacion = entrada.next();

            switch (estacion){
                case"primavera":
                    System.out.println("Es primavera y la sangre se altera.");
                    break;
                case"verano":
                    System.out.println("Verano tiene una rima muy fea.");
                    break;
                case"otoño":
                    System.out.println("¿Tú también vas en otoño a Logroño?");
                    break;
                case"invierno":
                    System.out.println("Es como el infierno pero con frío.");
                    break;
                default:
                    System.out.println("Esto no es una estación del año. ¿A lo mejor es una de tren?");
            }
        }
    }

