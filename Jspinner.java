import javax.swing.*;
import javax.swing.event.*;

public class Jspinner
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        final JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(250,100);

        SpinnerModel model = new SpinnerNumberModel(
                2, //valeur initiale
                0, //valeur minimum
                20, //valeur maximum
                1 //pas
        );
        JSpinner sp = new JSpinner(model);
        sp.setBounds(100,100,45,30);
        frame.add(sp);

        frame.add(label);
        frame.setSize(250,250);
        frame.setLayout(null);
        frame.setVisible(true);

        //lorsque la flèche haut ou la flèche bas est appuyé
        sp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                label.setText("Valeur : " + ((JSpinner)e.getSource()).getValue());
            }
        });
    }
}