public class Pantalon extends Componente {
    private boolean conCremallera;

    // Constructor
    public Pantalon(int id, String nombre, String talla, String color, boolean escomunitario, double precio, boolean conCremallera) {
        super(id, nombre, talla, color, escomunitario, precio + (conCremallera ? 1 : 0));
        this.conCremallera = conCremallera;
    }

    // Getters and Setters
    public boolean isConCremallera() { return conCremallera; }
    public void setConCremallera(boolean conCremallera) { this.conCremallera = conCremallera; }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Pantalon{conCremallera=" + conCremallera + '}';
    }
}


