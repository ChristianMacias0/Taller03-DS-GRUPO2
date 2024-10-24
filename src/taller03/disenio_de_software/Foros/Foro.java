package Foros;

public class Foro {
    private String id;
    private String tematica;
    private int numeroDeComentarios;

    // Constructor
    public Foro() {
        this.id = "";
        this.tematica = "";
        this.numeroDeComentarios = 0;
    }

    public Foro(String id, String tematica, int numeroDeComentarios) {
        this.id = id;
        this.tematica = tematica;
        this.numeroDeComentarios = numeroDeComentarios;
    }

    // Getter y setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public int getNumeroDeComentarios() {
        return numeroDeComentarios;
    }

    public void setNumeroDeComentarios(int numeroDeComentarios) {
        this.numeroDeComentarios = numeroDeComentarios;
    }
}
