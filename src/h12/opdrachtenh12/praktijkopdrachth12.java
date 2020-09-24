package h12.opdrachtenh12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class praktijkopdrachth12 extends Applet {
    int y = 0;
    int converter;
    Button b;
    TextField tekstvak1, tekstvak2;
    Label label1, label2;
    String s1, s2;
   //String tekst1, tekst2;
    String[] namen, nummers;

    public void init() {
        namen = new String[10];
        nummers = new String[10];
        //tekst1 = "";
        //tekst2 = "";
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
        for (int teller = 0; teller < 10; teller++) {
            //y += 20;
            g.drawString("" + namen[teller], 65, 70);
            g.drawString("" + nummers[teller], 200, 70);
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s1 = tekstvak1.getText();
            s2 = tekstvak2.getText();
            tekstvak1.setText("");
            tekstvak2.setText("");
            converter = Integer.parseInt(s2);
            for (int teller = 0; teller < 10; teller++) {
                namen[3] = "" + s1;
                nummers[3] = "" + converter;
                repaint();
                System.out.println((Arrays.toString(namen)));
                System.out.println((Arrays.toString(nummers)));
                break;
                //System.out.println((tekst1));
                //System.out.println((tekst2));
            }
        }
    }
}