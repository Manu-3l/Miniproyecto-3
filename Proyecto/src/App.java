import controlador.ControladorJuego;
import modelo.Juego;
//import vista.VistaJuegoGUI;
import vista.VistaJuegoTerminal;

public class App {
    public static void main(String[] args) throws Exception {
        Juego modelo = new Juego();

        VistaJuegoTerminal vistaJuego = new VistaJuegoTerminal();
        //VistaJuegoGUI vistaJuego = new VistaJuegoGUI();
        ControladorJuego controlador = new ControladorJuego(modelo, vistaJuego);
        controlador.mostrarInterfaz();
    }
}
