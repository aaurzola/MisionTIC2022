package Practica_1;

import java.util.Scanner;

public class Ej_2 {
    public static void main(String[] args) {
        //Ejemplo 2: Estructura condicional doble
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad actual en la Bodega: ");
        int cantidadBodega = leer.nextInt();
        System.out.print("Cantidad minima requerida: ");
        int cantidadRequerida = leer.nextInt();

        if (cantidadRequerida > cantidadBodega) {
            System.out.println("Se requiere realizar pedido al proveedor");
        } else {
            System.out.println("No se requiere realizar pedido al proveedor");
        }
    }
}