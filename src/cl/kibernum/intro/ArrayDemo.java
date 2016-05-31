package cl.kibernum.intro;

import java.util.Arrays;

/**
 * Created by Kibernum on 10/05/2016.
 */
public class ArrayDemo {
    public static void main(String args[]){

        int vect[] = {10,20,30,40,50};
        int matriz[][] = new int[4][4];

        //Arrays.binarySearch();
        Arrays.fill( matriz,  10 );

        System.out.println("tamaño >"+ vect.length);

        for (int x=0; x < vect.length; x++){
            System.out.println("["+vect[x]+"]");
/*
            for (int j=0; j < 10; j++){

            }
*/
        }

    }
}
