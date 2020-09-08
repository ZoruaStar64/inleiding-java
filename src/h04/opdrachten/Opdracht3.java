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
        g.setColor(Color.black);
        g.drawLine(100, 20, 100, 200);
        g.setColor(Color.red);
        g.fillRect(105, 20, 120, 30);
        g.setColor(Color.white);
        g.fillRect(105, 50, 120, 30);
        g.setColor(Color.blue);
        g.fillRect(105, 80, 120, 30);
    }
}
