package cl.kibernum.db;

/**
 * Created by Kibernum on 31/05/2016.
 */
public class Cliente {
    private long id;
    private String nombre;
    private String password;
    private int edad;
    private String genero; // masculino, femenino, NA

    public Cliente(long id, String nombre, String password, int edad, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.edad = edad;
        this.genero = genero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
