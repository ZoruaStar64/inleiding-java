package h12.h12test;


import java.awt.*;
import java.applet.*;
import java.util.*;

public class sorting extends Applet {
    String[] namen = { "Valerie", "Jeroen", "Sander", "Frank"};

    public void init() {
        Arrays.sort(namen);
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < namen.length; teller ++) {
            g.drawString("" + namen[teller], 50, 20 * teller + 20);
        }
    }
}
