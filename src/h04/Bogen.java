package h04;

import java.awt.*;
import java.applet.*;

public class Bogen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.setColor(Color.black);
        g.drawArc(20, 20, 100, 50, 0, 180);
        g.drawArc(100, 20, 100, 50, 0, 90);
        g.drawArc(20, 60, 100, 50, 90, 180);
    }
}
