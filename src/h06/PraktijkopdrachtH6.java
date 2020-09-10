package h06;

import java.awt.*;
import java.applet.*;

public class PraktijkopdrachtH6 extends Applet {
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double gemiddelde;
    double gebroken;


    public void init() {
        cijfer1 = 5.9;
        cijfer2 = 6.3;
        cijfer3 = 6.9;
        gemiddelde = (cijfer1 + cijfer2 + cijfer3) / 3;
        gemiddelde = (int) (gemiddelde * 10);
        gebroken = gemiddelde / 10;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawString("Het gemiddelde is: " + gebroken, 20, 20);
    }
}
