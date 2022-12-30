package entidades;

public abstract class Persona {

    //Atributos
    protected String nombre;
    protected String apellido;
    protected int edad;

    //Constructor con parametros
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Metodo abstracto
    public abstract void Accion();


}
