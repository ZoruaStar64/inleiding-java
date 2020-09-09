package h05;


import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet {
        Color MAGENTA;
        Color BLACK;
        int Width;
        int Height;


    public void init() {
        MAGENTA = Color.MAGENTA;
        BLACK = Color.BLACK;
        Width = 200;
        Height = 100;
    }

    public void paint(Graphics g) {
        //Line
        g.drawLine(100,50,300,50);
        //Rectangle
        g.drawRect(100,100,Width,Height);
        //RoundRectangle
        g.drawRoundRect(100,225,Width,Height,30,30);
        //Filled Rectangle
        g.setColor(MAGENTA);
        g.fillRect(315,100,Width,Height);
        //Oval
        g.setColor(BLACK);
        g.drawOval(315,100,Width,Height);
        //Filled Oval
        g.setColor(MAGENTA);
        g.fillOval(315,225,Width,Height);
        //oval with cakeslice
        g.setColor(BLACK);
        g.drawOval(530,100,Width,Height);
        g.setColor(MAGENTA);
        g.fillArc(530,100,Width,Height,0,25);
        //Circle
        g.setColor(BLACK);
        g.drawOval(580,225,100,100);
        //Strings/text
        g.drawString("Lijn",175,65);
        g.drawString("Rechthoek",160,215);
        g.drawString("Afgeronde Rechthoek",150,340);
        g.drawString("Gevulde Rechthoek Met Ovaal",335,215);
        g.drawString("Gevulde Ovaal",370,340);
        g.drawString("Ovaal met taartpunt",580,215);
        g.drawString("Cirkel",615,340);
    }
}
