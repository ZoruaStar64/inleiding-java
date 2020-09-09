package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht1h6 extends Applet {
    int Jan, Ali, Jeanette, Ik;


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));

    }
}
