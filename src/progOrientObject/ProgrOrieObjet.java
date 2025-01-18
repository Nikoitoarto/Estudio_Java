import java.util.Scanner;

public class ProgrOrieObjet  {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce el nombre del coche");
        String nombre = scanner.nextLine();
        System.out.println("introduce el numero de puertas");
        int puertas = scanner.nextInt();
        System.out.println("introduce la velocidad inicial");
        int velocidadinicial = scanner.nextInt();
        System.out.println("introduce la velocidad final");
        int velocidadFinal = scanner.nextInt();
        System.out.println("introduce la rapidez del vehiculo");
        int rapidez = scanner.nextInt();
        
        
        Vehiculo coche = new Vehiculo(nombre,puertas,velocidadinicial,velocidadFinal, rapidez);
        System.out.println(coche.getNombre());
        System.out.println(coche.getPuertas());
        System.out.println(coche.getVelocidadinicial());
        System.out.println(coche.getVelocidadFinal());
        if (coche.getRapidez() >= 100){
            coche.setRapido(true);
        }else {
            coche.setRapido(false);
        }
        System.out.println(coche.isRapido());

        Carro chevrolet = new Carro();
        chevrolet.setNombre("Chevrolet");
        System.out.println(chevrolet.getNombre());
        chevrolet.setPuertas(3);

    }
}
class Vehiculo {
    private String nombre;
    private int puertas;
    private float velocidadinicial;
    private int velocidadFinal;
    private int rapidez;
    private boolean rapido;


    public  Vehiculo(String nombre, int puertas, float velocidadinicial, int velocidadFinal, int rapidez) {
        this.nombre = nombre;
        this.puertas = puertas;
        this.velocidadinicial = velocidadinicial;
        this.velocidadFinal = velocidadFinal;
        this.rapidez = rapidez;
    }
    public Vehiculo() {
        this.nombre = nombre;
        this.puertas = puertas;
        this.velocidadinicial = velocidadinicial;
        this.velocidadFinal = velocidadFinal;
    }

    public boolean isRapido() {
        return rapido;
    }

    public void setRapido(boolean rapido) {
        this.rapido = rapido;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public float getVelocidadinicial() {
        return velocidadinicial;
    }

    public void setVelocidadinicial(float velocidadinicial) {
        this.velocidadinicial = velocidadinicial;
    }

    public int getVelocidadFinal() {
        return velocidadFinal;
    }

    public void setVelocidadFinal(int velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }
}

class Carro extends Vehiculo{
}


