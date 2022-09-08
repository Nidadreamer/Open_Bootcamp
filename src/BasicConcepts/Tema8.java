package BasicConcepts;

public class Tema8 {

    public static void main(String[] args) {
        Persona miPersona = new Persona();
        miPersona.setEdad(40);
        miPersona.setNombre("Noa");
        miPersona.setTelf(34666999666l);
        System.out.println(("Mi nombre es ") + miPersona.getNombre() + (", tengo ") + miPersona.getEdad() + (" años y mi telefono es ") + miPersona.getTelf());
    }
}


class Persona {

    private int edad;
    private String nombre;
    private long telf;

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTelf (long telf) {
        this.telf = telf;
    }

    public long getTelf(){
        return telf;
    }

}