package entidades;
import java.util.Scanner;

//Clase Abstracta, ¿Para que? Para que no sea instanciada y aplicar bien herencia
public abstract class Animal {

    //Atributos
    protected String nombre;
    protected int edad;

    //Constructor vacío
    public Animal() {
    }

    //Constructor con parametros
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo comun para crear un animal
    public void CrearAnimal() {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("¿Cual es el nombre del animal?");
        nombre = input.nextLine();

        System.out.println("¿Cuantos años tiene?");
        edad = input.nextInt();
    }

    //Metodo comun para mostrar los datos del animal
    public void MostrarDatos(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("Tiene " + edad + " años");
    }

    //Metodo abstracto para heredarlo e implementarlo
    public abstract void Accion();
}
