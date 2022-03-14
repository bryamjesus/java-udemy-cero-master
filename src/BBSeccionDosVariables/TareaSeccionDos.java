package BBSeccionDosVariables;

import java.util.Scanner;

public class TareaSeccionDos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cliente = "", codigo = "";
        double productoUno = 0, productoDos = 0, totalBruto = 0, impuesto = 0, precioTotal = 0;

        //
        System.out.println("Ingrese datos de la factura");
        try {
            System.out.println("Ingrese codigo de la factura: ");
            codigo = scanner.nextLine();
            System.out.println("Ingrese nombre del cliente: ");
            cliente = scanner.nextLine();
            System.out.println("Ingrese el precio del primer producto: ");
            productoUno = scanner.nextDouble();
            System.out.println("Ingrese el precio del segundo producto: ");
            productoDos = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error al momento de ingresar los datos");
            main(args);
            System.exit(0);
        }

        totalBruto = productoUno + productoDos;
        impuesto = totalBruto * 0.18;
        precioTotal = totalBruto + impuesto;

        String mensaje = "La factura con código " + codigo + " del cliente " + cliente
                + " \ntiene un total en bruto de " + totalBruto
                + "\n Impuesto (18%): " + impuesto
                + "\n Precio total: " + precioTotal;

        System.out.println(mensaje);
    }
}
