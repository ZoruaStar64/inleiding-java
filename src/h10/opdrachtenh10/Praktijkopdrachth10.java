package h10.opdrachtenh10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Praktijkopdrachth10 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    Label label, label2, label3;
    String ingave1, ingave2, ingave3, tekst, tekst2;
    double Cijfer1;
    double Cijfer2;
    double Cijfer3;
    double totaal;
    Color kleur;

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
        //g.setFont maakt een nieuwe font aan (de size verandert juist de grootte van de tekst
        g.setFont(new Font("TimesRoman",Font.BOLD,15));
        //deze lijn hieronder laat het gemiddelde resultaat zien van de ingevulde getallen
        g.setColor(kleur);
        g.drawString(tekst,12,120);
        g.drawString(tekst2,12,135);
        g.setFont(new Font("TimesRoman",Font.BOLD,12));
        g.setColor(Color.black);
        g.drawString("Voer 3 cijfers in de tekstvakken",12,80);
        g.drawString("De tekstvakken zijn op volgorde van de tekst naast hun",12,100);
        g.drawString("U kan ook kommagetallen invoeren", 12,60);
        g.setFont(new Font("TimesRoman",Font.BOLD,15));
        g.drawString("Uw Gemiddelde = " +totaal, 12,40);
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
            if  (totaal > 7.9 && totaal < 10.1) {
                tekst = "Het gemiddelde resultaat = Goed";
                kleur = Color.green;
            }

            else if (totaal > 5.9 && totaal < 8  ) {
                tekst = "Het gemiddelde resultaat = Voldoende";
                kleur = Color.yellow;
            }
            else if (totaal > 4.9 && totaal < 6  ) {
                tekst = "Het gemiddelde resultaat = Matig";
                kleur = Color.orange;
            }
            else if (totaal > 3.9 && totaal < 5  ) {
                tekst = "Het gemiddelde resultaat = Onvoldoende";
                kleur = Color.pink;
            }
            else if (totaal > 0.9 && totaal < 4  ) {
                tekst = "Het gemiddelde resultaat = Slecht";
                kleur = Color.red;
            }
            else {
                tekst = "Getal is buiten bereik zorg ervoor";
                tekst2 = "dat het gemiddelde tussen de 1-10 is";
            }
            repaint();
        }
    }
}
//(totaal > 7.9)
//tekst2 = "Als het gemiddelde boven de 10 komt vul dan uw getallen in met 1-10";