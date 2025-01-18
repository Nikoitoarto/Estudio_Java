import java.util.Scanner;

public class OperadorersLogicosLogin {
  public static void main(String[] args) {

    // primera forma de hacer arreglos.
    /*
     * String[] usernames = new String[3];
     * String[] passwords = new String[3];
     * usernames[0] = "nikolas";
     * passwords[0] = "12345";
     * usernames[1] = "admin";
     * passwords[1] = "Nikolas10*";
     * usernames[2] = "joaquin";
     * passwords[2] = "12345";
     */
    // segunda forma de hacer arreglos.

    String[] usernames = { "nikolas", "admin", "joaquin" };
    String[] passwords = { "12345", "Nikolas10*", "12345" };

    Scanner scanner = new Scanner(System.in);

    System.out.println("ingresar Usuario");
    String user = scanner.nextLine();

    System.out.println("ingresar la contraseña");
    String pass = scanner.nextLine();

    boolean esAutenticado = false;

    for (int i = 0; i < usernames.length; i++) {

      esAutenticado = (usernames[i].equals(user) && passwords[i].equals(pass)) ? true : esAutenticado;

      /*
       * if ((usernames[i].equals(user) && passwords[i].equals(pass))) {
       * esAutenticado = true;
       * break;
       * }
       */
    }
    if (esAutenticado) {
      System.out.println("Bienvenido ".concat(user).concat("!"));
    } else {
      System.out.println("Lo siento, requiere autenticacion");
    }

  }

}
