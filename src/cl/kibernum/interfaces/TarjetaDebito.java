package cl.kibernum.interfaces;

/**
 * Created by Kibernum on 24/05/2016.
 */
public interface TarjetaDebito {

    public int getCupoNacional(int id, int sueldo, int anios);

    int getCupoInternacional(int id, int sueldo, int anios);

    int getSegmento(int sueldo, int cupo);
}
