import javax.swing.*;


public class OperadorAritmetico {

    
    public static void main(String[] args) {


        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("(i + j) = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);

        int multi = i * j;
        System.out.println("multi = " + multi);

        float div = (float)i / (float)j;
        System.out.println("div = " + div);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int resto1 = 10 % 6;
        System.out.println("resto1 = " + resto1);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("numero par =" + numero);
        }else{
            System.out.println("numero impar =" + numero);

        }

    }
}
