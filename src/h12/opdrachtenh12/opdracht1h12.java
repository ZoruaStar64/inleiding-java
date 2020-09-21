package h12.opdrachtenh12;

import java.applet.Applet;
import java.awt.*;

public class opdracht1h12 extends Applet {
    double[] getallen;
    double Gemiddelde;
    double a = 34.5;


    public void init() {
        getallen = new double[10];
        for (int teller = 0; teller < getallen.length; teller++) {
            getallen[teller] = a * teller + 10;
            Gemiddelde = (a * teller + 10) / 10;
        }
    }
    public void paint(Graphics g){
        for (int teller = 0; teller < getallen.length; teller++) {
            g.drawString("" + getallen[teller], 200, 20 * teller + 20);
            g.drawString("Gemiddelde = " + Gemiddelde, 50, 20);
        }
    }
}