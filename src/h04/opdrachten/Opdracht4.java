package h04.opdrachten;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet {

    public void init() {

        new Opdracht3();
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.setColor(new Color(79, 49, 58));
        g.drawLine(30, 20, 30, 270);
        g.drawLine(30,270, 300,270);
        g2.setStroke(new BasicStroke(1));
        g.drawLine(30,20,300, 20);
        g.drawLine(30,70,300,70);
        g.drawLine(30,120, 300,120);
        g.drawLine(30, 170,300,170);
        g.drawLine(30,220,300,220);
        g.setColor(Color.orange);
        g.fillRect(50,170,30,100);
        g.setColor(Color.red);
        g.fillRect(150, 20,30,250);
        g.setColor(Color.blue);
        g.fillRect(250,70,30,200);
        g.setColor(Color.orange);
        g.drawString("Valerie", 45, 285);
        g.setColor(Color.red);
        g.drawString("Jeroen", 145, 285);
        g.setColor(Color.blue);
        g.drawString("Hans", 250, 285);
        g.setColor(Color.black);
        g.drawString("100",10,20);
        g.drawString("80", 15,70);
        g.drawString("60", 15, 120);
        g.drawString("40", 15, 170);
        g.drawString("20", 15, 220);
        g.drawString("0", 18, 270);
        g.drawString("Gewicht in kg", 140,12);
    }
}
