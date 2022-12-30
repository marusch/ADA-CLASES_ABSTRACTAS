package entidades;

//Extendemos de nuestra clase Padre abstracta
public class Carnivoro extends Animal{

    //Recuperamos su método abstracto
    //Sin denominarlo abstracto, ya que no es necesario cuando lo sobreescribimos
    //En este caso se alimentara de carne 🤓
    @Override
    public void alimentarse() {
        System.out.println("Solo como carne");
    }

    //No es necesario implementar el método override nuevamente,
    // ya que lo implementamos arriba y es suficiente con ello.
}
