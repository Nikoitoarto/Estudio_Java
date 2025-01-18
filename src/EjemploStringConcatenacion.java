public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Nikolas Ardila";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);//procedencia de los operadores.
        System.out.println(detalle + (numeroA + numeroB));//cuando se pone entre  parentecis este si suma por los operadores.
        System.out.println(numeroA + numeroB + detalle);// de esta manera se puede realizar la operacion pero sin concatenar dejando detallede ultimo
        
        
        String detalle2 = curso.concat(" con ".concat(profesor));//metodo concat nos permite concatenar string
        String detalle3 = curso.concat(" con ").concat(profesor);//metodo concat nos permite concatenar string
        String detalle4 = curso.concat(profesor); //metodo concat nos permite concatenar string
        System.out.println("detalle2 = " + detalle2);
        System.out.println("detalle3 = " + detalle3);
        System.out.println("detalle4 = " + detalle4);


    }
}
