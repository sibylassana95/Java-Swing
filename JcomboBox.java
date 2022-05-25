import javax.swing.*;
import java.awt.*;

public class JcomboBox
{
    public static void main(String[] args)
    {
        // Définissez le frame
        JFrame frame = new JFrame("Hello World");

        // Set data in the drop-down list
        String[] langs = {"PHP", "Java", "Python", "C++", "Ruby"};

        // Créer une liste déroulante
        JComboBox cb = new JComboBox(langs);

        frame.setLayout(new GridLayout(6, 1));
        frame.add(cb);

        frame.pack();
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}