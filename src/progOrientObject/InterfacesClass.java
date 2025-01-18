public class InterfacesClass {

    public static void main(String[] args) {

    NumeroAnimal numeroAnimal = new NumeroAnimal();
    EjecutarLeon(numeroAnimal);
   }

    public static void EjecutarLeon (Animal animal) {
        animal.Leon(5);
    }

}


interface Animal{
    void Leon (int cuantosLeones);
    void Perro (int cuantosPerros);
}


class NumeroAnimal implements Animal{

    public void Leon (int cuantosLeones){
        System.out.println("Total de Leones");
    }

    public void Perro (int cuantosPerros){
        System.out.println("Total de perros");
        
    }
}