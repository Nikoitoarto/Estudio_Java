public class PrimitivosEnteros {
    public static void main(String[] args) {
        
        byte numeroByte=127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor máximo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo Short corresponde en byte a " + Short.BYTES);
        System.out.println("Tipo Short corresponde en bites a " + Short.SIZE);
        System.out.println("valor máximo de un Short: " + Short.MAX_VALUE);
        System.out.println("valor máximo de un Short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor máximo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L; //se implementa la L para que se vea long ya que sin la L da error
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor máximo de un lon: " + Long.MIN_VALUE);

        var numeroVar = 2147483648L;
        System.out.println("numeroVar = " + numeroVar);
        //El var sirve para soportar todas las variables sean texto, número, o booleano.

    }
}
