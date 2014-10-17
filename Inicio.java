package sistemasEmpotrados;

import sistemasEmpotrados.vista.*;
import sistemasEmpotrados.controlador.*;
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
        SistemaEmpotrado cobrador = new SistemaEmpotrado("nuevo");
        Controlador control = new Controlador(cobrador);

    }
}
