package h04.opdrachten;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(1));
        g.setColor(Color.BLACK);
        g.drawLine(10,10,110,10);
        g.drawRect(10,35,100,75);
        g.drawRoundRect(10,130,100,75,10,10);
        g.setColor(Color.magenta);
        g.fillRect(150,35,100,75);
        g.setColor(Color.black);
        g.drawOval(150,35,100,75);
        g.setColor(Color.magenta);
        g.fillOval(150,130,100,75);
        g.setColor(Color.black);
        g.drawOval(320,35,100,75);
        g.setColor(Color.magenta);
        g.fillArc(320,35,100,75,0,30);
        g.setColor(Color.black);
        g.drawArc(335,130,75,75,0,360);
        g.drawString("Lijn",40,22);
        g.drawString("Rechthoek", 24, 123);
        g.drawString("Afgeronde Rechthoek",10, 220);
        g.drawString("Gevulde Rechthoek met Ovaal", 115,123);
        g.drawString("Gevulde Ovaal", 165, 220);
        g.drawString("Taartpunt met Ovaal eromheen",300,123);
        g.drawString("Cirkel",360,220);

    }
}
