package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.*;

public class Teclado extends JPanel {
    
    private JButton uno;
    private JButton dos;
    private JButton tres;
    private JButton cuatro;
    private JButton cinco;
    private JButton seis;
    private JButton siete;
    private JButton ocho;
    private JButton nueve;
    private JButton cero;
    private JButton asterisco;
    private JButton numeral;
    private JTextField pantalla;
    private JButton llamar;
    private JButton borrar;

    public Teclado() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        
        JPanel lineaPantalla = new JPanel();
        lineaPantalla.setLayout(new BoxLayout(lineaPantalla, BoxLayout.X_AXIS));
        pantalla = new JTextField();
        pantalla.setMaximumSize(new Dimension(Integer.MAX_VALUE, 200));
        pantalla.setFont(new Font("Arial",Font.PLAIN,70));
        pantalla.setEditable(false);

        llamar = new JButton("");
        llamar.setMaximumSize(new Dimension(200, 200));
        //llamar.setFont(new Font("Arial",Font.PLAIN,70));
        llamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/call6.png")));
        borrar = new JButton();
        borrar.setIcon(new ImageIcon(getClass().getResource("../images/delete2.png")));
        borrar.setBorderPainted(false);
        borrar.setBackground(null);
        
         JPanel panelPantalla = new JPanel();
        panelPantalla.setLayout(new BoxLayout(panelPantalla, BoxLayout.X_AXIS));
        panelPantalla.add(pantalla);
        panelPantalla.add(borrar);
        panelPantalla.setBackground(pantalla.getBackground());
        panelPantalla.setBorder(pantalla.getBorder());
        pantalla.setBorder(null);

        lineaPantalla.add(llamar);
        lineaPantalla.add(panelPantalla);

        JPanel tabla = new JPanel(new GridLayout(0,3));
        //tabla.setLayout(new BoxLayout(tabla,BoxLayout.X_AXIS));
        uno = new JButton("1");
        uno.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        uno.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(uno);
        dos = new JButton("2");
        dos.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        dos.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(dos);
        tres = new JButton("3");
        tres.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        tres.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(tres);

        cuatro = new JButton("4");
        cuatro.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        cuatro.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(cuatro);
        cinco = new JButton("5");
        cinco.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        cinco.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(cinco);
        seis = new JButton("6");
        seis.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        seis.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(seis);

        siete = new JButton("7");
        siete.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        siete.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(siete);
        ocho = new JButton("8");
        ocho.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        ocho.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(ocho);
        nueve = new JButton("9");
        nueve.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        nueve.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(nueve);

        asterisco = new JButton("*");
        asterisco.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        asterisco.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(asterisco);

        cero = new JButton("0");
        cero.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        cero.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(cero);
        numeral = new JButton("#");
        numeral.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        numeral.setFont(new Font("Arial",Font.PLAIN,70));
        tabla.add(numeral);

        add(lineaPantalla);
        add(tabla);
    }

    public void addButtonListener(ActionListener listener) {
        uno.addActionListener(listener);
        dos.addActionListener(listener);
        tres.addActionListener(listener);
        cuatro.addActionListener(listener);
        cinco.addActionListener(listener);
        seis.addActionListener(listener);
        siete.addActionListener(listener);
        ocho.addActionListener(listener);
        nueve.addActionListener(listener);
        cero.addActionListener(listener);
        asterisco.addActionListener(listener);
        numeral.addActionListener(listener);
    }

    public void addLlamarListener(ActionListener listener) {
        llamar.addActionListener(listener);
    }

    public void addDelListener(ActionListener listener) {
        borrar.addActionListener(listener);
    }

    public void addTextInput(String text) {
        String backup = pantalla.getText();
        if(backup.length()<8) {
            pantalla.setText(backup+text);
        }
    }

    public String getNumeroPantalla() {
        return pantalla.getText();
    }

    public void delTextoPantalla() {
        String backup = pantalla.getText();
        if(backup.length()>0)
            pantalla.setText(backup.substring(0, backup.length()-1));
    }
}
