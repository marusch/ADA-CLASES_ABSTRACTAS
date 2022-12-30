package entidades;

//Extendemos de nuestra clase Padre abstracta
public class Herviboro extends Animal{

    //Recuperamos su método abstracto
    //Sin denominarlo abstracto nuevamente, ya que no es necesario cuando lo implementemos
    //A menos que queramos nuevamente especificar por ej que tipo de plantas va a alimentarse
    @Override
    public void alimentarse() {
        System.out.println("Solo como plantas");
    }

    //No es necesario implementar el método override nuevamente,
    // ya que lo implementamos arriba y es suficiente con ello.

}
