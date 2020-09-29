package h13.h13Opdrachten;


import java.awt.*;
import java.applet.*;

public class opdracht2h13 extends Applet{

    public void init() {

    }

    public void paint(Graphics g){
      int x1 = 50;
      int y1 = 100;
      int width = 30;
      int height = 20;

    aRedGreatWall(g,x1,y1,width,height);

    }

    private void aRedGreatWall(Graphics g, int x1, int y1, int width, int height) {
        for (int loop = 0; loop < 4; loop++) {
            x1 = 50;
            for (int row = 0; row < 8; row++) {
                g.setColor(Color.red);
                g.fillRect(x1, y1, width, height);
                g.setColor(Color.black);
                g.drawRect(x1, y1, width, height);
                y1 = (height * loop + 120);
                x1 += width;
            }
        }
    }
}
