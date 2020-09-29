package h13.h13Opdrachten;

import java.awt.Color;
import java.awt.*;
import java.applet.*;

public class Praktijkopdracht13B extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {


        BoomGaard(g);
    }

    private void BoomGaard(Graphics g) {
        for (int loop = 0; loop < 2; loop++) {
            Color Brown = new Color(170, 70, 40);
            g.setColor(Brown);
            g.fillRoundRect(50, 50, 30, 100, 20, 20);
            Color NGreen = new Color(0, 170, 50);
            g.setColor(NGreen);
            g.fillOval(40, 30, 50, 50);
            g.fillOval(40, 15, 50, 50);
            g.fillOval(25, 30, 50, 50);
            g.fillOval(55, 30, 50, 50);
        }
    }
}