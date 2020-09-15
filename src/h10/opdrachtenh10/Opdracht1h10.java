package h10.opdrachtenh10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht1h10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int getal;
    int getalHoogst;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        getal = 0;
        getalHoogst = 0;
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        //g.drawString( "" + getal, 50, 85 );
        //g.drawString("" + getalHoogst, 50, 100 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt( s);
            if  (getal > getalHoogst){
                getalHoogst = getal;
                tekst = "Het hoogste getal = "+ getalHoogst;
            }
            else {
                tekst = "Het hoogste getal = "+ getalHoogst;
            }
            repaint();
        }
    }
}
