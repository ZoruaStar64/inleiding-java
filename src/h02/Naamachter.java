package h02;

import java.awt.*;
import java.applet.*;

//een klasse met de naam h021.h02.Naam van het type Applet
public class Naamachter extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Sander", 150, 150);
        g.setColor(Color.red);
        g.drawString("Borgman", 150, 170);
    }


}

