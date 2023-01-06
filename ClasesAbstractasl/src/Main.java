import entidades.Carnivoro;
import entidades.Herbivoro;

public class Main {
    public static void main(String[] args) {

        //No vamos a poder instanciar nuestra clase Padre "Animal",
        //ya que lo denominamos como abstracto, dando asi sentido a la herencia.

        //Instanciamos la clase hija "Herbivoro", creando un objeto.
        Herbivoro herbivoro = new Herbivoro();
        herbivoro.alimentarse(); //Metodo abstracto implementado


        //Instanciamos la clase hija "Carnivoro", creando un objeto.
        Carnivoro carnivoro = new Carnivoro();
        carnivoro.alimentarse();//Metodo abstracto implementado



    }
}