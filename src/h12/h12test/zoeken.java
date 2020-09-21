package h12.h12test;

import java.awt.*;
import java.applet.*;

public class zoeken extends Applet {
    boolean gevonden;
    double[] salaris = { 100.0, 200.0, 300.0, 400.0, 500.0 };
    double gezocht;

    public void init() {
        gezocht = 400;
        gevonden = false;
        int teller = 0;
        while(teller < salaris.length) {
            if(salaris[teller] == gezocht) {
                gevonden = true;
            }
            teller ++;
        }
    }

    public void paint(Graphics g) {
        if(gevonden == true) {
            g.drawString("De waarde is gevonden.", 20, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 20, 50);
        }
    }
}
