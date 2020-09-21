package h12.h12test;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class opdracht3h12opslag extends Applet {
    TextField[] a;
    int[] result;
    Button b;


    public void init() {
        a = new TextField[6];
        for (int teller = 1; teller < a.length; teller++) {
            a[teller] = new TextField("", 7);
            add(a[teller]);
        }
        b = new Button("Sort");
        add(b);
        b.addActionListener(new SortListener());
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < a.length; teller++) {
            g.drawString("" + a[teller], 10, 20 * teller + 100);
            g.drawString("" + a[1] , 10, 50);

        }
    }

    class SortListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Arrays.sort(a);
            repaint();
        }
    }
}
