package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;

public class Llamada extends JPanel {

    private JButton colgar;
    private JLabel tiempo;
    private JLabel llamada;
    private JButton iconoLlamada;

    public Llamada(String numero) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(101, 188, 84));
        setOpaque(true);

        iconoLlamada = new JButton();
        iconoLlamada.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        iconoLlamada.setIcon(new ImageIcon(getClass().getResource("../images/call5.png")));
        iconoLlamada.setBorderPainted(false);
        iconoLlamada.setBackground(new Color(101, 188, 84));

        llamada = new JLabel("Llamando  a   " + numero);
        llamada.setFont(new Font("Arial", Font.PLAIN, 70));

        tiempo = new JLabel("00:00");
        tiempo.setFont(new Font("Arial", Font.PLAIN, 60));
        //tiempo.setAlignmentX(Component.CENTER_ALIGNMENT);
        tiempo.setHorizontalAlignment(SwingConstants.CENTER);

        colgar = new JButton();
        colgar.setMaximumSize(new Dimension(Integer.MAX_VALUE,200));
        colgar.setIcon(new ImageIcon(getClass().getResource("../images/endcall1.png")));
        colgar.setBackground(Color.RED);
        colgar.setBorderPainted(false);
        add(iconoLlamada);
        add(llamada);
        add(tiempo);
        add(colgar);
    }

    public void addButtonColgarListener(ActionListener listener) {
        colgar.addActionListener(listener);
    }
}
