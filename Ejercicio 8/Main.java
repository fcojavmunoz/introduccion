import javax.xml.namespace.QName;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Javier");
        persona.setEdad(44);
        persona.setTelefono(666777888);

        System.out.println("Nombre: "+persona.getNombre()
        + " edad: " + persona.getEdad() + " telefono: " + persona.getTelefono());
    }
}

class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}
