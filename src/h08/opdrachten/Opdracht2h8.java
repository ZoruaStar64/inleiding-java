package h08.opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht2h8 extends Applet {
    Button Man;
    Button Vrouw;
    Button LeerlingM;
    Button LeerlingV;
    String SchermMan;
    String SchermVrouw;
    String SchermLM;
    String SchermLV;
    int teller1;
    int teller2;
    int teller3;
    int teller4;
    int totaal;

    public void init() {
        SchermMan = "";
        SchermVrouw = "";
        SchermLM = "";
        SchermLV = "";
        Man = new Button( "+1 man" );
      KnopMan kl = new KnopMan();
        Man.addActionListener( kl );
        add(Man);
        Vrouw = new Button( "+1 vrouw" );
        KnopVrouw kv = new KnopVrouw();
        Vrouw.addActionListener( kv );
        add(Vrouw);
        LeerlingM = new Button( "+1 LeerlingM" );
        KnopLM mv = new KnopLM();
        LeerlingM.addActionListener( mv );
        add(LeerlingM);
        LeerlingV = new Button( "+1 LeerlingV" );
        KnopLV lv = new KnopLV();
        LeerlingV.addActionListener( lv );
        add(LeerlingV);
        teller1 = 0;
        teller2 = 0;
        teller3 = 0;
        teller4 = 0;
        totaal = 0;
    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen = " + SchermMan, 50, 60 );
        g.drawString("Aantal vrouwen = " + SchermVrouw, 50, 75 );
        g.drawString("Aantal man leerlingen = " + SchermLM, 50, 90 );
        g.drawString("Aantal vrouw leerlingen = " + SchermLV, 50, 105 );
        totaal = teller1 + teller2 + teller3 + teller4;
        g.drawString("Totaal = " + totaal, 50,120);
        //Kan ook door in de drawString totaal juist totaal++ te maken
        //en het totaal in initialisatie -1 te maken
    }

    class KnopMan implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller1++;
            SchermMan = "" + teller1;
            repaint();
        }
    }
    class KnopVrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller2++;
            SchermVrouw = "" + teller2;
            repaint();
        }
    }
    class KnopLM implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller3++;
            SchermLM = "" + teller3;
            repaint();
        }
    }
    class KnopLV implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller4++;
            SchermLV = "" + teller4;
            repaint();
        }
    }
}
