package cl.kibernum.grafico;

import cl.kibernum.interfaces.TarjetaCredito;

/**
 * Created by Kibernum on 31/05/2016.
 */
public class Cliente {
    // Variables de clase
    private String nombre;
    private String rut;
    private int edad;
    private TarjetaCredito tarjetaCredito;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public TarjetaCredito getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
}
