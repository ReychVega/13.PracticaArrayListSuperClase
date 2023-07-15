package domain;

/**
 *
 * @author reych
 */
public class superClase {
    private String nombre;

     public superClase() {

     }
    
    public superClase(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "superClase." + "Nombre=" + nombre + ' ';
    }
 
    
    
    
    
}
