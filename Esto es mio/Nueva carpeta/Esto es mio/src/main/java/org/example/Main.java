package org.example;

import java.util.Scanner;

public class Main {



        public static void  main(String[]args) {

            String ceduladelComprador;
            String nombredelComprador;
            String apellidosdelComprador;
            int edaddelcomprador;
            int ciudaddelComprador;
            int numerodeboletasCompradas;

            Scanner teclado = new Scanner(System.in);


            //DATOS DE LAS VARIABLES-

            System.out.println("ingrese cedula del cliente:");
            ceduladelComprador = teclado.nextLine();

            System.out.println("ingrese nombre del comprador");
            nombredelComprador= teclado.nextLine();

            System.out.println("ingrese el apellido del comprador");
            apellidosdelComprador= teclado.nextLine();

            System.out.println("ingrese la edad del comprador");
            edaddelcomprador = teclado.nextInt();

            System.out.println("ingrese la ciudad del comprador");
            ciudaddelComprador = teclado.nextInt();

            System.out.println("ingrese numero de boletas compradas");
            numerodeboletasCompradas = teclado.nextInt();

            // verificar si el comprobante tiene 18

            Integer valorBoleta=45000;
            double valortotal=(valorBoleta*numerodeboletasCompradas);

            if (edaddelcomprador>=18 && numerodeboletasCompradas <= 3) {

                System.out.println("usted si puede comprar voletas:");
                System.out.println("el valor final es:135000");

            }  else {
                System.out.println("usted no puede comprar voletas");

                System.out.println("el valor final es:135000");
            } else {
                System.out.println("usted no puede comprar voletas:");


            }



            }




        }













