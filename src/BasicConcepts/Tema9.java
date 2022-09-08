package BasicConcepts;

public class Tema9 {

    public static void main(String[] args) {

        Cliente miCliente = new Cliente();
        miCliente.setEdad(52);
        miCliente.setNombre("Pepe");
        miCliente.setTelf(34666999555l);
        miCliente.setCredito(240);
        System.out.println(("Mi cliente es ") + miCliente.getNombre() + (", tiene ") + miCliente.getEdad() + (" años y su telefono es ") + miCliente.getTelf());
        System.out.println(("Su credito es de: ") + miCliente.getCredito() + "€");

        Trabajador miKurrante = new Trabajador();
        miKurrante.setEdad(26);
        miKurrante.setNombre("Marta");
        miKurrante.setTelf(34111222333l);
        miKurrante.setSalario(1500);
        System.out.println(("Mi trabajador es ") + miKurrante.getNombre() + (", tiene ") + miKurrante.getEdad() + (" años y su telefono es ") + miKurrante.getTelf());
        System.out.println(("Su salario es de: ") + miKurrante.getSalario() + "€");
    }
}

class Persona2 {

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

class Cliente extends Persona2 {
    private int credito;

    public void setCredito (int credito) {
        this.credito = credito;
    }
    public int getCredito(){
        return credito;
    }

}

class Trabajador extends Persona2 {
    private int salario;

    public void setSalario (int salario) {
        this.salario = salario;
    }
    public int getSalario(){
        return salario;
    }

}
