import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosConsole {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        String numeroStr = scanner.nextLine();
        int numeroDecimal= 0;

        try {
            numeroDecimal = Integer.parseInt(numeroStr);//esta linea se hace para convertir el valor de tipo String a Númerico o INT
        } catch (NumberFormatException e){
            System.out.println("Error debe ingresar un número");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensajeBinario = " Numero binario " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        String mensajeOctal = "Numero octal de  = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        String mensajeHexa = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);


        //////////////////////////////

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexa;

        System.out.println(mensaje);


        
        


    }
}
