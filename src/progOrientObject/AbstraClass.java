package progOrientObject;

import java.util.Scanner;

public class AbstraClass {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre");
        String nombre = scanner.nextLine();
        System.out.println("introduce la edad");
        int edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("introduce el tipo");
        String tipo = scanner.nextLine();
        System.out.println("introduce el aroma");
        String aroma = scanner.nextLine();
        System.out.println("Introduce color de unas");
        String unas = scanner.nextLine();

        Mujer daniela = new Mujer(nombre,edad,tipo,aroma,unas );
        System.out.println("el nombre de la persona es\u0020"+daniela.getNombre());
        System.out.println("la edad de la persona es\u0020" + daniela.getEdad());
        System.out.println("el tipo de la persona es\u0020" + daniela.getTipo());
        System.out.println("el aroma de la persona es\u0020" + daniela.getAroma());
        System.out.println("el color de las uñas es\u0020" + daniela.getUnas() );

        System.out.println("Introduce el nombre");
        String nombre1 = scanner.nextLine();
        System.out.println("introduce la edad");
        int edad1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("introduce el tipo");
        String tipo1 = scanner.nextLine();
        System.out.println("introduce el aroma");
        String aroma1 = scanner.nextLine();


        Hombre nikolas = new Hombre(nombre1,edad1,tipo1,aroma1); // le puedo dar las variables o los valores que yo quiera desde que coincida el espacio con el constructor
        System.out.println(nikolas.getNombre());
        System.out.println(nikolas.getEdad());
        System.out.println(nikolas.getTipo());
        System.out.println(nikolas.getAroma());
    }
}

abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String tipo;
    protected String aroma;

    public Persona(String nombre, int edad, String tipo, String aroma) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.aroma = aroma;
    }
    abstract public String getNombre();
    abstract public void setNombre(String nombre);
    abstract public String getAroma();
    abstract public void setAroma(String aroma);
    abstract public String getTipo();
    abstract public void setTipo(String tipo);
    abstract public int getEdad();
    abstract public void setEdad(int edad);
}

class Mujer extends Persona {

    private String unas;

    public Mujer(String nombre, int edad, String tipo, String aroma, String unas) {
        super(nombre, edad, tipo, aroma);
        this.unas = unas;
    }

    @Override
    public String getNombre(){
        return super.nombre;
    }

    @Override
    public void setNombre(String nombre) {
    }

    @Override
    public String getAroma() {
        return  super.aroma;
    }

    @Override
    public void setAroma(String aroma) {

    }

    @Override
    public String getTipo() {
        return super.tipo;
    }

    @Override
    public void setTipo(String tipo) {
    }

    @Override
    public int getEdad() {
        return super.edad;
    }

    @Override
    public void setEdad(int edad) {
    }

    public String getUnas(){
        return this.unas;
    }

    public void setUnas(String unas){
        this.unas = unas;
    }

    }


class Hombre extends Persona {

    public Hombre(String nombre, int edad, String tipo, String aroma) {
        super(nombre, edad, tipo, aroma);
    }

    @Override
    public String getNombre() {
        return super.nombre;
    }

    @Override
    public void setNombre(String nombre) {
    }

    @Override
    public String getAroma() {
        return super.aroma;
    }

    @Override
    public void setAroma(String aroma) {
    }

    @Override
    public String getTipo() {
        return super.tipo;
    }

    @Override
    public void setTipo(String tipo) {
    }

    @Override
    public int getEdad() {
        return super.edad;
    }

    @Override
    public void setEdad(int edad) {
    }
}
