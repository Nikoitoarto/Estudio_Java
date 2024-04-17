public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        boolean esIgual = curso == curso2;//compara el metodo
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2);//compara el valor
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);//compara el valor aun asi no importa si esta en mayuscula o minuscula
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("esIgual = " + esIgual);




    }
}
