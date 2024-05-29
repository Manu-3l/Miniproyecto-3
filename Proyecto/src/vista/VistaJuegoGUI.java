package vista;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controlador.ControladorJuego;

public class VistaJuegoGUI extends JFrame implements VistaJuego{
    
    JFrame ventanaJuego;
    JPanel panelPrincipal;
    JButton btnPiedra, btnPapel, btnTijera;
    
    public void vistaJuegoGUI(){
        ventanaJuego = new JFrame();
        ventanaJuego.setTitle("Piedra, papel o tijeras");
        ventanaJuego.setSize(900, 600);
        ventanaJuego.setResizable(false);
        ventanaJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaJuego.setLocationRelativeTo(null);
        ventanaJuego.setVisible(true);

        panelPrincipal = new JPanel();
        panelPrincipal.setBounds(0, 0, 900, 600);
        panelPrincipal.setLayout(null);
        panelPrincipal.setBackground(new Color(255, 255, 255));

        btnPiedra = new JButton();
        btnPiedra.setBounds(120, 400, 90, 30);
        btnPiedra.setText("Piedra");

        ventanaJuego.getContentPane().add(panelPrincipal);
        panelPrincipal.add(btnPiedra);
    }

    public void mostrarInterfaz(ControladorJuego controlador) {
        vistaJuegoGUI();
    }

    @Override
    public void mostrarResultados(String resultado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showResults'");
    }

    @Override
    public String getJugador() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getJugador'");
    }

    @Override
    public String getJugada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getJugada'");
    }
}