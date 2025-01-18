import java.util.Scanner;

public class OperadorTernario {
  public static void main(String[] args) {

    String variable = 7 == 8 ? "si_es verdadero" : "si es_falso";
    System.out.println("variable = " + variable);

    Scanner s = new Scanner(System.in);

    System.out.println("Ingresar nota de matematicas");
    double matematicas = s.nextDouble();
    System.out.println("ingresar nota de ciencias");
    double ciencias = s.nextDouble();
    System.out.println("ingresar nota de sociales");
    double sociales = s.nextDouble();

    double promedio = 0.0;
    promedio = (matematicas + sociales + ciencias) / 3;
    System.out.println("promedio = " + promedio);

    String estado = "";

    estado = promedio >= 3.0 ? "si aproobo" : "no aprobo";
    System.out.println("estado = " + estado);

  }
}
