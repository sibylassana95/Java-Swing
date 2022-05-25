import javax.swing.*;
import java.awt.*;

public class Jslider
{
    public static void main(String[] args)
    {
        // Définissez le frame
        JFrame frame = new JFrame("Hello World");

        JPanel panel = new JPanel();

        // Définissez le slider
        JSlider slider = new JSlider();
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        frame.setLayout(new GridLayout(2, 1));
        frame.add(slider);
        frame.pack();
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}