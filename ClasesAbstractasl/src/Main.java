import entidades.Animal;
import entidades.Carnivoro;
import entidades.Herviboro;

public class Main {
    public static void main(String[] args) {

        //No vamos a poder instanciar nuestra clase Padre "Animal",
        //ya que lo denominamos como abstracto, dando asi sentido a la herencia.

        //Instanciamos la clase hija "Herviboro", creando un objeto.
        Herviboro herviboro = new Herviboro();
        herviboro.alimentarse(); //Metodo abstracto implementado


        //Instanciamos la clase hija "Carnivoro", creando un objeto.
        Carnivoro carnivoro = new Carnivoro();
        carnivoro.alimentarse();//Metodo abstracto implementado



    }
}