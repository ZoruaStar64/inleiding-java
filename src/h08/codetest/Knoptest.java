package h08.codetest;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Knoptest extends Applet {
    Button knop;
    String schermtext;

    public void init() {
        schermtext = "doe ik?";
        knop = new Button( "Klik op mij" );
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("" + schermtext, 50, 60 );
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtext = "Ja, deze knop doet wel iets";
            repaint();
        }
    }
}