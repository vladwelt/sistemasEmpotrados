package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;


public class SistemaEmpotrado extends JFrame {

    private JButton buttonOne;
    private JButton buttonThree;
    private JButton buttonFive;
    private Teclado teclado;
    private Llamada llamada;

    public SistemaEmpotrado(String nombre) {
        super(nombre);
        teclado = new Teclado();
        JPanel botones = new JPanel();
        botones.setLayout(new BoxLayout(botones,BoxLayout.PAGE_AXIS));
        buttonOne = new JButton("1 min");
        buttonOne.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        buttonOne.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonThree = new JButton("3 min");
        buttonThree.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        buttonThree.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonFive = new JButton("5 min");
        buttonFive.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        buttonFive.setFont(new Font("Arial", Font.PLAIN, 70));
        botones.add(buttonOne);
        botones.add(buttonThree);
        botones.add(buttonFive);
        //addPanelLlamada();
        add(botones);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addButtonActionListener(ActionListener listener) {
        buttonOne.addActionListener(listener);
        buttonThree.addActionListener(listener);
        buttonFive.addActionListener(listener);
    }

    public void addLlamarActionListener(ActionListener listener) {
        teclado.addLlamarListener(listener);
    }

    public void addColgarActionListener(ActionListener listener) {
        llamada.addButtonColgarListener(listener);
    }

    public void addDelActionListener( ActionListener listener) {
        teclado.addDelListener(listener);
    }

    public void addPanelTeclado() {
        getContentPane().removeAll();
        getContentPane().add(teclado);
        this.revalidate();
        this.repaint();
    }

    public void addTecladoActionListener(ActionListener listener) {
        teclado.addButtonListener(listener);
    }

    public void addText(String text) {
        teclado.addTextInput(text);
    }

    public void addPanelLlamada() {
        getContentPane().removeAll();
        System.out.println(teclado.getNumeroPantalla());
        llamada = new Llamada(teclado.getNumeroPantalla());
        getContentPane().add(llamada);
        this.repaint();
        this.revalidate();
        Thread uno = new Thread(){
         
          public void run() {
            
            for(int i=1; i< 10; i++) {
                llamada.setText("00:0"+i);
                System.out.println("00:0"+i);
                try {
                sleep(1000);
                } catch(Exception e) { }
            }
            addPanelTeclado();
          }
        };
        uno.start();
    }
    
    public void delTexto() {
        teclado.delTextoPantalla();
    }
}
