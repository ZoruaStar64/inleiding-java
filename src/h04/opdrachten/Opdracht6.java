package h04.opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.setColor(Color.BLACK);
        g.drawLine(150,150,150,250);
        g.fillRect(135,148,30,50);
        g.setColor(Color.red);
        g.fillOval(145,153,10,10);
        g.setColor(Color.orange);
        g.fillOval(145,168,10,10);
        g.setColor(Color.green);
        g.fillOval(145,183,10,10);
    }
}
