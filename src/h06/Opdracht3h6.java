package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht3h6 extends Applet {
    int a;
    int b;
    int c;


    public void init() {
        a = 2147483646;
        b = 4;
        c = a + b;

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
g.drawString("" + c,50,50);
    }
}