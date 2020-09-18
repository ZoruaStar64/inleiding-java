package h11.Test;

import java.applet.Applet;
import java.awt.*;

public class Opslag9H11codeNest extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawRect(50, 50, 240, 240);
        int width = 30;
        int height = 30;
        int x;
        int y;
        y = 50;
        x = 50;
        int loop;

        for (loop = 0; loop < 8; loop++) {
            for (int kolom = 0; kolom < 8; kolom++) {

                y += (height * loop);
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
            x = 50;
            y += height;
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
}
