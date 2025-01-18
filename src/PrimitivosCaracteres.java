public class PrimitivosCaracteres {
    public static void main(String[] args) {
        var caracter= '\u0040';
        char decimal=64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));
        
        var simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo == caracter));

        char espacio = '\u0020';//espacios
        char retroceso ='\b';//retroceso eliminar caracter anterior
        char tabulador = '\t'; //caracter de tabulador un espacio mas grande
        char nuevaLinea= '\n';//salto de linea
        char retornoCarro='\r';


        System.out.println("char corresponde en byte=" + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en byte=" + nuevaLinea + retornoCarro + Character.BYTES);
        System.out.println("char corresponde en bites = " + Character.SIZE);
        System.out.println("char MIN_VALUE = " + Character.MIN_VALUE);
        System.out.println("char MAS_VALUE = " + Character.MAX_VALUE);
    }
}
