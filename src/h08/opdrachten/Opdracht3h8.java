package h08.opdrachten;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3h8 extends Applet {
    TextField tekstvak;
    Button ok;
    String s;
    //int Procent;
    double teller;
    double a;


    public void init() {
        tekstvak = new TextField("", 30);
        ok = new Button("Ok");
        ok.addActionListener(new KnopListener());
        add(tekstvak);
        add(ok);
        s = "";
    }


    public void paint(Graphics g) {
        g.drawString("Typ een getal in en klik op Ok om uw totaalbedrag inclusief btw te zien.", 10, 50);
        g.drawString("€ " + s, 100, 100);
        g.drawString("Uw totaal inclusief btw komt hier onder te staan.", 80, 85);
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
