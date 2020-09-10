package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht2h6 extends Applet {
    int seconde;
    int uur;
    int dag;
    int jaar;
    int schrikkeljaar;

    public void init() {
        seconde = 1;
        uur = seconde * 3600;
        dag = uur * 24;
        jaar = dag * 365;
        schrikkeljaar = dag * 366;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawString("seconden in 1 uur " + "=" + "" + uur,40,10);
        g.drawString("seconden in 1 dag " + "=" + "" + dag , 40,30);
        g.drawString("seconden in 1 jaar " + "=" + "" + jaar, 40,50);
        g.drawString( "seconden in 1 schrikkeljaar " + "=" + "" + schrikkeljaar, 40,70);
    }
}