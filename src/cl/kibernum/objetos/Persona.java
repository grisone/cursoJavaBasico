package cl.kibernum.objetos;

/**
 * Created by Kibernum on 12/05/2016.
 */
public class Persona {
    /// Variables de clase
    static String sexo;

    // Variables de clase
    int edad;
    int peso;
    String nombre;
    String colorOjos;

    static {
        System.out.println("nr 1 : eres un espermio aun ");
    }

    {
        System.out.println("Nr 2 : seras algun dia una nueva persona");
    }
    static {
        System.out.println("nr 4 : eres un ovulo");
    }

    {
        System.out.println("Nr 5 : seras algun dia una vieja persona");
    }


    public Persona(){
        System.out.println("Nr 3 : HA nacido una nueva persona");
    }


    public static void main(String[] args){
        Persona.sexo = "Shemale";

        Persona pepe = new Persona();
        Persona juan = new Persona();

        pepe.sexo = "masculino";
        pepe.edad = 10;
        pepe.nombre = "PEPE";
        pepe.presentarse();


        juan.edad = 30;
        juan.nombre ="JUAN";
        juan.presentarse();
    }

    public void presentarse(){
        System.out.println("Hola soy "+this.sexo+" , llamado "+this.nombre+" y tengo "+this.edad+" años.");
    }
}
