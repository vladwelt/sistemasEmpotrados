package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Component;

public class DetectorMoneda extends JPanel {
    
    private JLabel texto;
    private JButton insertar;
    private JButton cancelar;

    public DetectorMoneda() {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        texto = new JLabel("Inserte Moneda:\n");
        texto.setFont(new Font("Arial", Font.PLAIN, 70));
        texto.setAlignmentX(Component.CENTER_ALIGNMENT);

        insertar = new JButton("");
        insertar.setMaximumSize(new Dimension(400,200));
        insertar.setFont(new Font("Arial",Font.PLAIN, 70));
        insertar.setIcon(new ImageIcon(getClass().getResource("../images/call6.png")));
        insertar.setEnabled(true);
        insertar.setAlignmentX(Component.CENTER_ALIGNMENT);

        cancelar = new JButton("");
        cancelar.setMaximumSize(new Dimension(400,200));
        cancelar.setFont(new Font("Arial", Font.PLAIN, 70));
        cancelar.setIcon(new ImageIcon(getClass().getResource("../images/cancel.png")));
        cancelar.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(texto);
        add(insertar);
        add(cancelar);
    }

    public void addInsertarListener(ActionListener listener) {
        insertar.addActionListener(listener);
    }

    public void addCancelarListener(ActionListener listener) {
        cancelar.addActionListener(listener);
    }
}
