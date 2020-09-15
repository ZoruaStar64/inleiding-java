package h10.opdrachtenh10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht3h10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int Maand;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het maandnummer en druk op enter");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman",Font.BOLD,20));
        g.setColor(Color.blue);
        //g.drawLine(50,300,200,300);
        g.drawString(tekst, 110, 75);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            Maand = Integer.parseInt(s);
            switch (Maand) {
                case 1:
                    tekst = "Januari - 31 dagen";
                    break;
                case 2:
                    tekst = "Februari - 28 dagen";
                    break;
                case 3:
                    tekst = "Maart - 31 dagen";
                    break;
                case 4:
                    tekst = "April - 30 dagen";
                    break;
                case 5:
                    tekst = "Mei - 31 dagen";
                    break;
                case 6:
                    tekst = "Juni - 30 dagen";
                    break;
                case 7:
                    tekst = "Juli - 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus - 31 dagen";
                    break;
                case 9:
                    tekst = "September - 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober - 31 dagen";
                    break;
                case 11:
                    tekst = "November - 30 dagen";
                    break;
                case 12:
                    tekst = "December - 31 dagen";
                    break;
                default:
                    tekst = "Kies een getal tussen 1-12";
                    break;
            }
            repaint();
        }
    }
}