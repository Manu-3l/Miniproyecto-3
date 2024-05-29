package controlador;

import vista.VistaJuego;
import modelo.Juego;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ControladorJuego implements ActionListener{

    Random rand = new Random();

    ArrayList<Juego> juegos;
    Juego juego;
    VistaJuego vista;


    public ControladorJuego(Juego juego,VistaJuego vista) {
        this.juego = juego;
        this.vista = vista;
    }

    public void mostrarInterfaz(){
        vista.mostrarInterfaz(this);
    }

    public void comparar(){
        Juego jugador = new Juego();
        jugador.setJugador(vista.getJugador());
        jugador.setJugada(vista.getJugada());
        juegos.add(jugador);
        Juego ia = new Juego();
        ia.setJugador("IA");
        ia.setJugadaIA();
        juegos.add(ia);
        if(juegos.get(juegos.size() - 1).getJugada() == "PAPEL" && juegos.get(juegos.size()).getJugada() == "PAPEL"){
            juegos.get(juegos.size() - 1).setResultado("EMPATE");
            juegos.get(juegos.size()).setResultado("EMPATE");
            vista.mostrarResultados("Nadie gano, empate");            
        }else if(juegos.get(juegos.size() - 1).getJugada() == "TIJERA" && juegos.get(juegos.size()).getJugada() == "TIJERA"){
            juegos.get(juegos.size() - 1).setResultado("EMPATE");
            juegos.get(juegos.size()).setResultado("EMPATE");
        }else if(juegos.get(juegos.size() - 1).getJugada() == "PIEDRA" && juegos.get(juegos.size()).getJugada() == "PIEDRA"){
            juegos.get(juegos.size() - 1).setResultado("EMPATE");
            juegos.get(juegos.size()).setResultado("EMPATE");
        }else if(juegos.get(juegos.size() - 1).getJugada() == "PAPEL" && juegos.get(juegos.size()).getJugada() == "PIEDRA"){
            juegos.get(juegos.size() - 1).setResultado("GANA");
            juegos.get(juegos.size()).setResultado("PIERDE");
            vista.mostrarResultados("Ganador: " + juegos.get(juegos.size() - 1).getJugador());
        }else if(juegos.get(juegos.size() - 1).getJugada() == "TIJERA" && juegos.get(juegos.size()).getJugada() == "PAPEL"){
            juegos.get(juegos.size() - 1).setResultado("GANA");
            juegos.get(juegos.size()).setResultado("PIEDRA");
            vista.mostrarResultados("Ganador: " + juegos.get(juegos.size() - 1).getJugador());
        }else if(juegos.get(juegos.size() - 1).getJugada() == "PIEDRA" && juegos.get(juegos.size()).getJugada() == "TIJERA"){
            juegos.get(juegos.size() - 1).setResultado("GANA");
            juegos.get(juegos.size()).setResultado("PIERDE");
            vista.mostrarResultados("Ganador: " + juegos.get(juegos.size() - 1).getJugador());
        }else{
            juegos.get(juegos.size() - 1).setResultado("PIERDE");
            juegos.get(juegos.size()).setResultado("GANA");
            vista.mostrarResultados("Ganador: " + juegos.get(juegos.size()).getJugador());            
        }
        return;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        comparar();
    }
    
}
