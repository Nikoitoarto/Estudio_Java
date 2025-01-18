import javax.swing.*;

public class NombreLargo {
    public static void main(String[] args) {

        String nombreApellido1 = JOptionPane.showInputDialog("primer persona ingrese su nombre completo");
        String nombreApellido2 = JOptionPane.showInputDialog("segunda persona ingrese su nombre completo");
        String nombreApellido3 = JOptionPane.showInputDialog("tercera persona ingrese su nombre completo");

        String[] nombre1 = nombreApellido1.split(" ");
        String[] nombre2 = nombreApellido2.split(" ");
        String[] nombre3 = nombreApellido3.split(" ");

        String primerNombre = nombre1[0];
        String segundNombre = nombre2[0];
        String tercerNombre = nombre3[0];


        // String nombreLargo = (primerNombre.length() > segundNombre.length() && primerNombre.length() > tercerNombre.length() ) ? primerNombre : (segundNombre.length() > tercerNombre.length() ? segundNombre : tercerNombre);

        //  System.out.println("el nombre mas largo es: " + nombreLargo);

        if (primerNombre.length() > segundNombre.length() && primerNombre.length() > tercerNombre.length()) {
            System.out.println("el nombre mas largo es: " + primerNombre);
        } else if (segundNombre.length() > tercerNombre.length()) {
            System.out.println(" el nombre mas largo es: " + segundNombre);
        }else System.out.println("el nombre mas largo es: = " + tercerNombre);

    }


    class carro {
        private String nombre;
        private int velocidad;


        public carro(String nombre, int velocidad) {
            this.nombre = nombre;
            this.velocidad = velocidad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }


    }
}
