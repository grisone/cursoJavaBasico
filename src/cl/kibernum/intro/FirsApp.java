package cl.kibernum.intro;


///// double es mas preciso que float

public class FirsApp {

    static public void main(String[] args) {
        System.out.println("Hello World!");


        Persona guacho = new Persona();
        guacho.cantar();
        Persona rodolfito = new Hijo();
        rodolfito.cantar();
    }
}

class Persona {
    //Atributos
    public String canto[] = {"Buena", "CTM"};

    public String[] getCanto(){
        return this.canto;
    }

    public void cantar(){
        for (String prosa: getCanto()) {
            System.out.println(prosa);
        }
    }
    //Metodos

}
class Hijo extends Persona{

    public String canto[]={
            "do quiera que vallas",
                "do quiera que estoy",
                "soy oso dichoso",
                "oso feliz",
                "la abeja zumba siempre asi",
                "porque hace miel solo para mi"
        } ;
    @Override
    public String[] getCanto(){
        return this.canto;
    }

    // La Cohesion: es la capacidad en
    // mis atributos
    // mis metodos
}