package vista;

import controlador.ControladorJuego;

public interface VistaJuego {
    public void mostrarInterfaz(ControladorJuego controlador);
    public String getJugador();
    public String getJugada();
    public void mostrarResultados(String resultado);
}
