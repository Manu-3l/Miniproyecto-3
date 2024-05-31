package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controlador.ControladorJuego;
import modelo.Juego;

public class VistaJuegoGUI extends JFrame implements VistaJuego{

    JFrame ventanaJuego;
    JPanel panelPrincipal;
    JButton btnPiedra, btnPapel, btnTijera;
    JLabel mensaje1, mensaje2, mensaje3, mensaje4, mensaje5;
    ControladorJuego controlador;
    Juego juego;
    String message;
    
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
        mensaje3.setBounds(230, 155, 440, 40);
        mensaje3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje3.setFont(new Font("Comic Sans", Font.PLAIN, 13));
        mensaje3.setForeground(new Color(230, 230, 230));

        mensaje4 = new JLabel();
        mensaje4.setText("La IA va a elegir su jugada al mismo tiempo que tu.");
        mensaje4.setBounds(250, 180, 400, 40);
        mensaje4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje4.setFont(new Font("Comic Sans", Font.PLAIN, 12));
        mensaje4.setForeground(new Color(230, 230, 230));

        mensaje5 = new JLabel();
        mensaje5.setText("¡MUCHA SUERTE!");
        mensaje5.setBounds(250, 220, 400, 40);
        mensaje5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensaje5.setFont(new Font("Comic Sans", Font.BOLD, 14));
        mensaje5.setForeground(new Color(230, 230, 230));

        btnPiedra = new JButton();
        btnPiedra.setBounds(120, 460, 90, 30);
        btnPiedra.setText("PIEDRA");
        btnPiedra.setBackground(new Color(170, 60, 255));
        btnPiedra.setForeground(new Color(255, 255, 255));
        btnPiedra.addActionListener(new ActionListener (){
            public void actionPerformed (ActionEvent evt){
                controlador.setJugada("Piedra");
            }
        });

        btnPapel = new JButton();
        btnPapel.setBounds(405, 460, 90, 30);
        btnPapel.setText("PAPEL");
        btnPapel.setBackground(new Color(170, 60, 255));
        btnPapel.setForeground(new Color(255, 255, 255));
        btnPapel.addActionListener(new ActionListener (){
            public void actionPerformed (ActionEvent evt){
                controlador.setJugada("Papel");
            }
        });

        btnTijera = new JButton();
        btnTijera.setBounds(670, 460, 90, 30);
        btnTijera.setText("TIJERA");
        btnTijera.setBackground(new Color(170, 60, 255));
        btnTijera.setForeground(new Color(255, 255, 255));
        btnTijera.addActionListener(new ActionListener (){
            public void actionPerformed (ActionEvent evt){
                controlador.setJugada("Tijera");
            }
        });

        ventanaJuego.getContentPane().add(panelPrincipal);
        panelPrincipal.add(mensaje1);
        panelPrincipal.add(mensaje2);
        panelPrincipal.add(mensaje3);
        panelPrincipal.add(mensaje4);
        panelPrincipal.add(mensaje5);
        panelPrincipal.add(btnPiedra);
        panelPrincipal.add(btnPapel);
        panelPrincipal.add(btnTijera);
    }


    public void mostrarInterfaz(ControladorJuego controlador) {
        this.controlador = controlador;
        vistaJuegoGUI();
    }


    @Override
    public void mostrarResultados(String resultado) {
        JOptionPane.showMessageDialog(ventanaJuego, resultado, "Resultado", 1);
    }


    @Override
    public String getJugador() {
        String jugador = "Tú";
        return jugador;
    }

}