package cl.kibernum.interfaces;

public interface TarjetaCredito {
    String NOMBRE_BANCO = "Banco 1";
    String PAIS_BANCO = "1";

    public int getCupoNacional(int id, int sueldo, int anios);

    int getCupoInternacional(int id, int sueldo, int anios);

    int getSegmento(int sueldo, int cupo);
}
