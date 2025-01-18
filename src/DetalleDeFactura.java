import java.util.InputMismatchException;
import java.util.Scanner;


public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el nombre de la factura");
        String numeroFactura = scanner.nextLine();


        double valorFactura = 0;
        System.out.println("Ingrese el precio");
        try {
            valorFactura = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un número decimal");
            main(args);
            System.exit(0);
        }

        double valorFactura2 = 0;
        System.out.println("Ingrese el precio 2");
        try {
            valorFactura2 = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un número decimal");
            main(args);
            System.exit(0);
        }

        double totalValor = valorFactura + valorFactura2;
        double impuesto = totalValor * 0.19;
        double total = totalValor + impuesto;

        System.out.println("La factura producto de oficina tiene un total bruto de: " + totalValor + "\ncon impuesto de " + impuesto + "\ny el monto después de impuesto es de: " + total);






    }
}
