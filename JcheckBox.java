import javax.swing.*;
import java.awt.*;

public class JcheckBox
{
    public static void main(String[] args)
    {
        // Définissez le frame
        JFrame frame = new JFrame("Hello World");

        JLabel label = new JLabel("Je suis un JLabel", JLabel.CENTER);
        frame.add(label);

        // Définissez le panel
        JPanel panel = new JPanel();

        // Créer des cases à cocher    
        JCheckBox checkBox1 = new JCheckBox("Java", true);
        JCheckBox checkBox2 = new JCheckBox("PHP");
        JCheckBox checkBox3 = new JCheckBox("Python", true);

        // Ajouter les cases à cocher au frame
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);

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