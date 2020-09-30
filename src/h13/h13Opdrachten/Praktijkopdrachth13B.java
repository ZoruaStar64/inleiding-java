package h13.h13Opdrachten;

import java.awt.Color;
import java.awt.*;
import java.applet.*;

public class Praktijkopdrachth13B extends Applet {

    public void init(){

    }
    public void paint(Graphics g) {

        for (int loop = 0; loop < 2; loop++) {

            for (int row = 0; row < 5; row++) {
                BoomGaard(g, row * 80, loop * 150);
            }
        }
    }

    private void BoomGaard (Graphics g, int x, int y) {
        Color Brown = new Color(170,70,40);
        g.setColor(Brown);
        g.fillRoundRect(25 + x,50 + y,30,100,20,20);
        Color NGreen = new Color(0,170,50);
        g.setColor(NGreen);
        g.fillOval(15 + x,30 + y,50,50);
        g.fillOval(15 + x,15 + y,50,50);
        g.fillOval(x,30 + y,50,50);
        g.fillOval(30 + x,30 + y,50,50);
    }
}