package h13.Testh13;

import java.awt.*;
import java.applet.*;

public class Methode2 extends Applet {

    double[] getallen = { 2, 4, 6, 8};
    double gemiddelde;

    public void init() {
        gemiddelde = berekenGemiddelde(getallen);
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde, 50, 60 );
    }

    /*
     *geeft gemiddelde van reeks getallen
     *@param array van doubles
     *@return double gemiddelde
     */
    double berekenGemiddelde(double[] d) {
        int teller;
        double som = 0;
        double gem;

        for (teller = 0; teller < d.length; teller++) {
            som += d[teller];
        }
        gem = som / d.length;

        return gem;
    }
}
