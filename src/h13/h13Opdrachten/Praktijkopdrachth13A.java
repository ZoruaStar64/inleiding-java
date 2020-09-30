package h13.h13Opdrachten;

import java.awt.Color;
import java.awt.*;
import java.applet.*;

public class Praktijkopdrachth13A extends Applet {

    public void init(){

    }
    public void paint(Graphics g){


        Boom(g);
    }

    private void Boom (Graphics g) {
        Color Brown = new Color(170,70,40);
        g.setColor(Brown);
        g.fillRoundRect(150,150,30,100,20,20);
        Color NGreen = new Color(0,170,50);
        g.setColor(NGreen);
        g.fillOval(140,130,50,50);
        g.fillOval(140,115,50,50);
        g.fillOval(125,130,50,50);
        g.fillOval(155,130,50,50);
    }
}

