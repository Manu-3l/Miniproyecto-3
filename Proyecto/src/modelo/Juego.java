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
        String[] jugadas = {"piedra", "papel", "tijeras"};
        String jugadaIA = jugadas[(int) (Math.random() * 3)];
        String resultado;

        if(jugadaUsuario.equals("piedra") ||
         jugadaUsuario.equals("papel") ||
         jugadaUsuario.equals("tijeras")){

            if (jugadaUsuario.equals(jugadaIA)) {
                System.out.println("------------------------------------------------------------");
                resultado = (" \n" + "¡EMPATE!   Ambos eligieron " + jugadaUsuario + "\n");
            } else if ((jugadaUsuario.equals("piedra") && jugadaIA.equals("tijeras")) ||
                    (jugadaUsuario.equals("papel") && jugadaIA.equals("piedra")) ||
                    (jugadaUsuario.equals("tijeras") && jugadaIA.equals("papel"))) {
                System.out.println("------------------------------------------------------------");
                resultado = (" \n" + "¡GANASTE!   " + jugadaUsuario + " vence a " + jugadaIA + "\n");
            } else {
                System.out.println("------------------------------------------------------------");
                resultado = (" \n" + "¡PERDISTE!   " + jugadaIA + " vence a " + jugadaUsuario + "\n");
            }
            return resultado;

        }else{

            System.out.println("------------------------------------------------------------");
            resultado = ("Digitaste algo mal");
            return resultado;
            
        }
}
}