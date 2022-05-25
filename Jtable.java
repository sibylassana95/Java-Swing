import javax.swing.*;
import java.awt.*;

public class Jtable
{
    public static void main(String[] args)
    {
        // Définissez le frame
        JFrame frame = new JFrame("Hello World");

        //L'en-têtes du JTable
        String[] column = {"ID", "Nom", "Age", "Adresse"};

        //Les lignes du JTable
        String[][] data = {
                {"01", "Thomas", "55", "Paris"},
                {"02", "Emily", "45", "Marseille"},
                {"03", "Yohan", "12", "Lyon"},
                {"04", "Jean", "29", "Toulouse"},
                {"05", "Bob", "30", "Nice"}
        };

        // Créer le JTable
        JTable table = new JTable(data, column);
        JScrollPane scroll = new JScrollPane(table);
        frame.add(scroll);

        frame.pack();
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}