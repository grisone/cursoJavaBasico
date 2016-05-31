package cl.kibernum.testinterface;

import cl.kibernum.interfaces.TarjetaCredito;
import cl.kibernum.interfaces.TarjetaDebito;

import java.util.Collections;

/**
 * Created by Kibernum on 24/05/2016.
 */
public class Visa
        implements TarjetaCredito, TarjetaDebito{

    public Visa(){
        System.out.println( "Implementando Visa :" + Visa.NOMBRE_BANCO );
        System.out.println( "pais banco :" + PAIS_BANCO );
    }

    @Override
    public int getCupoNacional(int id, int sueldo, int anios) {
        return 0;
    }

    @Override
    public int getCupoInternacional(int id, int sueldo, int anios) {
        return 0;
    }

    @Override
    public int getSegmento(int sueldo, int cupo) {
        return 0;
    }
}
