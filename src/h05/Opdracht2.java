package h05;


import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    //declaratie
    int Valerie;
    int ValerieGewicht;
    int Jeroen;
    int JeroenGewicht;
    int Hans;
    int HansGewicht;
    int Width;

    public void init() {
        Valerie = 40;
        Jeroen = 100;
        Hans = 80;
        ValerieGewicht = Valerie*10 / 4;
        JeroenGewicht = Jeroen*10 / 4;
        HansGewicht = Hans*10 / 4;
        Width = 40;
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        g.drawLine(30, 20, 30, 270);
        g.drawLine(30, 270, 300, 270);
        super.paint(g);
        g2.setStroke(new BasicStroke(1));
        g.drawLine(30, 20, 300, 20);
        g.drawLine(30, 70, 300, 70);
        g.drawLine(30, 120, 300, 120);
        g.drawLine(30, 170, 300, 170);
        g.drawLine(30, 220, 300, 220);
        //Staven van kinderen
        g.setColor(Color.orange);
        g.fillRect(50, 270 - ValerieGewicht, Width, ValerieGewicht); //-100
        g.setColor(Color.red);
        g.fillRect(150, 270 - JeroenGewicht, Width, JeroenGewicht);
        g.setColor(Color.blue);
        g.fillRect(250, 270 - HansGewicht, Width, HansGewicht);
        g.setColor(Color.orange);
        g.drawString("Valerie", 45, 285);
        g.setColor(Color.red);
        g.drawString("Jeroen", 145, 285);
        g.setColor(Color.blue);
        g.drawString("Hans", 250, 285);
        g.setColor(Color.black);
        g.drawString("100", 10, 20);
        g.drawString("80", 15, 70);
        g.drawString("60", 15, 120);
        g.drawString("40", 15, 170);
        g.drawString("20", 15, 220);
        g.drawString("0", 18, 270);
        g.drawString("Gewicht in kg", 140, 12);
    }
}