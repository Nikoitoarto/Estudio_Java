public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso==null;

        System.out.println("esNulo = " + esNulo);

        if(esNulo) {
            curso = "";
        }

        boolean esVacio = curso.length() == 0;

        if(esVacio == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al ".concat(curso));

        }



    }
}
