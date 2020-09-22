package h12.opdrachtenh12;

import java.awt.*;
import java.applet.*;



public class opdracht5h12 extends Applet {
    double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };
    double maximum;

    public void init() {
        maximum = salaris[0];
        for (int teller = 0; teller < salaris.length; teller ++) {
            if(salaris[teller] > maximum) {
                maximum = salaris[teller];
                System.out.println(maximum);
            }
        }
    }

    public void paint(Graphics g)  {
        g.drawString("Het maximum is: " + maximum, 50, 20);
    }
}
