import java.awt.*;
import javax.swing.*;

public class JToolBar
{
    public static void main(final String args[])
    {
        JFrame f = new JFrame("Exemple de JToolBar");

        javax.swing.JToolBar tb = new javax.swing.JToolBar();
        tb.setRollover(true);

        tb.add(new JButton("Bouton 1"));
        tb.addSeparator();
        tb.add(new JButton("Bouton 2"));
        tb.add(
                new JComboBox(
                        new String[] { "item1", "item2", "item3", "item4" }
                )
        );
        Container c = f.getContentPane();
        // ajoute la barre d'outils au container
        c.add(tb, BorderLayout.NORTH);
        JTextArea text = new JTextArea();
        JScrollPane p = new JScrollPane(text);
        c.add(p, BorderLayout.EAST);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 200);
        f.setVisible(true);
    }
}