package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht8h11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int y = 0;
        int height = 0;
        int width = 0;

        for (teller = 1; teller <= 150; teller++) {
            x += 2;
            y += 2;
            width += 5;
            height += 5;
            g.setFont(new Font("TimesRoman",Font.BOLD,20));
            g.drawOval(10 + x,10 + y,width ,height);
        }
    }
}
//ga naar de rechts onderste hoek klik en neem het naaronder om de applet grootte te vergroten