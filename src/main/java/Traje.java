import java.util.ArrayList;

public class Traje {
    private ArrayList<Componente> piezas;
    private String nombre;

    // Constructor
    public Traje(String nombre) {
        this.piezas = new ArrayList<>();
        this.nombre = nombre;
    }

    // Getters and Setters
    public ArrayList<Componente> getPiezas() { return piezas; }
    public void setPiezas(ArrayList<Componente> piezas) { this.piezas = piezas; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    // toString
    @Override
    public String toString() {
        return "Traje{nombre='" + nombre + "', piezas=" + piezas + '}';
    }
}
