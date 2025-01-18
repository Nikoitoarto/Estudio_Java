import java.util.Scanner;

public class MultplicarSinSigno {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el primer numero: ");
    int numero1 = scanner.nextInt();
    System.out.println("Ingrese el segundo numero: ");
    int numero2 = scanner.nextInt();
    scanner.close();

    int resultado = 0;
    for (int i = 0; i < numero2; i++) {
      resultado += numero1;
    }
    System.out.println("El resultado de la multiplicacion es: " + resultado);
  }
}
