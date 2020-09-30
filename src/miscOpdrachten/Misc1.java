package miscOpdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// plan = maak een applet die als een getal ingetikt wordt bvb: 13.
// dat het voor elk even getal zoekt 2,4,6,8,10,12.
// uit deze getallen wordt dan uitgezocht welke te delen door 6 zijn.
// daarna worden de getallen die door 6 te delen zijn met hetzelfde getal vermenigvuldigd.
// tot slot telt het de even getallen en vermenigvuldigde getallen bijelkaar op om het totaal te krijgen.
public class Misc1 extends Applet {

    TextField tekstvak;
    Button button;
    Label label;
    int total;
    int number;
    String text;
    String grabber;
    int times;

    public void init() {
        tekstvak = new TextField(5);
        tekstvak.addActionListener(new TextListener());
        button = new Button("Calculate");
        button.addActionListener(new TextListener());
        label = new Label("Type any positive number!");
        add(tekstvak);
        add(button);
        add(label);
    }

    public void paint(Graphics g) {
        g.drawString("" + total, 150, 150);
        g.drawString("" + text, 150,100);
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            grabber = tekstvak.getText();
            total = Integer.parseInt(grabber);
            number = Integer.parseInt(grabber);
            if (total > 0 && total <= number) {
                for (int x = 1; x <= total; x++) {
                    if (x % 2 == 0) {
                        text = "" + x;
                        if (x % 6 == 0) {
                        times = x * x;

                        }
                        repaint();
                    }
                }
            }
        }
    }
}
