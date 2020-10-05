package h14.opdrachtenh14;

import java.awt.*;
import java.applet.*;
import java.net.URL;

public class praktijkopdrachth14 extends Applet {

    private URL pad;
    private AudioClip Win;

    public void init() {

        pad = praktijkopdrachth14.class.getResource("./DevelopingFiles/");
        Win = getAudioClip(pad, "i-win.wav");

    }
    public void paint(Graphics g) {
        Win.play();
    }
}
