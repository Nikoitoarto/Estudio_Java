import java.util.Scanner;

public class EjercicioFamilia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un nombre de un familiar");
        String nombreA = scanner.nextLine();
        String nombreA2 = nombreA.toUpperCase().charAt(1) + "." + nombreA.substring(nombreA.length()-2) ;

        System.out.println("ingrese un nombre de un familiar");
        String nombreB = scanner.nextLine();
        String nombreB2 = nombreB.toUpperCase().charAt(1) + "." + nombreB.substring(nombreB.length()-2);

        System.out.println("ingrese un nombre de un familiar");
        String nombreC = scanner.nextLine();
        String nombreC2 = nombreC.toUpperCase().charAt(1) + "." + nombreC.substring(nombreC.length()-2);

        System.out.println(nombreA2 + "_" + nombreB2 + "_" + nombreC2);

        int nikolas = 5;
        int ardila = 4;

        nikolas += ardila;

        System.out.println(nikolas);

    }
}
