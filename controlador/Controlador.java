package sistemasEmpotrados.controlador;

import sistemasEmpotrados.vista.*;
import sistemasEmpotrados.modelo.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Controlador {

    SistemaEmpotrado sistema;
    OperacionAT operador;

    public Controlador(SistemaEmpotrado _sistema, OperacionAT _operador) {
        this.sistema = _sistema;
        this.operador = _operador;

        sistema.addButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                 int tiempoDefinido = Integer.parseInt(((JButton)event.getSource()).getText().substring(0,1));
                 if(tiempoDefinido == 1)
                     sistema.setTiempoLlamada(1);
                 else if(tiempoDefinido == 3)
                     sistema.setTiempoLlamada(3);
                 else
                     sistema.setTiempoLlamada(5);
                 sistema.addDetectarMoneda();
            }
        });

        sistema.addInsertarActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                sistema.addPanelTeclado();
            }
        });

        sistema.addCancelarActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                sistema.addCobrarLlamada();
            }
        });

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
                operador.abrirPuerto();
                operador.llamar(sistema.getNumero());
            }
        });
    }

    public void addLlamadaEvent() {
        sistema.addColgarActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                sistema.addPanelTeclado();
                sistema.pararTiempo();
                operador.colgar();
                operador.cerrarPuerto();
            }
        });
    }
}
