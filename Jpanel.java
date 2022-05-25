import javax.swing.*;

public class Jpanel
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
    }
}