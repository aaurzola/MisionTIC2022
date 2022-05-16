package Sesion_2;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de filas: ");
        int filas = leer.nextInt();
        System.out.println("Cantidad de columnas: ");
        int columnas = leer.nextInt();

        int[][] matriz = new int [filas][columnas];

        //llenar una matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Matriz [" + i +"]["+j+"]: ");
                matriz[i][j] = leer.nextInt();
            }
        }
        //imprimir una matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Matriz [" + i +"]["+j+"]: " + matriz[i][j]);
            }
        }
    }
}
