package h10.test10;


import java.awt.*;
import java.applet.*;

public class EnOfNiet extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        g.drawString("" + 6 + " is groter dan "+ 5 + " en kleiner dan " +
                8  + ": " +(6 > 5 || 6 < 8), 50, 60 );
        g.drawString("" + 6 + " is groter dan "+ 5 + " en groter dan " +
                8 + ": " + (6 > 5 && 6 > 8), 50, 80 );
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en groter dan " +
                8 + ": " + (6 <  5 && 6 > 8), 50, 100 );
        g.drawString("" + 6 + " is kleiner dan "+ 5 + " en kleiner dan " +
                8 + ": " + (6 < 5 && 6 < 8), 50, 120 );
    }
}
//&& = alles moet waar zijn anders alle andere gevallen worden false aangegeven
//|| = een van beide moet waar zijn om true te krijgen anders zijn beide onwaar en geeft java false
//! maakt van true false en van false true