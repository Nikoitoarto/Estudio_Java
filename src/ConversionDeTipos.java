public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt= Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //convertir un tipo primitivo a convertir a String:

        int otroNumeroInt = 100;

        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble= 1.23456;
        String otroRealStr = Double.toString(otroRealDouble);// primera manera de convertir de primitivo a String
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);
        
        float otroFloat = 1.2345f;
        String real = String.valueOf(otroFloat); //Segunda manera de convertir de primitivo a String.
        System.out.println("real = " + real);

        //conversión de datos de primitivos a primitivos.

        int i=1000;
        short  s =(short) i;
        System.out.println("s = " + s);

    }
}
