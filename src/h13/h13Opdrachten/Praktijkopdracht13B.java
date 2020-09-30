package h13.h13Opdrachten;

import java.awt.Color;
import java.awt.*;
import java.applet.*;

public class Praktijkopdracht13B extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
    int x1 = 50;
    int x2 = 40;
    int x3 = 25;
    int x4 = 55;
    int y1 = 50;
    int y2 = 30;
    int y3 = 15;
    int width1 = 15;
    int width2 = 25;
    int height1 = 50;
    int height2 = 25;

        BoomGaard(g, x1, x2,x3,x4,y1,y2,y3,width1,width2,height1,height2);
    }

    private void BoomGaard(Graphics g, int x1, int x2, int x3, int x4, int y1,int y2,int y3, int width1, int width2,int height1,int height2) {
        for (int loop = 0; loop < 2; loop++) {
            x1 = 50;
            x2 = 40;
            x3 = 25;
            x4 = 55;
            y1 = (y1 * loop + 50);
            y2 = (y2 * loop + 30);
            y3 = (y3 * loop + 15);
            for (int row = 0; row < 5; row++) {
                Color Brown = new Color(170, 70, 40);
                g.setColor(Brown);
                g.fillRoundRect(x1, y1, width1, height1, 20, 20);
                Color NGreen = new Color(0, 170, 50);
                g.setColor(NGreen);
                g.fillOval(x2, y2, width2, height2);
                g.fillOval(x2, y3, width2, height2);
                g.fillOval(x3, y2, width2, height2);
                g.fillOval(x4, y2, width2, height2);
                x1 =+ height1;
                x2 =+ height1;
                x3 =+ height1;
                x4 =+ height1;
            }
        }
    }
}