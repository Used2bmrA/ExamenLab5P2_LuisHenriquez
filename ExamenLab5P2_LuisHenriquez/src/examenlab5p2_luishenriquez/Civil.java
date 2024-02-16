package examenlab5p2_luishenriquez;

import java.util.ArrayList;
import java.util.Date;

public class Civil extends Usuario{
    private ArrayList<Tramite> tramites = new ArrayList();

    public Civil() {
    }

    public Civil(String nombre, String apellido, String contrasena, String sexo, String departamento, Date fechaNacimiento) {
        super(nombre, apellido, contrasena, sexo, departamento, fechaNacimiento);
    }

    public ArrayList<Tramite> getTramites() {
        return tramites;
    }

    public void setTramites(ArrayList<Tramite> tramites) {
        this.tramites = tramites;
    }

    @Override
    public String toString() {
        return "Civil{" + "tramites=" + tramites + '}';
    }
    
    
}
