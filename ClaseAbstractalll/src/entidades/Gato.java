package entidades;

public class Gato extends Animal{

    //Constructor vacío
    public Gato() {
    }

    //Constructor con parametros(por buena practica), ya que en este caso lo haremos dinamico "Crearlo"
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    //Metodo heredado para crear un animal - Crear el gato
    @Override
    public void CrearAnimal() {
        super.CrearAnimal();
    }

    //Metodo heredado para mostrar los datos del animal (Gato)
    @Override
    public void MostrarDatos() {
        super.MostrarDatos();
    }

    //Metodo abstracto heredado e implementado con su accion 
    @Override
    public void Accion() {
        System.out.println("Miau"); //Le damos o implementamos su acción
    }
}
