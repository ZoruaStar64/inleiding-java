package h04;


//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class LijnenEnRechthoeken extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.orange);
        g.drawRect(75, 20, 100, 50);
        g.fillRect(75, 80, 100, 50);
        g.drawLine(20, 75, 240, 75);
        g.drawRoundRect(50, 150, 100, 50, 20, 20);
        g.drawRoundRect(50, 200, 50, 50, 20, 20);
    }
}