package h10.test10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class IfElse extends Applet {

    int leeftijd;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("Geef uw leeftijd in en druk op enter");

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);
            if (leeftijd > 18) {
                tekst = "U bent meerderjarig.";
                repaint();
            } else {
                tekst = "U bent minderjarig.";
                repaint();
            }
        }
    }
}