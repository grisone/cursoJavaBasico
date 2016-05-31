package cl.kibernum.intro;

/**
 * Clase que demuestra el uso de enteros.
 *
 * @author Yo
 */
public class IntegerDemo {

    final static int RESTA = 1;
    final static int SUMA = 0;

    byte mByteFromInstance;
    byte mByte;
    short mShort;
    int mInt;
    long mLong;
    char mChar;

    public static void main(String[] args){
        byte mByte = 0;

        IntegerDemo test = new IntegerDemo();
        test.mByte = 127;
        System.out.print("ESTA COSA SE PUEDE" + 0);
        System.out.print(123 + "PERO ESTA COSA NO SE PUEDE" );

        test.quePaseLaMalditaVariable(test.mByte);

        System.out.println("Uso de integer primitivos");
        System.out.println("My byte plus one :" + ++mByte);
        System.out.println("My short plus one : ");

        System.out.println("El resultado de ( 4 - 6) "+ getResult(4,6,RESTA));
        System.out.println("El resultado de ( 4 + 6) "+ getResult(4,6,SUMA));

        byte b1 = 0;
        byte b2 = 0;
        byte b3 = (byte) (b1 + b2);

        int n130 = 130;
        System.out.println("Byte de 130 : "+ ((byte)n130));

    }

    public void quePaseLaMalditaVariable(byte myByte) {
        System.out.print(myByte);
    }

    public int getResult() {
        System.out.println("Este es el resultado");
        return 0;
    }

    public static int getResult(int i, int j) {
        int u  = i + j;
        System.out.println("Este es el resultado");
        return u;
    }

    public static int getResult(int i, int j, int OPERADOR) {
        int u;
        switch (OPERADOR){
            case RESTA:
                u = i - j;
                break;
            case  SUMA:
                u = i + j;
                break;
            default:
                u = 0;
        }
        return u;
    }
}
