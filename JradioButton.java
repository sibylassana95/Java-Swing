import javax.swing.*;
import java.awt.*;

public class JradioButton
{
    public static void main(String[] args)
    {
        // Définissez le frame
        JFrame frame = new JFrame("Hello World");

        JLabel label = new JLabel("Je suis un JLabel", JLabel.CENTER);
        frame.add(label);

        // Définissez le panel
        JPanel panel = new JPanel();

        // Créer des boutons radio
        ButtonGroup group = new ButtonGroup();
        JRadioButton radio1 = new JRadioButton("ON", true);
        JRadioButton radio2 = new JRadioButton("OFF", false);

        // Ajouter les boutons radio au groupe
        group.add(radio1);
        group.add(radio2);

        // Ajouter les boutons au frame
        panel.add(radio1);
        panel.add(radio2);

        // Ajouter label et panel au frame
        frame.setLayout(new GridLayout(2, 1));
        frame.add(label);
        frame.add(panel);

        frame.pack();
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}