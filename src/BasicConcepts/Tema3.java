package BasicConcepts;

public class Tema3 {

    public static void main (String[] args) {

        suma(2, 4, 6);
        Coche miCoche = new Coche();

        miCoche.AnadirPuerta();
        System.out.println("El coche tiene " + miCoche.puertas + " puertas");
    }

    public static void suma (int a, int b, int c){

        int resultado = 0;
        resultado = a + b + c;

        System.out.println("la suma es " + resultado);
    }
}
class Coche {
  int puertas = 3;
  public void AnadirPuerta() {
        this.puertas++;
    }
}

