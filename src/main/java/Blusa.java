public class Blusa extends Componente {
    private boolean mangaLarga;

    // Constructor
    public Blusa(int id, String nombre, String talla, String color, boolean escomunitario, double precio, boolean mangaLarga) {
        super(id, nombre, talla, color, escomunitario, precio);
        this.mangaLarga = mangaLarga;
    }

    // Getters and Setters
    public boolean isMangaLarga() { return mangaLarga; }
    public void setMangaLarga(boolean mangaLarga) { this.mangaLarga = mangaLarga; }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Blusa{mangaLarga=" + mangaLarga + '}';
    }
}
