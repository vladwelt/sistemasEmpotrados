package sistemasEmpotrados.controlador;

import sistemasEmpotrados.vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

    SistemaEmpotrado sistema;

    public Controlador(SistemaEmpotrado _sistema) {
        this.sistema = _sistema;

        sistema.addButtonActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event) {
                 sistema.addPanelLlamada();
            }
        });
    }


}
