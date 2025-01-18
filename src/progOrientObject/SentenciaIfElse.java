package progOrientObject;

public class SentenciaIfElse {

    public static void main(String[] args) {


        float promedio = 3.8f;


        if(promedio >= 4.5){
            System.out.println("excelente promedio");
        }else if(promedio >= 3.5){
            System.out.println("muy buen promedio" );
        } else if (promedio >= 3.0) {
            System.out.println("casi pierdes");
        } else if (promedio >= 2.0) {
            System.out.println("perdiste la materia");

        }

    }
}
