import javax.swing.*;
import java.awt.event.*;

public class JpasswordField
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        final JPasswordField password = new JPasswordField();
        password.setBounds(120, 70, 150, 30);

        JLabel label1 = new JLabel("Nom utilisateur:");
        label1.setBounds(15, 20, 100, 30);

        JLabel label2 = new JLabel("Mot de passe:");
        label2.setBounds(15, 70, 100, 30);

        JButton btn = new JButton("Se connecter");
        btn.setBounds(100, 130, 110, 30);

        final JTextField tf = new JTextField();
        tf.setBounds(120, 20, 150, 30);

        frame.add(password);
        frame.add(label1);
        frame.add(label2);
        frame.add(btn);
        frame.add(tf);

        frame.setSize(300,230);
        frame.setLayout(null);
        frame.setVisible(true);

        btn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Nom utilisateur : "+ tf.getText());
                System.out.println("Mot de passe: "+ new String(password.getPassword()));
            }
        });
    }
}