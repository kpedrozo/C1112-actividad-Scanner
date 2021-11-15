package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        String nombre = lector.next();

        System.out.println("Ingresa tu apellido: ");
        String apellido = lector.next();

        System.out.println("Ingresa tu edad: ");
        Integer edad = lector.nextInt();

        System.out.println("Cual es tu hobbie? ");
        String hobbie = lector.next();

        System.out.println("Cual es tu editor de codigo preferido? ");
        String ide = lector.next();

        System.out.println("Cual es el sistema operativo que utilizas? ");
        String so = lector.next();

        System.out.println("Tu nombre completo es " + nombre + " " + apellido + " y tenes " + edad + " años.");
        System.out.println("Tu pasatiempo favorito es " + hobbie + ".");
        System.out.println("Actualmente preferis " + ide + " como IDE, y utilizar " + so +".");


    }
}


