package h10.opdrachtenh10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht2h10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst, tekst2;
    int getal;
    int getalHoogst;
    int getalLaagst;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak.addActionListener( new Tekstvak2Listener() );
        tekst = "";
        tekst2 = "";
        add(label);
        add(tekstvak);
        getal = 0;
        getalHoogst = -2147483648;
        getalLaagst = 2147483647;
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 80 );
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
    class Tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            getal = Integer.parseInt( s);
            if  (getal < getalLaagst){
                getalLaagst = getal;
                tekst2 = "Het kleinste getal = "+ getalLaagst;
            }
            else {
                tekst2 = "Het kleinste getal = "+ getalLaagst;
            }
            repaint();
        }
    }
}
