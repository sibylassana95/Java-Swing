import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Jtree
{
    Jtree()
    {
        JFrame f = new JFrame();
        //nœud racine
        DefaultMutableTreeNode framework = new DefaultMutableTreeNode("Framework");
        //nœud interne 1
        DefaultMutableTreeNode front = new DefaultMutableTreeNode("Front-End");
        //nœud interne 2
        DefaultMutableTreeNode back = new DefaultMutableTreeNode("Back-End");
        //feuille
        DefaultMutableTreeNode autres = new DefaultMutableTreeNode("Autres");

        //Ajouter le nœud interne 1 au nœud racine
        framework.add(front);
        //Ajouter les feuille au nœud 1
        DefaultMutableTreeNode angular = new DefaultMutableTreeNode("AngularJS");
        DefaultMutableTreeNode react = new DefaultMutableTreeNode("React.js");
        DefaultMutableTreeNode meteor = new DefaultMutableTreeNode("Meteor.js");
        DefaultMutableTreeNode ember = new DefaultMutableTreeNode("Ember.js ");
        front.add(angular); front.add(react); front.add(meteor); front.add(ember);

        //Ajouter le nœud interne 2 au nœud racine
        framework.add(back);
        //Ajouter les feuille au nœud 2
        DefaultMutableTreeNode nodejs = new DefaultMutableTreeNode("NodeJS");
        DefaultMutableTreeNode express = new DefaultMutableTreeNode("Express");
        back.add(nodejs); back.add(express);

        //Ajouter la feuille au nœud racine
        framework.add(autres);

        JTree jt = new JTree(framework);
        f.add(
                new JScrollPane(jt) //Ajouter une barre de défilement
        );
        f.setSize(200,200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Jtree();
    }
}