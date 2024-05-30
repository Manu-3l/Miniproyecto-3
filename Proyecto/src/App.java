import controlador.ControladorJuego;
import modelo.Juego;
import vista.VistaJuegoGUI;

public class App {
    public static void main(String[] args) throws Exception {
        Juego modelo = new Juego();

        VistaJuegoGUI vistaJuego = new VistaJuegoGUI();
        ControladorJuego controlador = new ControladorJuego(modelo, vistaJuego);
        controlador.mostrarInterfaz();
    }
}
