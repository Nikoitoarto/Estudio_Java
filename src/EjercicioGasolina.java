import java.util.Scanner;

public class EjercicioGasolina {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //pedir en consola la medida actual en litros


        System.out.println("Ingrese la medida en litros del estanque de gasolina: ");
        double gasolina = sc.nextDouble();

        /*
        if (gasolina > 70) {
            System.out.println("El valor ingresado excede la capacidad del tanque");
        }
        else if (gasolina == 70) {
            System.out.println("El estanque esta lleno");
        }
        else if (gasolina >= 60 ) {
            System.out.println("Estanque casi lleno");
        }
        else if (gasolina >= 40) {
            System.out.println("estanque 3/4");
        }
        else if (gasolina >= 35) {
            System.out.println("medio estanque");

        else if (gasolina >= 20) {
            System.out.println("suficiente");
        }
        else if (gasolina >= 1) {
            System.out.println(" insuficiente" );
        }else System.out.println(" valor invalido");
        */

        // Usar el operador ternario para determinar el mensaje
        String mensaje = (gasolina > 70) ? "El valor ingresado excede la capacidad del tanque" :
                (gasolina == 70) ? "El estanque está lleno" :
                        (gasolina >= 60) ? "Estanque casi lleno" :
                                (gasolina >= 40) ? "Estanque 3/4" :
                                        (gasolina >= 35) ? "Medio estanque" :
                                                (gasolina >= 20) ? "Suficiente" :
                                                        (gasolina >= 1)  ? "Insuficiente" :
                                                                "Valor inválido";

        System.out.println(mensaje);
    }



}
