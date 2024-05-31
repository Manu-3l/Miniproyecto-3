package controlador;

import vista.VistaJuego;
import modelo.Juego;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class ControladorJuego {

    Random rand = new Random();

    ArrayList<Juego> juegos;
    Juego juego;
    VistaJuego vista;
    String jugada, message;
    JButton btn;

    public ControladorJuego(Juego juego, VistaJuego vista) {
        this.juego = juego;
        this.vista = vista;
    }

    public void mostrarInterfaz(){
        vista.mostrarInterfaz(this);
    }

    public void setJugada(String jugadaUsuario) {
        String resultado = juego.jugar(jugadaUsuario);
        vista.mostrarResultados(resultado);
    }
    
}
