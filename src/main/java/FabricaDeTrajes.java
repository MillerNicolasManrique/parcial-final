import java.util.*;

public class FabricaDeTrajes implements IFabricaDeTrajes {
    private ArrayList<Componente> componentesEnAlmacen;
    private TreeSet<Traje> trajesEnAlmacen;
    private boolean sonRebajas = false;

    // Constructor
    public FabricaDeTrajes() {
        this.componentesEnAlmacen = new ArrayList<>();
        this.trajesEnAlmacen = new TreeSet<>(Comparator.comparing(Traje::getNombre));
    }

    // Método para mostrar el menú
    public void escribirMenu() {
        System.out.println("MENU FABRICA TRAJES");
        System.out.println("1.- Añadir Componente a almacén");
        System.out.println("2.- Listar Componentes del almacén");
        System.out.println("3.- Crear traje y añadir a almacén");
        System.out.println("4.- Listar trajes del almacén");
        System.out.println("7.- Activar/Desactivar las rebajas");
        System.out.println("8.- Crear envío");
        System.out.println("9.- Crear componentes de prueba");
        System.out.println("0.- Salir");
    }

    @Override
    public void añadirComponenteAAlmacen() {
        // Lógica para añadir componente al almacén
    }

    @Override
    public void listarComponentes() {
        // Lógica para listar componentes
    }

    @Override
    public void añadirTrajeAAlmacen() {
        // Lógica para añadir traje al almacén
    }

    @Override
    public void listarTrajes() {
        // Lógica para listar trajes
    }

    @Override
    public void activadDesactivarRebajas() {
        // Lógica para activar/desactivar rebajas
    }

    @Override
    public void crearEnvio() {
        // Lógica para crear envío
    }

    @Override
    public void crearComponentesDePrueba() {
        // Lógica para crear componentes de prueba
    }
}
