package vista;

import controlador.ControladorJuego;

public interface VistaJuego {
    public void showInterface(ControladorJuego controlador);
    public void showResults(String resultado);
    public String getJugador();
    public String getJugada();
}
