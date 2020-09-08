package h04.opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.setColor(Color.BLACK);
        g.drawRect(150, 150, 100, 100);
        g.drawLine(150, 150, 200, 75);
        g.drawLine(250, 150, 200, 75);
        g.drawRect(165, 210, 25, 40);
        g.drawRect(200, 185, 35, 35);
    }
}
