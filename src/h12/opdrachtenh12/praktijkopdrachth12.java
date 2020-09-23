package h12.opdrachtenh12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class praktijkopdrachth12 extends Applet {
    int converter;
    Button b;
    TextField tekstvak1, tekstvak2;
    Label label1, label2;
    String s;
    String tekst1, tekst2;

    public void init() {
        tekst1 = "";
        tekst2 = "";
        //tekstvak
        tekstvak1 = new TextField("", 15);
        add(tekstvak1);
        tekstvak2 = new TextField("", 15);
        add(tekstvak2);
        //button
        b = new Button("Ok");
        add(b);
        b.addActionListener(new ButtonListener());
        label1 = new Label("typ hier de naam");
        add(label1);
        label2 = new Label("Typ hier de telefoonnummer");
        add(label2);
    }

    public void paint(Graphics g) {
        //for (int teller = 0; teller < getallen.length; teller ++) {
        g.drawString("" + tekst1, 50, 50);
        g.drawString("" + tekst2, 50, 65);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}