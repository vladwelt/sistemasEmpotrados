package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.Color;

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

    public Teclado() {
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        JPanel linea1 = new JPanel();
        linea1.setLayout(new BoxLayout(linea1,BoxLayout.X_AXIS));
        uno = new JButton("1");
        uno.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        uno.setFont(new Font("Arial",Font.PLAIN,70));
        linea1.add(uno);
        dos = new JButton("2");
        dos.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        dos.setFont(new Font("Arial",Font.PLAIN,70));
        linea1.add(dos);
        tres = new JButton("3");
        tres.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        tres.setFont(new Font("Arial",Font.PLAIN,70));
        linea1.add(tres);
        JPanel linea2 = new JPanel();
        linea2.setLayout(new BoxLayout(linea2,BoxLayout.X_AXIS));
        cuatro = new JButton("4");
        cuatro.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        cuatro.setFont(new Font("Arial",Font.PLAIN,70));
        linea2.add(cuatro);
        cinco = new JButton("5");
        cinco.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        cinco.setFont(new Font("Arial",Font.PLAIN,70));
        linea2.add(cinco);
        seis = new JButton("6");
        seis.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        seis.setFont(new Font("Arial",Font.PLAIN,70));
        linea2.add(seis);
        JPanel linea3 = new JPanel();
        linea3.setLayout(new BoxLayout(linea3,BoxLayout.X_AXIS));
        siete = new JButton("7");
        siete.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        siete.setFont(new Font("Arial",Font.PLAIN,70));
        linea3.add(siete);
        ocho = new JButton("8");
        ocho.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        ocho.setFont(new Font("Arial",Font.PLAIN,70));
        linea3.add(ocho);
        nueve = new JButton("9");
        nueve.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        nueve.setFont(new Font("Arial",Font.PLAIN,70));
        linea3.add(nueve);
        JPanel linea4 = new JPanel();
        linea4.setLayout(new BoxLayout(linea4,BoxLayout.X_AXIS));
        asterisco = new JButton("*");
        asterisco.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        asterisco.setFont(new Font("Arial",Font.PLAIN,70));
        linea4.add(asterisco);
        cero = new JButton("0");
        cero.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        cero.setFont(new Font("Arial",Font.PLAIN,70));
        linea4.add(cero);
        numeral = new JButton("#");
        numeral.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        numeral.setFont(new Font("Arial",Font.PLAIN,70));
        linea4.add(numeral);

        pantalla = new JTextField();
        pantalla.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        pantalla.setFont(new Font("Arial",Font.PLAIN,70));
        add(pantalla);
        add(linea1);
        add(linea2);
        add(linea3);
        add(linea4);

        llamar = new JButton("LLamar");
        llamar.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        llamar.setFont(new Font("Arial",Font.PLAIN,70));
        //llamar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../images/llamar.jpg")));
        add(llamar);
    }
}
