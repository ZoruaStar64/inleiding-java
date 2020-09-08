package h04.opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.setColor(Color.BLACK);
        g.drawLine(50, 50, 150, 150);
        g.drawLine(50, 50, 50, 150);
        g.drawLine(50, 150, 150, 150);
    }
}

