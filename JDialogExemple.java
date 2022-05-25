import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class JDialogExemple extends JFrame implements ActionListener {

    static JFrame frame;

    public static void main(String[] args)
    {
        // créer un frame 
        frame = new JFrame("Exemple JDialog");
        // créer un objet
        JDialogExemple obj = new JDialogExemple();
        // créer un panneau 
        JPanel panel = new JPanel();
        JButton btn = new JButton("Cliquez ici");
        // ajouter le listener au bouton
        btn.addActionListener(obj);
        // ajouter un bouton au panneau
        panel.add(btn);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(s.equals("Cliquez ici"))
        {
            // Créer une boîte de dialogue
            JDialog d = new JDialog(frame, "Boite de dialogue");
            // Créer une étiquette
            JLabel l = new JLabel("Ceci est une boite de dialogue.");
            // Ajouter l'étiquette à la boîte de dialogue 
            d.add(l);
            // Définir la taille de la boîte de dialogue 
            d.setSize(200, 100);
            // Définir la visibilité de la boîte de dialogue
            d.setVisible(true);
        }
    }
}