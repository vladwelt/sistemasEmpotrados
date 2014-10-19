package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;

public class Llamada extends JPanel {

    private JButton colgar;
    private JLabel tiempo;
    private JLabel llamada;

    public Llamada(String numero) {
        setLayout(new BorderLayout());
        llamada = new JLabel();
        tiempo = new JLabel("00:00");
        colgar = new JButton("colgar");
        colgar.setMaximumSize(new Dimension(Integer.MAX_VALUE,200));
        colgar.setFont(new Font("Arial", Font.PLAIN, 70));
        add(llamada, BorderLayout.CENTER);
        add(tiempo, BorderLayout.CENTER);
        add(colgar, BorderLayout.SOUTH);
    }
}
