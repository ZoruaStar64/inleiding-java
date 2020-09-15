package h08.codetest;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3h8metenter extends Applet {
    TextField tekstvak;

    String s;
    //int Procent;
    Button ok;
    double teller;
    double a;


    public void init() {
        tekstvak = new TextField("", 30);
        tekstvak.addActionListener(new EnterListener());
        ok = new Button("Ok");
        ok.addActionListener(new KnopListener());
        add(tekstvak);
        add(ok);
        s = "";
    }


    public void paint(Graphics g) {
        g.drawString("Typ een getal in en druk op enter of de Ok knop", 80, 50);
        g.drawString("om uw totaalbedrag inclusief btw te zien.",80,65);
        g.drawString("€ " + s, 100, 100);
        g.drawString("Uw totaal inclusief btw komt hier onder te staan.", 80, 85);
    }

    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller= 1.21;
            s = tekstvak.getText();
            a = Double.parseDouble( s );
            s = "" + a * teller;
            tekstvak.setText("");
            repaint();
        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller= 1.21;
            s = tekstvak.getText();
            a = Double.parseDouble( s );
            s = "" + a * teller;
            tekstvak.setText("");
            repaint();
        }
    }
}
