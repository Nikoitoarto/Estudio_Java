import java.util.Scanner;

public class NumeroMenorFor {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Cuantos numeros quiere ingresar: ");
    int cantidad = scanner.nextInt();

    int[] numeros = new int[cantidad];

    for (int i = 0; i < cantidad; i++) {
      System.out.println("numero: " + (i + 1));
      numeros[i] = scanner.nextInt();
    }

    scanner.close();

    int menor = numeros[0];

    for (int i = 1; i < numeros.length; i++) {
      if (numeros[i] < menor) {
        menor = numeros[i];
      }
    }
    System.out.println("El numero menor es: " + menor);
  }
}
