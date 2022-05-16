package Sesion_2;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        int n;
        int[] vector = new int[100];
        Scanner leer = new Scanner(System.in);

        System.out.println("Cantidad de elementos del vector");
        n = leer.nextInt();
        for (int j = 0; j < n; j++) {
            System.out.println("valor del elemento " + (j + 1) + ": ");
            vector[j] = leer.nextInt();
        }
        System.out.println("Elementos del vector: ");
        for (int i = 0; i < n ; i++) {
            // System.out.println("valor en la posicion " + (i) + ": " + (vector[i]));
            System.out.println(vector[i]);
        }

    }
}
