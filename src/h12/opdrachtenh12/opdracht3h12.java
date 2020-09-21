package h12.opdrachtenh12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class opdracht3h12 extends Applet {
    public TextField[] a;
    int[] result;
    Button b;
    String[] s;
    int teller = 0;

    public void init() {
        result = new int[5];
        s = new String[5];

        //Tekstvakken met arrays
        a = new TextField[5];
        for (int teller = 0; teller < a.length; teller++) {
            a[teller] = new TextField("", 7);
            add(a[teller]);
        }
        //button
        b = new Button("Sort");
        add(b);
        b.addActionListener(new SortListener());
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < a.length; teller++) {
            g.drawString("" + result[teller], 10, 20 * teller + 100);
        }
    }


    class SortListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (teller = 0; teller < a.length; teller++) {
                s[teller] = a[teller].getText();
                result[teller] = Integer.parseInt(s[teller]);
            }
                    Arrays.sort(result);
                    for (int teller2 = 0; teller2 < a.length; teller2++) {
                        s[teller2] = String.valueOf(result[teller2]);
                        a[teller2].setText(s[teller2]);
                        repaint();
                    }
                }
            }
        }