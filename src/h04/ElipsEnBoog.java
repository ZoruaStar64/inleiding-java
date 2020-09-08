package h04;


import java.awt.*;
import java.applet.*;

public class ElipsEnBoog extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(5));
            //thick
        g.setColor(Color.cyan);
        g.drawOval(20, 20, 100, 100);
        g.setColor(Color.yellow);
        g.drawOval(80, 80, 100, 100);
        g.setColor(Color.black);
        g.drawOval(140, 20, 100, 100);
        g.setColor(Color.green);
        g.drawOval(200, 80, 100, 100);
        g.setColor(Color.red);
        g.drawOval(260, 20, 100, 100);
        g.drawArc(20, 250, 100, 50, 360, 180);
    }
}

