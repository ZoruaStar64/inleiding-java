package h13.h13Opdrachten;

import java.awt.*;
import java.applet.*;

public class opdracht1h13 extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
    int x1 = 50;
    int y1 = 100;
    int x2 = 100;
    int y2 = 50;
    int x3 = 150;
    int y3 = 100;

    drawDrieHoek(g, x1, y1, x2, y2, x3, y3);

    }

  private void drawDrieHoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        //dit tekent een driehoek
      g.drawLine(x1, y1, x2, y2);
      g.drawLine(x2, y2, x3, y3);
      g.drawLine(x1, y1, x3, y3);
    }
}
