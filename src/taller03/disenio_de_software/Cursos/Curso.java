package Cursos;
public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;

    // Constructor
    public Curso() {}

    public Curso(String id, String nombre, boolean estadoDisponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponible = estadoDisponible;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadoDisponible(boolean estadoDisponible) {
        this.estadoDisponible = estadoDisponible;
    }

}
