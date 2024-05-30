package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import controlador.ControladorJuego;

public class VistaJuegoGUI extends JFrame implements VistaJuego{
    
    JFrame ventanaJuego;
    JPanel panelPrincipal;
    JButton btnPiedra, btnPapel, btnTijera;
    JLabel mensaje1, mensaje2, mensaje3;
    
    public void vistaJuegoGUI(){
        ventanaJuego = new JFrame();
        ventanaJuego.setTitle("Piedra, papel o tijeras");
        ventanaJuego.setSize(900, 600);
        ventanaJuego.setResizable(false);
        ventanaJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaJuego.setLocationRelativeTo(null);
        ventanaJuego.setVisible(true);

        componentes();
    }

    public void componentes(){

        panelPrincipal = new JPanel();
        panelPrincipal.setBounds(0, 0, 900, 600);
        panelPrincipal.setLayout(null);
        panelPrincipal.setBackground(new Color(25, 25, 25));

        mensaje1 = new JLabel();
        mensaje1.setText("BIENVENIDO A NUESTRO JUEGO DE PIEDRA, PAPEL O TIJERAS");
        mensaje1.setBounds(210, 80, 480, 40);
        mensaje1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje1.setFont(new Font("Comic Sans", Font.BOLD, 15));
        mensaje1.setForeground(new Color(255, 255, 255));

        mensaje2 = new JLabel();
        mensaje2.setText("Tu oponente es una IA");
        mensaje2.setBounds(250, 130, 400, 40);
        mensaje2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje2.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        mensaje2.setForeground(new Color(230, 230, 230));

        mensaje3 = new JLabel();
        mensaje3.setText("presiona el botón de la opción que quieres escoger y empieza el juego");
        mensaje3.setBounds(250, 150, 400, 40);
        mensaje3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje3.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        mensaje3.setForeground(new Color(230, 230, 230));

        btnPiedra = new JButton();
        btnPiedra.setBounds(120, 460, 90, 30);
        btnPiedra.setText("Piedra");
        btnPiedra.setBackground(new Color(170, 60, 255));
        btnPiedra.setForeground(new Color(255, 255, 255));

        btnPapel = new JButton();
        btnPapel.setBounds(405, 460, 90, 30);
        btnPapel.setText("Papel");
        btnPapel.setBackground(new Color(170, 60, 255));
        btnPapel.setForeground(new Color(255, 255, 255));

        btnTijera = new JButton();
        btnTijera.setBounds(670, 460, 90, 30);
        btnTijera.setText("Tijera");
        btnTijera.setBackground(new Color(170, 60, 255));
        btnTijera.setForeground(new Color(255, 255, 255));

        ventanaJuego.getContentPane().add(panelPrincipal);
        panelPrincipal.add(mensaje1);
        panelPrincipal.add(mensaje2);
        panelPrincipal.add(mensaje3);
        panelPrincipal.add(btnPiedra);
        panelPrincipal.add(btnPapel);
        panelPrincipal.add(btnTijera);
    }

    public void mostrarInterfaz(ControladorJuego controlador) {
        vistaJuegoGUI();
    }

    @Override
    public void mostrarResultados(String resultado) {
        JOptionPane.showMessageDialog(ventanaJuego, resultado);
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