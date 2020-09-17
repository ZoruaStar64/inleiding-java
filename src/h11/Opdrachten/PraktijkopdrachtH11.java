package h11.Opdrachten;


import java.applet.Applet;
import java.awt.*;

public class PraktijkopdrachtH11 extends Applet {
    TextField tekstvak;
    Label label;
    Button button;

    public void init() {
        tekstvak = new TextField("", 5);
        label = new Label("Cijfer 1");
        //tekstvak.addActionListener(new TekstvakListener());
        button = new Button("Ok");
        add(tekstvak);
        add(label);
        add(button);
    }

    public void paint(Graphics g) {
        int teller2;
        int teller;
        int tafel = 1;
        int y = 0;


        for (teller = 1; teller <= 10; teller++) {
            y += 20;
            g.setFont(new Font("TimesRoman",Font.BOLD,20));
            teller2 = tafel * teller;
            g.drawString("" + teller + " x " + tafel + " = " + teller2, 50, y);
        }
    }
}