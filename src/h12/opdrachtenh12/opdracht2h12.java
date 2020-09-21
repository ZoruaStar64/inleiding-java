package h12.opdrachtenh12;

import java.applet.Applet;
import java.awt.*;


public class opdracht2h12 extends Applet {
    Button[] e;


    public void init() {
        e = new Button[25];
        for (int teller = 0; teller < e.length; teller++) {
            e[teller] = new Button("" +teller);
            add(e[teller]);

        }
    }



    public void paint(Graphics g){
        }
    }
