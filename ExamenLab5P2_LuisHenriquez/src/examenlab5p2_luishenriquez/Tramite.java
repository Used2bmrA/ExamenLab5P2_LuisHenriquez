package examenlab5p2_luishenriquez;

import java.util.Date;

class Tramite {
    private String nombre, descripcion;
    private Date fechaSolicitud;
    private String numeroIdentidad;

    public Tramite() {
    }

    public Tramite(String nombre, String descripcion, Date fechaSolicitud, String numeroIdentidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaSolicitud = fechaSolicitud;
        this.numeroIdentidad = numeroIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    @Override
    public String toString() {
        return "Tramite{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", fechaSolicitud=" + fechaSolicitud + ", numeroIdentidad=" + numeroIdentidad + '}';
    }
    
    
}
