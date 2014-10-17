
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;

public class SistemaEmpotrado extends JFrame {

    private JButton buttonOne;
    private JButton buttonThree;
    private JButton buttonFive;

    public SistemaEmpotrado(String nombre) {
        super(nombre);
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
        add(botones);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args){
        new SistemaEmpotrado("Nuevo");
    }
}
