public class OperadorInstanceOfTiposGenericos {


    public static void main(String[] args) {

        Object texto = "creando un objeto de la clase String";

        Number num =7;

        Integer enume = 7;

        boolean b1 = texto instanceof String;

        System.out.println("Texto es de tipo =" + b1);

        b1 = num instanceof Object;

        System.out.println("num es de tipo number = " + b1);

        b1 = num instanceof Integer;

        System.out.println("num es tipo Number = " + b1);


        
    }
}

