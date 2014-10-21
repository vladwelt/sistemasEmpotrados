package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.event.ActionListener;


public class SistemaEmpotrado extends JFrame {

    private Teclado teclado;
    private Llamada llamada;
    private Cobrar cobrador;
    private int tiempo;

    public SistemaEmpotrado(String nombre) {
        super(nombre);
        cobrador = new Cobrar();
        teclado = new Teclado();
        tiempo = 0;

        add(cobrador);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void setTiempoLlamada(int _tiempo) {
        tiempo = _tiempo;
        System.out.println("TIEMPO: "+ _tiempo);
    }

    public void addButtonActionListener(ActionListener listener) {
        cobrador.addButtonListener(listener);
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
