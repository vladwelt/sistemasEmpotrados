package sistemasEmpotrados.vista;

import javax.swing.*;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.event.ActionListener;

public class Cobrar extends JPanel {

    private JButton buttonOne;
    private JButton buttonThree;
    private JButton buttonFive;

    public Cobrar() { 
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        buttonOne = new JButton("1 min x 1 Bs");
        buttonOne.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        buttonOne.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonThree = new JButton("3 min x 2 Bs");
        buttonThree.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        buttonThree.setFont(new Font("Arial", Font.PLAIN, 70));
        buttonFive = new JButton("5 min x 3 Bs");
        buttonFive.setMaximumSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        buttonFive.setFont(new Font("Arial", Font.PLAIN, 70));
        add(buttonOne);
        add(buttonThree);
        add(buttonFive);
    }

    public void addButtonListener(ActionListener listener) { 
        buttonOne.addActionListener(listener);
        buttonThree.addActionListener(listener);
        buttonFive.addActionListener(listener);
    }
}
