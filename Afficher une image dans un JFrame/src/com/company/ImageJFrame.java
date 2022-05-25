package com.company;

import javax.swing.*;

public class ImageJFrame
{
    ImageJFrame()
    {
        JFrame f = new JFrame("Ajouter une image dans JFrame");
        ImageIcon icon = new ImageIcon("test.png");
        f.add(new JLabel(icon));
        f.pack();
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new ImageJFrame();
    }
}