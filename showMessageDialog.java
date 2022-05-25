import javax.swing.*;

public class showMessageDialog
{
    showMessageDialog()
    {
        JFrame frame = new JFrame();
        JOptionPane.showMessageDialog(frame,"Welcome to WayToLearnX!");
    }
    public static void main(String[] args)
    {
        new showMessageDialog();
    }
}