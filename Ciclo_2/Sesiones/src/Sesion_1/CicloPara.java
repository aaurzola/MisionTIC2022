package Sesion_1;

import java.util.Scanner;

public class CicloPara {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de personas a vacunarse: ");
        int personas = leer.nextInt();
        for (int i = 0; i <= personas; i++) {
            System.out.println("Vacunada persona: " + i);
        }
        System.out.println("Terminamos");
    }
}
