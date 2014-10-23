package sistemasEmpotrados;

import sistemasEmpotrados.vista.*;
import sistemasEmpotrados.controlador.*;
import sistemasEmpotrados.modelo.*;
import javax.swing.UIManager;
import ch.randelshofer.quaqua.*;

public class Inicio {

    public static void main(String[] args) {
        System.setProperty(
                        "Quaqua.tabLayoutPolicy","wrap");
        try {
            UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
        }
        catch (Exception e) {
            System.out.println("Not working");
        }                       

        OperacionAT operador = new OperacionAT("/dev/ttyUSB0");
        SistemaEmpotrado cobrador = new SistemaEmpotrado("nuevo", operador);
        Controlador control = new Controlador(cobrador,operador);
    }
}
