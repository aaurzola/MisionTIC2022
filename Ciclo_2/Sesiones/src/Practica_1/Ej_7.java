package Practica_1;

import java.util.Scanner;

public class Ej_7 {
    public static void main(String[] args) {
        //Ejemplo 7: Integración estructuras condicionales y cíclicas (while if-else) (for if-else)
        Scanner leer = new Scanner(System.in);
        double totalVendido = 0;
        boolean atenderCliente = true;
        int contadorClientes = 0;

        while (atenderCliente) {
            contadorClientes ++;
            System.out.println("Cliente: " + contadorClientes);
            int subTotalCompraCliente = 0;
            System.out.print("Cantidad de tipos de producto: ");
            int tiposProducto = leer.nextInt();
            for (int i = 1; i <= tiposProducto; i++) {
                System.out.print("Cantidad del producto " + i + ":");
                int cantidadProducto = leer.nextInt();
                System.out.print("Valor unitario del producto " + i + ":");
                int valorUnitario = leer.nextInt();
                subTotalCompraCliente += (cantidadProducto * valorUnitario);
            }
            if (subTotalCompraCliente > 100000) {
                double totalPagarCliente = subTotalCompraCliente * (1 - 0.1);
                System.out.println("El total de la factura es: " + totalPagarCliente);
                totalVendido += totalPagarCliente;
            } else {
                System.out.println("El total de la factura es: " + subTotalCompraCliente);
                totalVendido += subTotalCompraCliente;
            }

            /* No se realizarán validaciones acerca del control que se tendra sobre los posibles inputs del usuario
            únicamente 1 para continuar y 0 para detenerse */
            System.out.print("Seguir atendiendo clientes? [1: SI/ 0: NO]: ");
            int flag = leer.nextInt();
            if (flag == 0) {
                atenderCliente = false;
            }
        }
        System.out.println("El total vendido por la empresa fue de: " + totalVendido);
    }
}
