public class EjemploStringMetodos {

    public static void main(String[] args) {

        /* int[] nikolas = {24, 15, 23, 34, 45};
         for(int i = 0; i < nikolas.length; i++){
             System.out.println("Elemento en el índice " + i + ": " + nikolas[i]);
         }
        System.out.println("nikolas.length = " + nikolas.length);
        */

        String nombre = "Nikolas";
        System.out.println("nombre = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Nikolas\") = " + nombre.equals("Nikolas"));
        System.out.println("nombre.equals(\"nikolas\") = " + nombre.equals("nikolas"));
        System.out.println("nombre.equalsIgnoreCase(\"nikolas\") = " + nombre.equalsIgnoreCase("nikolas"));
        System.out.println("nombre.compareTo(\"\") = " + nombre.compareTo("Nikolas"));
        System.out.println("nombre.compareTo(\"Ardila\") = " + nombre.compareTo("Ardila"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(0,7) = " + nombre.substring(0,7));
        
        String trbalenguas = "trabalenguas";
        System.out.println("trbalenguas = " + trbalenguas.replace("a","."));
        System.out.println("trbalenguas.indexOf(\"a\") = " + trbalenguas.indexOf('a'));
        System.out.println("trbalenguas.lastIndexOf(\"a\") = " + trbalenguas.lastIndexOf("a"));
        System.out.println("trbalenguas.contains(\"t\") = " + trbalenguas.contains("lenguas"));
        System.out.println("trbalenguas.startsWith(\"lenguas\") = " + trbalenguas.startsWith("traba"));
        System.out.println("trbalenguas.endsWith(\"lenguas\") = " + trbalenguas.endsWith("lenguas"));
        System.out.println("    trabalenguas   ".trim());
        System.out.println("  trabalenguas  ");

    }


}
