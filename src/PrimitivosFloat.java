public class PrimitivosFloat {


    public static void main(String[] args) {

        float realFloat = 1.5e-10f; //se implementa la F ya que sin la f no puede ser float y este lo ve como double.
        System.out.println("realFloat = " + realFloat);
        System.out.println("Float corresponde a Byte. = " + Float.BYTES);
        System.out.println("Float corresponde en bites. = " + Float.SIZE);
        System.out.println("Máximo valor para Float. = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para Float. = " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde a Byte. = " + Double.BYTES);
        System.out.println("double corresponde en bites. = " + Double.SIZE);
        System.out.println("Máximo valor para double. = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double. = " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);

    }
}
