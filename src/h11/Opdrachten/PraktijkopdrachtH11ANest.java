package h11.Opdrachten;

import java.applet.Applet;
import java.awt.*;

public class PraktijkopdrachtH11ANest extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawRect(50, 50, 240, 240);
        int width = 30;
        int height = 30;
        int x = 50, y = 50;

        for (int loop = 0; loop < 8; loop++) {
            x = 50;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (loop == 0 || loop == 2 || loop == 4 || loop == 6) {
                    y = (height * loop + 50);
                }
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
            if (loop == 1 || loop == 3 || loop == 5 || loop == 7) {
                y = (height * loop + 50);
            }
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
