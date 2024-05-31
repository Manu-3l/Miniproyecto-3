package vista;

import java.util.Scanner;

import controlador.ControladorJuego;

public class VistaJuegoTerminal implements VistaJuego {

    String jugador;

    @Override
    public void mostrarInterfaz(ControladorJuego controlador) {
        while(true){
            System.out.println("------------------------------------------------------------");
            System.out.println("      Bienvenido al juego de piedra, papel o tijeras");
            System.out.println("------------------------------------------------------------");
            System.out.println("Presiona 1 para jugar" + "\n");
            System.out.println("Presiona 2 para salir");
            System.out.println("------------------------------------------------------------");
            try{
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            int opcion = scanner.nextInt();
        if(opcion==1){
            System.out.println("------------------------------------------------------------");
            System.out.println("Dime tu jugada!!" + "\n");
            System.out.println("Escoge entre piedra, papel o tijeras" + "\n");
            System.out.println("La IA jugara al mismo tiempo que tu");
            System.out.println("------------------------------------------------------------");
            jugador = scanner.next();
            controlador.setJugada(jugador.toLowerCase());
        }
        else if(opcion==2){
            System.out.println("------------------------------------------------------------");
            System.out.println("Gracias por jugar!!!");
            System.out.println("------------------------------------------------------------");
            break;
        }else{
            System.out.println("Opcion incorrecta, solo los numeros 1 o 2");
        }
        }catch(Exception ex){
            System.out.println("Digitaste algo incorrecto, porfavor solo los numeros 1 o 2");
        } 
    
    }
           
    }

    @Override
    public String getJugador() {
        return jugador;
    }

    @Override
    public void mostrarResultados(String resultado) {
        System.out.println(resultado);
    }

}