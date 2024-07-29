public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "imagen.nikolas.xls";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(7) = " + archivo.substring(i+1));

    }
}
