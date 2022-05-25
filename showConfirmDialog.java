import javax.swing.*;
import java.awt.event.*;

public class showConfirmDialog extends WindowAdapter
{
    JFrame frame;

    showConfirmDialog()
    {
        frame = new JFrame();
        frame.addWindowListener(this);
        frame.setSize(250, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void windowClosing(WindowEvent e)
    {
        int res = JOptionPane.showConfirmDialog(frame,"Etes-vous sur?");

        if(res == JOptionPane.YES_OPTION)
        {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args)
    {
        new showConfirmDialog();
    }
}