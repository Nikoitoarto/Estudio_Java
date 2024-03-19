import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosConsole {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal= 0;

        try {
            //Integer.parseInt(numeroStr) para convertir el numero a entero
            numeroDecimal = scanner.nextInt();//esta line se encarga en convertir directamente a entero sin necesidad del parseint
        } catch (InputMismatchException e){//esta es la excepcion de el scanner de arriba
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

        System.out.println("Nikolas ardila es = " + mensaje);


        
        


    }
}
