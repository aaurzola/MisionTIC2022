package Practica_1;

import java.util.Scanner;

public class Ej_1 {
    public static void main(String[] args) {
        //Ejemplo 1: Estructura condicional simple
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad actual en la Bodega: ");
        int cantidadBodega = leer.nextInt();
        System.out.print("Cantidad minima requerida: ");
        int cantidadRequerida = leer.nextInt();

        if (cantidadRequerida > cantidadBodega) {
            System.out.println("Se requiere realizar pedido al proveedor");
        }
        if (cantidadRequerida < cantidadBodega){
            System.out.println("No se requiere realizar pedido al proveedor");
        }
    }
}
