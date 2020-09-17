package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4h11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller2;
        int teller;
        int y = 0;


        for (teller = 1; teller <= 10; teller++) {
            y += 20;
            g.setFont(new Font("TimesRoman",Font.BOLD,20));
            teller2 = 3 * teller;
            g.drawString("3 x " + teller + " = " + teller2, 50, y);
        }
    }
}
