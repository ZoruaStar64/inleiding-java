package h08.opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht1h8 extends Applet {
    TextField tekstvak;
    Button ok;
    Button reset;
    String s;


    public void init() {
        tekstvak = new TextField("", 30);
        ok = new Button("Ok");
        ok.addActionListener(new KnopListener());
        reset = new Button("Reset");
        reset.addActionListener(new KnopListener());
        add(tekstvak);
        add(ok);
        add(reset);
        s = "";
    }


    public void paint(Graphics g) {
        g.drawString("Typ iets in en klik op Ok om het te displayen.", 50, 50);
        g.drawString("Klik op Reset om het veld weer leeg te maken.", 50, 65);
        g.drawString(s, 100, 100);
        g.drawString("ingetypte text komt hieronder te staan!", 100, 85);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            tekstvak.setText("");
            repaint();
        }
    }
}

