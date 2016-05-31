package cl.kibernum.polla;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Random;

public class Gol {
    final static int NUMERO_MAYOR = 10;
    private int miPollaGol[];

    public Gol(){
        this.miPollaGol = new int[8];
    }

    public static void main(String args[]){
        Gol lotto = new Gol();
        int a, b, c;

        int numerosGenerados = 6;
        do {
            int temporal = lotto.nuevoNumero();
            if(temporal == 0){
                System.out.println("QUEEEEEEEEEEEEEEEEEEEEE");
                continue;
            }
            if( lotto.nuevoNumero(temporal) ){
                lotto.miPollaGol[ --numerosGenerados ] = temporal;
            }
            //System.out.println("Encontramos el ["+temporal+"] : "+ Arrays.binarySearch( lotto.miPollaGol, temporal ) );
        }while ( numerosGenerados > 0 );

        lotto.imprimirHasta( lotto.miPollaGol, 6 );

        Arrays.sort( lotto.miPollaGol );

        lotto.imprimirArreglo( lotto.miPollaGol );

        //Random rnd = new Random();
        /*
        a = 1 + (int) (Math.random() * 35);//rnd.nextInt();
        b = 1 + (int) (Math.random() * 35);//rnd.nextInt();
        c = 1 + (int) (Math.random() * 35);// rnd.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        */


        //Generar Numeros entre 1 y 35
        //TODO Imprimir los primeros 6
        //TODO Generar 2 numeros Ranadom que no esten en el punto 1
        //Todo im´primrlos de menor a mayor
        // TODO Print Pares
        // TODO Print multipls de 2
    }

    public int[] numeros( int menor, int mayor){
        int matriz[] = new int[0];

        return  matriz;
    }

    public int nuevoNumero(){
        return 1 + ((int)(Math.random() * NUMERO_MAYOR));
    }

    public void imprimirArreglo(int arreglo[]){
        imprimirHasta(arreglo, arreglo.length);
    }

    public void imprimirHasta(int arreglo[],int limite){
        for (int i = 0; i < limite; i++) {
            System.out.print("[ " + arreglo[i]+" ] ");
        }
        System.out.println("");
    }

    public boolean nuevoNumero(int busqueda ){
        int posicion = Arrays.binarySearch( miPollaGol, busqueda );

        if(posicion < 0 )
            return true;
        else {
            System.out.println("Repetido el " +busqueda+" en la pos"+ posicion);
            return false;
        }
    }
}
