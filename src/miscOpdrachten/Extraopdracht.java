package miscOpdrachten;

import java.applet.*;
import java.awt.*;

public class Extraopdracht extends Applet {

    String naam;


    public void init() {
        naam = "Sander Borgman";
    }
    public void paint(Graphics g) {
        for (int teller = 0; teller < 10; teller++) {
            g.drawString("" + naam, 100, (15 * teller) + 50);
            if (teller == 4) {
                g.drawString("Je bent nu op de helft van de loop", 200,(15 * 4) + 50);
            }
        }
    }
}
