public class SentenciaDowhile {
  public static void main(String[] args) {

    int i = 0;

    while (i < 5) {
      System.out.println("i = " + i);
      i++;
    }

    i = 0;
    boolean prueba = true;

    while (prueba) {
      if (i == 5) {
        prueba = false;
      }

      System.out.println("i = " + i);
      i++;
    }

    System.out.println(prueba);

    prueba = false;
    while (prueba) {
      System.out.println("No se ejecuta");
    }

    prueba = true;
    i = 0;
    do {
      if (i == 5) {
        prueba = false;
      }
      System.out.println("i = " + i);
      i++;
    } while (prueba);

  }
}
