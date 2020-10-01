package h14.testh14;

import java.awt.*;
import java.applet.*;
import java.net.URL;

public class Afbeelding extends Applet {

    private Image afbeelding;
    private URL pad;

    public void init() {
        /* uitgangspunt is dat de package "resources"
                in dezelfde package zit als de java klasse*/
        pad = Afbeelding.class.getResource("./resources/");
        afbeelding = getImage(pad, "Tom Nook waving.gif");
    }

    public void paint(Graphics g) {
        g.drawString(pad.toString(), 20, 10 );
        g.drawImage(afbeelding, 20, 20, 400, 300, this);
    }
}