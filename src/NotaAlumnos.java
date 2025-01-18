import java.util.Scanner;

public class NotaAlumnos {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantas notas quiere ingresar: ");
    int cantidadNotas = sc.nextInt();
    if (cantidadNotas > 20) {
      System.out.println("No puede ingresar mas de 20 notas");
    } else if (cantidadNotas < 1) {
      System.out.println("No puede ingresar menos de 1 nota");
      sc.close();
    } else if (cantidadNotas >= 1 && cantidadNotas <= 20) {
      double[] notas = new double[cantidadNotas];
      double suma = 0;
      double notasMayores5 = 0;
      double notasMenores4 = 0;
      int cantidadNotas5 = 0;
      int cantidadNotas4 = 0;
      int cantidadNotas1 = 0;
      for (int i = 0; i < cantidadNotas; i++) {
        System.out.println("Ingrese la nota " + (i + 1));
        notas[i] = sc.nextDouble();
        if (notas[i] <= 0 || notas[i] > 7) {
          System.out.println("la nota no puede ser Cero o mayor a 7");
          break;
        }
        if (notas[i] > 5) {
          notasMayores5 += notas[i];
          cantidadNotas5++;
        } else if (notas[i] < 4) {
          notasMenores4 += notas[i];
          cantidadNotas4++;
        }
        if (notas[i] == 1) {
          cantidadNotas1++;
        }

        suma += notas[i];
      }
      double promedio = suma / cantidadNotas;
      double promedio5 = notasMayores5 / cantidadNotas5;
      double promedio4 = notasMenores4 / cantidadNotas4;
      System.out.println("El promedio es: " + promedio);
      System.out.println("la cantidad de notas 1 es: " + cantidadNotas1);
      System.out.println("el promedio de notas mayores a 5 es: " + promedio5);
      System.out.println("el promedio de notas menores a 4 es: " + promedio4);

    }
  }
}
