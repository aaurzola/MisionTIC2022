package Practica_1;

import java.util.Scanner;

public class Ej_3 {
    public static void main(String[] args) {
        //Ejemplo 3: Estructura condicional doble
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad actual en la Bodega: ");
        int cantidadBodega = leer.nextInt();
        System.out.print("Cantidad minima requerida: ");
        int cantidadRequerida = leer.nextInt();

        if (cantidadRequerida > cantidadBodega) {
            System.out.println("Se requiere realizar pedido al proveedor");
        } else if (cantidadBodega - cantidadRequerida < 10) {
            System.out.println("No se requiere realizar pedido al proveedor");
            System.out.println("Cantidad de unidades que hace falta vender: " + (cantidadBodega - cantidadRequerida));
            System.out.println("Alerta! \nUnidades en bodega menor a 10");
        } else {
            System.out.println("No se requiere realizar pedido al proveedor");
        }
    }
}
