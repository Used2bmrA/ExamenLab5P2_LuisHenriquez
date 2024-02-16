package examenlab5p2_luishenriquez;

import java.security.SecureRandom;
import java.util.Date;

public class Usuario {
    private String nombre, apellido, contrasena, sexo, departamento, numeroIdentidad;
    private Date fechaNacimiento;
    SecureRandom sr = new SecureRandom();


    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contrasena, String sexo, String departamento, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.sexo = sexo;
        this.departamento = departamento;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroIdentidad = CalcularNumeroIdentidad(departamento, fechaNacimiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasena=" + contrasena + ", sexo=" + sexo + ", departamento=" + departamento + ", fechaNacimiento=" + fechaNacimiento + ", numeroIdentidad=" + numeroIdentidad + '}';
    }

    private String CalcularNumeroIdentidad(String departamento, Date fechaNacimiento) {
        String numeroIdentidad = "";
        int temp;
        
        if (departamento.equals("Francisco Morazán")) {
            numeroIdentidad += "01";
            temp = sr.nextInt(1,29);
        }else if(departamento.equals("Cortés")){
            numeroIdentidad += "02";
            temp = sr.nextInt(1,13);
        }else{
            numeroIdentidad += "03";
            temp = sr.nextInt(1,21);
        }
        
        if (temp < 10) {
            numeroIdentidad += "0" + String.valueOf(temp) + "-";
        } else {
            numeroIdentidad += String.valueOf(temp) + "-";
        }
        
        numeroIdentidad += String.valueOf((fechaNacimiento.getYear())) + "-";
        numeroIdentidad += String.valueOf(sr.nextInt(10000,100000));
        return numeroIdentidad;
    }
    
    
}
