package h12.opdrachtenh12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class opdracht6h12 extends Applet {
    int[] getallen = {1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10};
    int converter;
    Button b;
    TextField a;
    Label label1;
    String s;
    String tekst1, tekst2;

    public void init() {
        tekst1 = "";
        tekst2 = "";
        //tekstvak
        a = new TextField("", 5);
        add(a);
        //button
        b = new Button("Ok");
        add(b);
        b.addActionListener(new ButtonListener());
        label1 = new Label("type hier een getal in");
        add(label1);
    }

    public void paint(Graphics g) {
        //for (int teller = 0; teller < getallen.length; teller ++) {
        g.drawString("" + tekst1, 50,50);
        g.drawString("" + tekst2, 50,65);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = a.getText();
            converter = Integer.parseInt(s);
            for (int teller = 0; teller < getallen.length; teller++) {
                if (getallen[teller] == converter ){
                    tekst1 = "Het getal " + s + " is " + Arrays.toString(getallen) + " keer gevonden";
                }
                else {
                    tekst1 = "Het getal " + s + " is niet gevonden";
                    tekst2 = "typ een getal tussen 1-10 in";
                }
                a.setText("");
                repaint();
                System.out.println(Arrays.toString(getallen));
            }
        }
    }
}
