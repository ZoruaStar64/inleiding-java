package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkopdrachtH11B extends Applet {
    Label label;
    Button button;
    int teller;
    int y = 50;
    int ingave2;
    int ingave1 = 1;


    public void init() {
        label = new Label("Klik op Ok voor de volgende tafel.");
        button = new Button("Ok");
        button.addActionListener(new TekstvakListener());
        add(label);
        add(button);
    }

    public void paint(Graphics g) {

           for (teller = 1; teller <= 10; teller++) {
            g.setFont(new Font("TimesRoman", Font.BOLD, 20));
            ingave2 = ingave1 * teller;
            g.drawString(teller + " x " + ingave1 + " = " + ingave2, 100, y);
            y += 20;
        }
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (ingave1 < 10) {
                ingave1 = ingave1 + 1;
                repaint();
            } else {
                ingave1 = 1;
                repaint();
            }
            y = 50;
        }
    }
}
