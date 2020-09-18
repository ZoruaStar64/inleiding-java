package h11.Opdrachten;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkopdrachtH11 extends Applet {
    TextField tekstvak;
    Label label;
    Button button;
    int teller2;
    int teller;
    int y = 50;
    String ingave1;
    int ingave2;

    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("Voer een getal in en klik op Ok");
        tekstvak.addActionListener(new TekstvakListener());
        button = new Button("Ok");
        button.addActionListener(new TekstvakListener());
        add(tekstvak);
        add(label);
        add(button);

    }

    public void paint(Graphics g) {
                for (teller = 1; teller <= 10; teller++) {

                    g.setFont(new Font("TimesRoman", Font.BOLD, 20));
                    ingave2 = Integer.parseInt(ingave1);
                    teller2 = ingave2 * teller;
                    g.drawString(teller + " x " + ingave2 + " = " + teller2, 100, y);
                    y += 20;
                }
            }
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ingave1 = tekstvak.getText();
            tekstvak.setText("");
            y = 50;
            repaint();
        }
    }
}