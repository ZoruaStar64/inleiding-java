package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2h11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for (teller = 11; teller < 21; teller++) {
            y += 20;
            g.setFont(new Font("TimesRoman",Font.BOLD,20));
            g.drawString("" + teller, 50, y);
        }
    }
}
