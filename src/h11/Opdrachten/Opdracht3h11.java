package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht3h11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int a = 1;
        int b = 1;
        int teller;
        int fib;
        int y = 0;

        for (teller = 0; teller <= 20; teller++) {
            y += 20;
            g.setFont(new Font("TimesRoman",Font.BOLD,15));
            fib = a + b;
            g.drawString("" + fib, 50, y);
            a = b;
            b = fib;

        }
    }
}