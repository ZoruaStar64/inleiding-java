package h11.Opdrachten;

import java.awt.*;
import java.applet.*;


public class Opdracht1h11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;

        for (teller = 0; teller < 11; teller++) {
            x += 20;
            y += 20;
            g.drawLine(x, 20, x, 275);
            g.drawString("" + teller, x, 20);
        }
    }
}
