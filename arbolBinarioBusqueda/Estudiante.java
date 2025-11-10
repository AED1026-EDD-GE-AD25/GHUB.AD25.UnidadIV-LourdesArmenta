package arbolBinarioBusqueda;
import java.lang.Comparable;

public class Estudiante implements Comparable<Estudiante>{
    private int id;
    private String nombre;
    private double promedio;
    public Estudiante() {
    }
    public Estudiante(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }
    @Override
    public int compareTo(Estudiante o) {
        int dif = this.id-o.getId();

        return dif>0?1:dif<0?-1:0;
    }
    
    
    
    
    
}
