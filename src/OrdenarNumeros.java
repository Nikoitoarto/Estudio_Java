import java.util.Scanner;

public class OrdenarNumeros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = sc.nextInt();

        String resultado = num > num2 ? num + " y " + num2 : num2 + " y " + num;
        System.out.println("El orden es: " + resultado);


        int a = num > num2 ? num : num2;
        int b = num > num2 ? num2 : num;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }

}

