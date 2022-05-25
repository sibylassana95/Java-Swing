import javax.swing.*;

public class showInputDialog
{
    showInputDialog()
    {
        JFrame frame = new JFrame();
        String nom = JOptionPane.showInputDialog(frame,"Entrez votre nom:");
    }
    public static void main(String[] args)
    {
        new showInputDialog();
    }
}