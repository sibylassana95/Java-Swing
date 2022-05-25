package com.company;

import javax.swing.*;

public class Main
{
    JMenu menu, smenu;
    JMenuItem e1, e2, e3, e4, e5, e6;

    Main()
    {
        // Créer le frame
        JFrame frame = new JFrame("Exemple Menu");
        // Créer la barre de menu
        JMenuBar menubar = new JMenuBar();
        // Créer le menu
        menu = new JMenu("Menu");
        // Créer le sous menu
        smenu = new JMenu("Sous Menu");
        // Créer les éléments du menu et sous menu
        e1 = new JMenuItem("Element 1");
        e2 = new JMenuItem("Element 2");
        e3 = new JMenuItem("Element 3");
        e4 = new JMenuItem("Element 4");
        e5 = new JMenuItem("Element 5");
        e6 = new JMenuItem("Element 6");
        // Ajouter les éléments au menu
        menu.add(e1);
        menu.add(e2);
        menu.add(e3);
        // Ajouter les éléments au sous menu
        smenu.add(e4);
        smenu.add(e5);
        smenu.add(e6);
        // Ajouter le sous menu au menu principale
        menu.add(smenu);
        // Ajouter le menu au barre de menu
        menubar.add(menu);
        // Ajouter la barre de menu au frame
        frame.setJMenuBar(menubar);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
        new Main();
    }
}