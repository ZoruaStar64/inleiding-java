package h12.h12test;

import java.awt.*;
import java.applet.*;

public class maximumarray extends Applet {
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double maximum;

    public void init() {
        maximum = salaris[0];
        for (int teller = 0; teller < salaris.length; teller ++) {
            if(salaris[teller] > maximum) {
                maximum = salaris[teller];
            }
        }
    }

    public void paint(Graphics g)  {
        g.drawString("Het maximum is: " + maximum, 50, 20);
    }
}

