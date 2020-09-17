package h04;

import java.awt.*;
import java.applet.*;

public class Test extends Applet {

    public void paint(Graphics g) {

        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawRect(50, 50, 250, 250);
    }
}