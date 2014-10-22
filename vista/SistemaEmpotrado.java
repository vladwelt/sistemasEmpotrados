package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.event.ActionListener;


public class SistemaEmpotrado extends JFrame {

    private Teclado teclado;
    private Llamada llamada;
    private Cobrar cobrador;
    private DetectorMoneda detector;
    private int tiempo;
    private Thread hiloTiempo;
    private boolean terminar;
    private int minutos;
    private int segundos;

    public SistemaEmpotrado(String nombre) {
        super(nombre);
        cobrador = new Cobrar();
        teclado = new Teclado();
        detector = new DetectorMoneda();
        tiempo = minutos = segundos = 0;
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
        System.out.println("FINAL");
        terminar=false;
        hiloTiempo = new Thread(){ 
            public void run() {
                for(int i=minutos; i< tiempo; i++) {
                    for(int j=segundos ; j<60 ; j++) {
                        if(j<=9) {
                            llamada.setText("0"+i+":0"+j);
                            System.out.println("0"+i+":0"+j);
                        }
                        else{
                            llamada.setText("0"+i+":"+j);
                            System.out.println("0"+i+":0"+j);
                        }
                        try {
                            sleep(1000);
                        }
                        catch(Exception e) { }
                        if(terminar)
                        {
                            minutos=i;
                            segundos=j;
                            break;
                        }
                    }
                }
                if(terminar)
                    addPanelTeclado();
                else
                    addCobrarLlamada();
            }
        };
        hiloTiempo.start();
    }

    public void addCobrarLlamada() {
        minutos=segundos=0;
        getContentPane().removeAll();
        getContentPane().add(cobrador);
        this.repaint();
        this.revalidate();
    }
    
    public void delTexto() {
        teclado.delTextoPantalla();
    }
    
    public void pararTiempo() {
        terminar=true;
    }

    public void addDetectarMoneda() {
        getContentPane().removeAll();
        getContentPane().add(detector);
        this.repaint();
        this.revalidate();
    }

    public void addInsertarActionListener(ActionListener listener) {
        detector.addInsertarListener(listener);
    }

    public void addCancelarActionListener(ActionListener listener) {
        detector.addCancelarListener(listener);
    }
}
