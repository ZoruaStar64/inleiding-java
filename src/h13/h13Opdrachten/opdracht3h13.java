package h13.h13Opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht3h13 extends Applet {
    Button Red;
    Button gray;
    Label label;
    boolean rood;
    boolean grijs;

    public void init() {
    Red = new Button ("Spawn Red Wall");
    Red.addActionListener(new Brickspawner());
    gray = new Button ("Spawn Gray Wall");
    gray.addActionListener(new Betonspawner());
    add(Red);
    add(gray);
    label = new Label("Press a Button to spawn a wall");
    add(label);
    }

    public void paint(Graphics g) {
        int x = 20;
        int y = 50;
        int width1 = 30;
        int height1 = 20;
        int width2 = 45;
        int height2 = 35;

        if (rood == true) {
        aRedGreatWall(g,x,y,width1,height1);}
        if (grijs == true) {
        eenGroteBetonnenMuur(g,x,y,width2,height2);}
    }
    class Brickspawner implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           rood = true;
           grijs = false;
           repaint();
       }
    }
    class Betonspawner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            grijs = true;
            rood = false;
            repaint();
        }
    }
    private void aRedGreatWall (Graphics g,int x, int y, int width1, int height1) {
                for (int loop = 0; loop < 4; loop++) {
                    x = 80;
                    y = (height1 * loop + 100);
                    for (int row = 0; row < 8; row++) {
                        g.setColor(Color.red);
                        g.fillRect(x, y, width1, height1);
                        g.setColor(Color.black);
                        g.drawRect(x, y, width1, height1);
                        x += width1;
                    }
                }
            }

    private void eenGroteBetonnenMuur(Graphics g, int x, int y, int width2, int height2){
        for (int loop = 0; loop < 4; loop++) {
            x = 20;
            y = (height2 * loop + 100);
            for (int row = 0; row < 8; row++) {
                g.setColor(Color.gray);
                g.fillRect(x, y, width2, height2);
                g.setColor(Color.black);
                g.drawRect(x, y, width2, height2);
                x += width2;
            }
        }
    }
}
