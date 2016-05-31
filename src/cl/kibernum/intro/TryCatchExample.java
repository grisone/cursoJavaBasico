package cl.kibernum.intro;

/**
 * Created by Kibernum on 17/05/2016.
 */
public class TryCatchExample {



    public TryCatchExample(){}


    public static void main(String args[]) {
        int j = 0;
        int z = 0;
        int x = 0;
        try {
            x = j / z;
        }catch (ArithmeticException error){
            System.out.println("Error de division por Zero");
            throw new RuntimeException("Mala la estupidez");
        }catch (RuntimeException error){
            System.out.println("Error de division por Zero");
            throw new ClassCastException("Mala la estupidez");
        }catch (Exception error){
            System.out.println("Error mayor");
        }finally {
            System.out.println("Xabela");
        }
    }
}
