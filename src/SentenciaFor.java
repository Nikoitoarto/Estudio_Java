public class SentenciaFor {

  public static void main(String[] args) {

    int[] numeros = { 1, 2, 3, 4, 5 };

    for (int num : numeros) {
      System.out.println("num = " + num);
    }

    String[] nombres = { "Juan", "Pedro", "Maria", "Jose" };

    for (String nombre : nombres) {
      System.out.println("nombre = " + nombre);
    }

    // SentenciasBucleEtiquetas

    bucle1: for (int i = 0; i < 5; i++) {

      for (int j = 0; j < 5; j++) {
        if (i == 2) {
          continue bucle1;
        }
        System.out.println("i = " + i + ", j = " + j);
      }
    }
    System.out.println("\n===================================================");
    ;
    etiqueta: for (int i = 0; i < 5; i++) {

      for (int j = 0; j < 5; j++) {
        if (i == 2) {
          break etiqueta;
        }
        System.out.println("i = " + i + ", j = " + j);
      }
    }

  }

}
