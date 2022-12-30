import entidades.Alumno;
import entidades.Profesor;

public class Main {
    public static void main(String[] args) {

        //No podemos instanciar la clase Padre "Persona", ya que es abstracta

        //Instanciamos nuestra clase hija "Alumno"
        Alumno alumno = new Alumno("Esteban", "Schuindt", 9);
        alumno.Accion(); //Metodo abstracto implementado

        //Instanciamos nuestra clase hija "Profesor"
        Profesor profesor = new Profesor("Fernando", "Silvero", 27);
        profesor.Accion();//Metodo abstracto implementado

    }
}