package entidades;

//Denominamos la clase como abstracta para que no se pueda instanciar.
//Solo lo ocupamos cuando estamos trabajando en la super clase o Clase Padre.
public abstract class Animal {

    //Denominamos el metodo como abstracto, para aplicar la herencia en las clases hijas
    //Recuerden que no se cierra con llaves cuando lo hacemos abstracto, solo con parentesis, ya que aun no lo implementamos.

    public abstract void alimentarse();


    //No es necesario aplicar el override, ya que lo utilizaremos en las clases hijas.

}
