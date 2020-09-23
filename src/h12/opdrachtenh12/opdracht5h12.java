package h12.opdrachtenh12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class opdracht5h12 extends Applet {
    TextField a;
    Button b;
    Label label1;
    String s;
    String tekst, tekst2;
    double result;
    double[] result2 = {1, 250, 500, 10000};
    boolean search;
    int x;

    public void init() {
        tekst = "";
        tekst2 = "";
        //tekstvak
        a = new TextField("", 5);
        add(a);
        //button
        b = new Button("Zoek");
        add(b);
        b.addActionListener(new ZoekListener());
        label1 = new Label("type hier 1, 250, 500 of 10000 in");
        add(label1);

    }

    public void paint(Graphics g) {
        g.drawString(" " + tekst, 100, 100);
        g.drawString(" " + tekst2, 100, 115);
    }

    class ZoekListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = a.getText();
            result = Double.parseDouble(s);

            search = false;
            int teller = 0;
            while (teller < result2.length) {
                if (result2[teller] == result) {
                    search = true;
                    x = teller;
                }
                teller++;
            }

            if (search == true) {
                tekst = "Het getal " + result + " is gevonden";
                tekst2 = "De index is " + x;
            } else {
                tekst = "Het getal " + result + "is niet gevonden";
            }
            a.setText("");
            repaint();
            System.out.println(Arrays.toString(result2));
        }
    }
}