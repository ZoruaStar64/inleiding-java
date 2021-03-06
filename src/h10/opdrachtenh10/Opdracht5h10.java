package h10.opdrachtenh10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht5h10 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    Label label, label2, label3;
    String ingave1, ingave2, ingave3, tekst, tekst2;
    double Cijfer1;
    double Cijfer2;
    double Cijfer3;
    double totaal;

    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("Cijfer 1");
        tekstvak2 = new TextField("", 5);
        label2 = new Label("Cijfer 2");
        tekstvak3 = new TextField("",5);
        label3 = new Label("Cijfer 3");
        tekstvak.addActionListener(new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        tekstvak3.addActionListener(new TekstvakListener());
        tekst = "";
        tekst2 = "";
        add(label);
        add(label2);
        add(label3);
        add(tekstvak);
        add(tekstvak2);
        add (tekstvak3);
        totaal = (Cijfer1 + Cijfer2 + Cijfer3) / 3;
    }


    public void paint(Graphics g) {
        g.setFont(new Font("TimesRoman",Font.BOLD,12));
        g.setColor(Color.black);
        g.drawString(tekst,12,100);
        g.drawString(tekst2,12,130);
        g.drawString("Uw Gemiddelde = " +totaal, 12,60);
    }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ingave1 = tekstvak.getText();
            ingave2 = tekstvak2.getText();
            ingave3 = tekstvak3.getText();
            Cijfer1 = Double.parseDouble( ingave1);
            Cijfer2 = Double.parseDouble( ingave2);
            Cijfer3 = Double.parseDouble( ingave3);
            totaal = (Cijfer1 + Cijfer2 + Cijfer3) / 3;
            if  (totaal > 5.4 && !(totaal > 10.1)) {
                tekst = "Voldoende u bent geslaagd";
            }

            else {
                tekst = "Onvoldoende u bent niet geslaagd";
                tekst2 = "Als het gemiddelde boven de 10 komt vul dan uw getallen in met 1-10";
            }
            repaint();
        }
    }
}
// && !(totaal > 10.1)