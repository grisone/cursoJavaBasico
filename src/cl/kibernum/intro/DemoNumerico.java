package cl.kibernum.intro;

/**
 * Created by Kibernum on 03/05/2016.
 */
public class DemoNumerico {
    final static char SUMA = '+';
    final static char RESTA = '-';
    final static char MULTIPLICACION = '*';
    final static char DIVISION = '/';

    public double getResult(double numerador, double denominador, char operacion) {
        double respuesta;
        switch (operacion) {
            case SUMA:
                respuesta = numerador + denominador;
                break;
            case RESTA:
                respuesta = numerador - denominador;
                break;
            case MULTIPLICACION:
                respuesta = numerador * denominador;
                break;
            case DIVISION:
                respuesta = (denominador != 0) ? numerador / denominador : 0;
                break;
            default:
                respuesta = 0;
        }
        return respuesta;
    }

    public static void main(String[] args) {
        DemoNumerico miInstancia = new DemoNumerico();
        double num = 1;
        double dos = 2;
        System.out.println(miInstancia.getResult(num, dos, SUMA));
        System.out.println(miInstancia.getResult(num, dos, RESTA));
        System.out.println(miInstancia.getResult(num, dos, MULTIPLICACION));
        System.out.println(miInstancia.getResult(num, dos, DIVISION));
    }
}
