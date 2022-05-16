package Practica_1;

import java.util.Scanner;

public class Ej_5 {
    public static void main(String[] args) {
        //ejemplo 5: Estructura dependiendo de o segun.
        Scanner leer = new Scanner(System.in);
        System.out.print("dia de la semana [1 - 7]: ");
        int diaSemana = leer.nextInt();
        System.out.print("Digitar total de la compra: ");
        int totalPagar = leer.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Total a pagar hoy lunes: " + totalPagar * (1 - 0.05));
                break;
            case 2:
                System.out.println("Total a pagar hoy martes: " + totalPagar * (1 - 0.03));
                break;
            case 3:
                System.out.println("Total a pagar hoy miercoles: " + totalPagar * (1 - 0.1));
                break;
            case 4:
                System.out.println("Total a pagar hoy jueves: " + totalPagar * (1 - 0.04));
                break;
            case 5:
                System.out.println("Total a pagar hoy viernes: " + totalPagar * (1 - 0.06));
                break;
            case 6:
                System.out.println("Total a pagar hoy sabado: " + totalPagar * (1 - 0.02));
                break;
            case 7:
                System.out.println("Total a pagar hoy domingo: " + totalPagar * (1 - 0.01));
                break;
        }
    }
}
