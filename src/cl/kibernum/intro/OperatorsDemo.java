package cl.kibernum.intro;

/**
 * Created by Kibernum on 05/05/2016.
 */
public class OperatorsDemo {

    public static void  main(String args[]){
        String perra;
        perra = "perra";
        perra = "perro";
        System.out.println("Y simple & ");
        if( b1() & b2() & b3()){
        }
        System.out.println("Y CORTE && ");
        if( b1() && b2() && b3()){
        }
        System.out.println("O simple & ");
        if( b1() | b2() | b3()){
        }
        System.out.println("O CORTE || ");
        if( b1() || b2() || b3()){
        }

        switch (perra){
            case "perra":
                int x;
                {{{{
                x = 67;
                System.out.println("Guau");
                break;
                }}}}
            case "perro":
                x = 76;
                System.out.println("GuauFFF");break;
            case "perrito":
                System.out.println("Guau wwwww");break;
            default:
                System.out.println("AUAUAUUAUAUUUUUUU");
        }

        while (true){
            System.out.println("true");

            break;
        }

        int x = 0;
        do{
            System.out.println("true");
            x++;
        }while (true & x < 1);


        for (int z=1, w=0,y=0;z < 10; z++){
            System.out.println(z);
        }

        char letra = 0;
        for(int i=0; i<=255 ; i++ )
            System.out.println("El codigo ASCII de la letra " + letra++ + " es " + i);

        for(int i=0; i<=100; i++ ) {
            System.out.println("El codigo ASCII de la letra " + letra++ + " es " + i);
        }
    }

    static boolean b1(){
        System.out.println("b1");
        return false;
    }static boolean b2(){
        System.out.println("b2");
        return true;
    }static boolean b3(){
        System.out.println("b3");
        return true;
    }


}
