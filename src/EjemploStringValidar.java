import javax.sound.midi.Soundbank;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso==null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = "programacion Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();

        System.out.println("esVacio2 = " + esVacio2);

        if(!curso.isEmpty()){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al ".concat(curso));

        }
    }
}
