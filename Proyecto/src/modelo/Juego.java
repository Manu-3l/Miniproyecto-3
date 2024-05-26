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

    public String getJugador() {
        return jugador;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public String getJugada() {
        return jugada;
    }

    public void setJugada(String jugada) {
        this.jugada = jugada;
    }

    public void setJugadaIA(){
        int jugadaIA = rand.nextInt(2);
        if(jugadaIA == 0){
            this.jugada = "PIEDRA";
        }else if(jugadaIA == 1){
            this.jugada = "TIJERA";
        }else if(jugadaIA == 2){
            this.jugada = "PAPEL";
        }
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
    

    
}