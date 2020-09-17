package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht7h11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int y = 0;
        int height = 0;
        int width = 0;

        for (teller = 1; teller <= 50; teller++) {
            x -= 3;
            y -= 3;
            width += 10;
            height += 10;
            g.setFont(new Font("TimesRoman",Font.BOLD,20));
            g.drawOval(250 + x,250 + y,width ,height);
        }
    }
}
