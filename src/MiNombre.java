public class MiNombre {

  public static void main(String[] args) {

    String saludo = "hola buenas tardes";
    System.out.println(saludo);
    int numero = 10;
    int numero2 = 5;

    boolean valor = true;
    if (valor) {
      System.out.println("numero = " + numero);
      numero2 = 10;

      System.out.println("numeroo2=" + numero2);

      String nombre;

      if (numero > 16) {
        nombre = "juan";

      } else {

        nombre = "Nikolas";
      }
      System.out.println("nombre = " + nombre);
    }

  }
}
