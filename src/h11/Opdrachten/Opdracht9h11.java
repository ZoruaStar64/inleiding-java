package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class Opdracht9h11 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int y;
        int x;
        int width;
        int height;
//eerste
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawRect(50, 50, 240, 240);
        width = 30;
        height = 30;
        y = 50;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        //tweede
        width = 30;
        height = 30;
        y += height;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        //derde
        width = 30;
        height = 30;
        y += height;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        //vierde
        width = 30;
        height = 30;
        y += height;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        //vijfde
        width = 30;
        height = 30;
        y += height;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        //zesde
        width = 30;
        height = 30;
        y += height;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        //zevende
        width = 30;
        height = 30;
        y += height;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);

            }
            x += width;
        }
        //achtste
        width = 30;
        height = 30;
        y += height;
        x = 50;
        for (int kolom = 0; kolom < 8; kolom++) {

            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            }
            x += width;
        }
    }
}