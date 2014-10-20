package sistemasEmpotrados.controlador;

import sistemasEmpotrados.vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controlador {

    SistemaEmpotrado sistema;

    public Controlador(SistemaEmpotrado _sistema) {
        this.sistema = _sistema;

        sistema.addButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                 sistema.addPanelTeclado();
                 addTecladoEvent();
            }
        });
    }

    public void addTecladoEvent() {   
        sistema.addTecladoActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JButton nuevo = new JButton();
                try {
                    nuevo = (JButton)event.getSource();
                } catch(Exception e) {
                    System.out.println("ERROR");
                }
                sistema.addText(nuevo.getText());

            }
        });

        sistema.addDelActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                sistema.delTexto();
            }
        });

        sistema.addLlamarActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                sistema.addPanelLlamada();
                addLlamadaEvent();
            }
        });
    }

    public void addLlamadaEvent() {
        sistema.addColgarActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                sistema.addPanelTeclado();
            }
        });
    }
}
