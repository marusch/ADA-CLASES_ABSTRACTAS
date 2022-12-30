import entidades.Gato;

public class Main {
    public static void main(String[] args) {

        //No se puede instanciar la clase Padre "Animal", ya que es abstracta y cobra sentido la herencia

        //Creamos nuestra instancia de la clase hija "Gato"
        Gato gato = new Gato();
        gato.CrearAnimal(); //Creamos el animal, heredamos el metodo de la clase Padre "Animal"
        gato.MostrarDatos();//Mostramos con un metodo heredado de la clase Padre "Animal"
        gato.Accion();//Vemos su accion con su metodo abstracto implementado

    }
}