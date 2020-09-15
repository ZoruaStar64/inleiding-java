package h10.test10;


import java.awt.*;
import java.applet.*;


    public class Operatortest extends Applet {

        public void init() {}


        public void paint(Graphics g) {
            //g.drawString("" + 8 + " is groter dan " + 5 + ": " + (8 > 5), 50, 60 );
            //g.drawString("" + 8 + " is kleiner dan " + 5 + ": " + (8 < 5), 50, 80 );
            g.drawString("8 " + " is groter dan " + " 5 : " + (8 > 5), 50, 60 );
            g.drawString("8 "  + " is kleiner dan " + " 5 : " + (8 < 5), 50, 80 );
        }
    }

