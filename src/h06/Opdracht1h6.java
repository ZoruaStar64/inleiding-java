package h06;

import java.awt.*;
import java.applet.*;

public class Opdracht1h6 extends Applet {
    double Jan, Ali, Jeanette, Ik;
    double inkomst;
    double deling;


    public void init() {
        inkomst = 113;
        deling = inkomst / 4;
        Jan = deling;
        Ali = deling;
        Jeanette = deling;
        Ik = deling;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        g.drawString( "113 / 4 = " + "" + deling + " Euro", 40,10);
        g.drawString( "Jan krijgt  " + "" + deling, 40,30);
        g.drawString( "Ali krijgt  " + "" + deling, 40,50);
        g.drawString( "Jeanette krijgt  " + "" + deling, 40,70);
        g.drawString( "Ik krijg  " + "" + deling, 40,90);
    }
}
