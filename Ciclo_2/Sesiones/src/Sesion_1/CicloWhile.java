package Sesion_1;

import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        //estructuras cíclicas
        boolean seguir = true;
        Scanner leer = new Scanner(System.in);

        while (seguir) {
            System.out.println("Continua el proceso de vacunacion?");
            String validacion = leer.nextLine();

            if (validacion.toUpperCase().equalsIgnoreCase("SEGUIR")) {
                System.out.println("continuamos...");
            } else {
                seguir = false;
                System.out.println("Terminamos...");
            }
        }


    }
}
