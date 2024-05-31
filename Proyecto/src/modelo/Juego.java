package modelo;

import java.util.Random;

public class Juego {

    String jugador, jugada, resultado;
    Random rand = new Random();

    public Juego() {
        this.jugador = "";
        this.jugada = "";
        this.resultado = "";
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getJugador() {
        return jugador;
    }

    public void setJugada(String jugada) {
        this.jugada = jugada;
    }

    public String getJugada() {
        return jugada;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public String jugar(String jugadaUsuario) {
        String[] jugadas = {"Piedra", "Papel", "Tijera"};
        String jugadaIA = jugadas[(int) (Math.random() * 3)];
        String resultado;

        if (jugadaUsuario.equals(jugadaIA)) {
            resultado = (" \n" + "¡EMPATE!   Ambos eligieron " + jugadaUsuario + " \n" + " \n");
        } else if ((jugadaUsuario.equals("Piedra") && jugadaIA.equals("Tijera")) ||
                (jugadaUsuario.equals("Papel") && jugadaIA.equals("Piedra")) ||
                (jugadaUsuario.equals("Tijera") && jugadaIA.equals("Papel"))) {
            resultado = (" \n" + "¡GANASTE!   " + jugadaUsuario + " vence a " + jugadaIA + " \n" + " \n");
        } else {
            resultado = (" \n" + "¡PERDISTE!   " + jugadaIA + " vence a " + jugadaUsuario + " \n" + " \n");
        }

        return resultado;
    }


    

    
}