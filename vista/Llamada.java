package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

public class Llamada extends JPanel {

    private JButton colgar;
    private JLabel tiempo;
    private JLabel llamada;

    public Llamada(String numero) {
        setLayout(new BorderLayout());
        setBackground(new Color(57, 255, 0));
        setOpaque(true);
        llamada = new JLabel("Llamando    a   " + numero);
        llamada.setFont(new Font("Arial", Font.PLAIN, 70));
        llamada.setBackground(Color.green);
        llamada.setMaximumSize(new Dimension(Integer.MAX_VALUE,Integer.MAX_VALUE));
        tiempo = new JLabel("00:00");
        tiempo.setBackground(Color.green);
        tiempo.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        colgar = new JButton("colgar");
        colgar.setMaximumSize(new Dimension(Integer.MAX_VALUE,200));
        colgar.setFont(new Font("Arial", Font.PLAIN, 70));
        colgar.setBackground(Color.RED);
        colgar.setBorderPainted(false);
        add(llamada, BorderLayout.CENTER);
        add(tiempo, BorderLayout.EAST);
        add(colgar, BorderLayout.SOUTH);
    }
}
