package Practica_1;

import java.util.Scanner;

public class Ej_4 {
    public static void main(String[] args) {
        //Ejemplo 4: Estructura condicional anidada
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad actual en la Bodega: ");
        int cantidadBodega = leer.nextInt();
        System.out.print("Cantidad minima requerida: ");
        int cantidadRequerida = leer.nextInt();

        if (cantidadRequerida > cantidadBodega) {
            System.out.println("Se requiere realizar pedido al proveedor");
            System.out.print("Cantidad de unidades deseada: ");
            int cantidadCompra = leer.nextInt();
            System.out.print("Valor unitario del producto: ");
            int valorUnitario = leer.nextInt();
            System.out.print("Valor disponible en caja: ");
            int valorCaja = leer.nextInt();
            if((cantidadCompra * valorUnitario) < valorCaja) {
                System.out.println("Fondos suficientes. Si es posible realizar el pedido.");
            } else {
                System.out.println("Fondos insuficientes. No es posible realizar el pedido.");
            }
        } else if (cantidadBodega - cantidadRequerida < 10) {
            System.out.println("Cantidad de unidades que hace falta vender: " + (cantidadBodega - cantidadRequerida));
            System.out.println("Alerta! \nUnidades en bodega menor a 10");
        } else {
            System.out.println("No se requiere realizar pedido al proveedor");
            System.out.println("Cantidad de unidades que hace falta vender: " + (cantidadBodega - cantidadRequerida));
        }
    }

}
