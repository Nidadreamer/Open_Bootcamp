package BasicConcepts;

public class Tema4 {

    public static void main(String[] args) {
//ejercicio 1
        int numero = -4;

        if (numero < 0) {
            System.out.println("El valor del ejercicio if, es negativo");
        }

        else if (numero > 0) {
            System.out.println("El valor del ejercicio if, es positivo");
        }

        else {
            System.out.println("El valor del ejercicio if, es CERO");
        }

//ejercicio 2
        int buclenum = 1;

        while (buclenum < 3){
            System.out.println ("Valor del while es " + buclenum);
            buclenum = buclenum + 1;
//otra opción de suma "buclenum++;"
        }

//ejercicio 3
        int donum = 3;

        do {
            donum = donum + 1;
            System.out.println ("Valor de do es " + donum);
        }
        while (donum < 3);

//ejercicio 4
        for (int fornum = 0; fornum <= 3; fornum++){
            System.out.println ("El valor de for es " + fornum);
        }

//ejercicio 5
        var estacion = "Primavera";

        switch (estacion){
            case "Primavera":
                System.out.println ("La primavera, la sangre altera");
                break;

            case "Verano":
                System.out.println ("Quien en verano no bebe sangría, poco entiende de bebida");
                break;

            case "Otoño":
                System.out.println ("Otoño lluvioso, año copioso");
                break;

            case "Invierno":
                System.out.println ("Cochino matado, invierno solucionado");
                break;

            default:
                System.out.println ("Lo sentimos pero los mejores refranes son solo para las estaciones del año");
        }

    }
}