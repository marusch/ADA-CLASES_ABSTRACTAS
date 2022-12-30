package entidades;

//Extendemos o heredamos de nuestra clase padre "Persona" sus atributos y metodos
public class Profesor extends Persona{

    //Constructor con parametros heredado
    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    //Metodo abstracto sobreescrito
    @Override
    public void Accion() {
        System.out.println("Mi nombre es " + nombre + " " + apellido + " Mi edad " + edad);
        System.out.println("Soy el profesor");
    }
}
