package examenlab5p2_luishenriquez;

import java.util.Date;

public class Empleado extends Usuario{
    private String carrera, puestoLaboral;
    private int anosTrabajados;

    public Empleado() {
    }

    public Empleado(String carrera, String puestoLaboral, int anosTrabajados, String nombre, String apellido, String contrasena, String sexo, String departamento, Date fechaNacimiento, String numeroIdentidad) {
        super(nombre, apellido, contrasena, sexo, departamento, fechaNacimiento);
        this.carrera = carrera;
        this.puestoLaboral = puestoLaboral;
        this.anosTrabajados = anosTrabajados;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuestoLaboral() {
        return puestoLaboral;
    }

    public void setPuestoLaboral(String puestoLaboral) {
        this.puestoLaboral = puestoLaboral;
    }

    public int getAnosTrabajados() {
        return anosTrabajados;
    }

    public void setAnosTrabajados(int anosTrabajados) {
        this.anosTrabajados = anosTrabajados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "carrera=" + carrera + ", puestoLaboral=" + puestoLaboral + ", anosTrabajados=" + anosTrabajados + '}';
    }
    
    
}
