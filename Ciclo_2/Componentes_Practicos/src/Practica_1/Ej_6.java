package Practica_1;

import java.util.Scanner;

public class Ej_6 {
    public static void main(String[] args) {
        //Ejemplo 6: Estructura cíclica
        Scanner leer = new Scanner(System.in);
        System.out.print("Cantidad de tipos de producto: ");
        int tiposProducto = leer.nextInt();
        int total = 0;

        for (int i = 1; i <= tiposProducto; i++) {
            System.out.print("Cantidad del producto " + i + " :");
            int cantidadProducto = leer.nextInt();
            System.out.print("Valor unitario del producto " + i + " :");
            int valorUnitario = leer.nextInt();
            total += (cantidadProducto * valorUnitario);
        }
        System.out.println("El total de la factura es: " + total);
    }
}
