package h04.opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.setColor(Color.BLACK);
        g.drawRect(150,150,100,100);
        g.fillOval(170,165,20,20);
        g.fillOval(215,165,20,20);
        g.fillOval(170,215,20,20);
        g.fillOval(215,215,20,20);
    }
}
