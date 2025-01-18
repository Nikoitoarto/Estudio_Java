import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        //La siguiente linea es para poder mostrar un mensaje por mediante una ventana una vista de entrada para que el usuario
        //ingrese un valor
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");
        int numeroDecimal=0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);//esta linea se hace para convertir el valor de tipo String a Númerico o INT
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        ///////////////////////
        String mensajeBinario = " Numero binario " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensajeBinario);//interpretar en numero binario en tipo string

        int numeroBinario = 0b111110100;//se tiene que implementar en el número binario un "0b" para que lo interprete como binario y no entero.
        System.out.println("numeroBinario = " + numeroBinario);

        String mensajeOctal = "Numero octal de  = " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(mensajeOctal);
        
        int numeroOctal = 0764; //se antepone el 0 para que sea un valor octal
        System.out.println("numeroOctal = " + numeroOctal);

        String mensajeHexa = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(mensajeHexa);

        int numeroHex = 0x1f4; //se antepone el 0x para que sea un numero hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        //////////////////////////////

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje += "\n" + mensajeHexa;

        JOptionPane.showMessageDialog(null,mensaje);//esta linea es para que arroje un mensaje en pantalla



        
        


    }
}
