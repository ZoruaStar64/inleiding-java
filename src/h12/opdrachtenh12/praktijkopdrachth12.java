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
    int counter;
    int aantal;

    public void init() {
        namen = new String[10];
        nummers = new String[10];
        counter = 0;

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
        giveInitialValueToStringArray(namen);
        giveInitialValueToStringArray(nummers);
    }
    private void giveInitialValueToStringArray(String[] arrayToChange){
        for (int i = 0; i < arrayToChange.length; i++){
            arrayToChange[i] = "";
        }
    }
    public void paint(Graphics g) {
        for (int teller = 0; teller < 10; teller++) {
            g.drawString("" + namen[teller], 65, y = (20 * teller + 70));
            g.drawString("" + nummers[teller], 200, y = (20 * teller + 70));
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (counter < 10) {

            s1 = tekstvak1.getText();
            s2 = tekstvak2.getText();
            tekstvak1.setText("");
            tekstvak2.setText("");
            converter = Integer.parseInt(s2);





                        namen[counter] = "" + s1;
                        nummers[counter] = "" + converter;
                        repaint();
                        System.out.println((Arrays.toString(namen)));
                        System.out.println((Arrays.toString(nummers)));
                        //break;
                        System.out.println((counter));
                        System.out.println((counter));
                        counter++;

                        //System.out.println((tekst1));
                        //System.out.println((tekst2));
            }
        }
    }
}