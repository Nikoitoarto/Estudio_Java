public class OperadorInstanceOF {
    public static void main(String[] args) {

        String texto = "creando un objeto de la clase String";

        Integer num = 7;

        boolean b1 = texto instanceof String;

        System.out.println("Texto es de tipo =" + b1);

        b1 = texto instanceof String;

        System.out.println("b1 = " + b1);



    }
}
