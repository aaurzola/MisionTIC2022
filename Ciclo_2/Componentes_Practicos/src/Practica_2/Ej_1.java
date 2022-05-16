package Practica_2;

import java.util.Scanner;

public class Ej_1 {
    public static void main(String[] args) {

        //leer la entrada para el arreglo de listas de codigos de una sola linea separada por espacios
        //input:354 256 127
        int[] codigos = new int[3];
        Scanner leer = new Scanner(System.in);
        System.out.println("linea de valores de codigos: ");
        for (int i = 0; i < 3; i++) {
            codigos[i] = leer.useDelimiter("\\s+").nextInt();
        }

        /* leer la entrada para el arreglo de la cantidad de productos en bodega de una sola linea
        separada por espacios y puntos y comas. */
        // input: 17 34 60;14 31 65;45 2 12;56 43 8;

        int[][] tablaProductos = new int[4][3];
        Scanner userInput = new Scanner(System.in);
        System.out.println("linea de valores de la tabla de productos en bodega: ");
        userInput.useDelimiter(";");
        String linea;

        for (int i = 0; i < 4; i++) {
            linea = userInput.next();
            Scanner scannerSpaces = new Scanner(linea).useDelimiter("\\s+");
            for (int j = 0; j < 3; j++) {
                tablaProductos[i][j] = scannerSpaces.nextInt();
            }
        }

        /* Leer la entrada para el arreglo de la cantidad de productos solicitados de una sola línea
        separada por espacios y puntos y comas. */
        //input: 14 44 76;10 51 15;46 23 2;89 4 18;

        int[][] tablaRequeridos = new int[4][3];
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("linea de valores de la tabla de productos requeridos: ");
        userInput2.useDelimiter(";");
        String linea2;

        for (int i = 0; i < 4; i++) {
            linea2 = userInput2.next();
            Scanner scannerSpaces = new Scanner(linea2).useDelimiter("\\s+");
            for (int j = 0; j < 3; j++) {
                tablaRequeridos[i][j] = scannerSpaces.nextInt();
            }
        }

        //identificar los codigos de los productos que se deben realizar pedidos especificando el número de la sede
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3 ; j++) {
                if(tablaProductos[i][j] < tablaRequeridos[i][j]) {
                    switch (j) {
                        case 0 -> System.out.println("Se debe solicitar producto " + codigos[0] + " en sede " + i);
                        case 1 -> System.out.println("Se debe solicitar producto " + codigos[1] + " en sede " + i);
                        case 2 -> System.out.println("Se debe solicitar producto " + codigos[2] + " en sede " + i);
                    }
                }
            }
        }
        //calcular promedios de productos en bodegas
        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += tablaProductos[j][i];
            }
            System.out.println("el promedio de productos del codigo " + codigos[i] + " es de " + suma / 4);
        }
    }
}
