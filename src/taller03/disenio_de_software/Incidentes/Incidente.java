package Incidentes;

import java.util.ArrayList;
import java.util.Date;

public class Incidente {
    protected  int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected ArrayList <String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;

    // Constructor
    public Incidente() {
        this.id = 0;
        this.fecha_reportado = new Date();
        this.estado = "Nuevo";
        this.titulo = "";
        this.descripcion = "";
        this.log_actualizaciones = new ArrayList<>();
        this.fecha_cerrado = null;
        this.tipo = "";
    }

    public Incidente(int id, Date fecha_reportado, String estado, String titulo, String descripcion, ArrayList<String> log_actualizaciones, Date fecha_cerrado, String tipo) {
        this.id = id;
        this.fecha_reportado = fecha_reportado;
        this.estado = estado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.log_actualizaciones = log_actualizaciones;
        this.fecha_cerrado = fecha_cerrado;
        this.tipo = tipo;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_reportado() {
        return fecha_reportado;
    }

    public void setFecha_reportado(Date fecha_reportado) {
        this.fecha_reportado = fecha_reportado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getLog_actualizaciones() {
        return log_actualizaciones;
    }

    public void setLog_actualizaciones(ArrayList<String> log_actualizaciones) {
        this.log_actualizaciones = log_actualizaciones;
    }

    public Date getFecha_cerrado() {
        return fecha_cerrado;
    }

    public void setFecha_cerrado(Date fecha_cerrado) {
        this.fecha_cerrado = fecha_cerrado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
