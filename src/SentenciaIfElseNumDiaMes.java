
public class SentenciaIfElseNumDiaMes {

  public static void main(String[] args) {

    int mes = 2;
    int anio = 1988;

    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
      System.out.println("El mes tiene 31 días");
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
      System.out.println("El mes tiene 30 días");
    } else if (mes == 2) {
      if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
        System.out.println("El mes tiene 29 días");
      } else {
        System.out.println("El mes tiene 28 días");
      }
    } else {
      System.out.println("Mes no válido");
    }

  }

}
