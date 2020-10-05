package h14.opdrachtenh14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class praktijkopdrachth14 extends Applet {

    private Image coin;
    private Image Lose;
    private Image Win;
    private URL pad;
    private AudioClip LoseSound;
    private AudioClip WinSound;
    Button button;
    TextField tekstvak;
    Label label;
    int aantal = 23;

    public void init() {

        pad = praktijkopdrachth14.class.getResource("/DevelopingFiles/");
        WinSound = getAudioClip(pad, "rotten-day.wav");
        LoseSound = getAudioClip(pad, "i-win.wav");
        coin = getImage(pad, "Coin.png");
        Lose = getImage(pad, "Wario-wins.jpg");
        Win = getImage(pad, "Wario-loses.jpg");
        button = new Button("Take");
        tekstvak = new TextField();
        label = new Label("Subtract 1 to 3 coins");
        button.addActionListener(new Subtractionlistener());
        tekstvak.addActionListener(new Subtractionlistener());
        add(button);
        add(tekstvak);
        add(label);

    }
    public void paint(Graphics g) {
        //LoseSound.play();
        resize(400,300);
        int j = 1;
        int k = 1;
        for ( int i = 1; i <= aantal; i++) {
            k++;
            g.drawImage(coin, (40 * k + 20), (50 * j ), 40, 50, this);
            if (i % 5 == 0) {
                j++;
                k = 1;
            }
        }
    }


    public class Subtractionlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        /*if (coin = 0) {
            LoseSound.play();
            }*/
        }
    }
}
