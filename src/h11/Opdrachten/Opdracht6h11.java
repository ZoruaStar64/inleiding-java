package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht6h11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int y = 0;
        int height = 0;
        int width = 0;

        for (teller = 1; teller <= 5; teller++) {
            x -= 5;
            y -= 5;
            width += 10;
            height += 10;
            g.setFont(new Font("TimesRoman",Font.BOLD,20));
            g.drawOval(100 + x,100 + y,width ,height);
        }
    }
}
