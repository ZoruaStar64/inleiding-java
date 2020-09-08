package h04.opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(7));
        g.setColor(Color.BLACK);
        g.drawLine(100, 20, 100, 200);
        g.fillRect();
        g.fillRect();
        g.fillRect();
    }
}
