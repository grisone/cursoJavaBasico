package cl.kibernum.curiosidad;

import java.util.Scanner;

/**
 * Created by Kibernum on 19/05/2016.
 */
public class Curiosidad {

    static int i = -1;
    int j = 100;

    static {
        System.out.println("Bloque de ini estatico");
    }

    {
        System.out.println("Bloque estatico");
        System.out.println(" y J vale " + this.j);
    }



    Curiosidad(){
        System.out.println("Bloque de constructor");
    }

    public static void main(String[] args) {
        //Scanner teclado = new Scanner( System.in );
        //System.out.println("Ingresa argo XAXA : " + teclado.nextLine());

        Scanner teclado = new Scanner( System.in );
        System.out.print("Ingresa nextLine XAXA : " + teclado.nextLine());
        System.out.print("Ingresa hasNextInt XAXA : " + teclado.hasNextInt());
        System.out.print("Ingresa nextBoolean XAXA : " + teclado.nextBoolean());
        new Curiosidad();
    }
}
