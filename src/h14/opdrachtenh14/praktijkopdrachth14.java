package h14.opdrachtenh14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Arrays;
import java.util.Random;

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
    String grabber;
    String Errortext;
    String humantext;
    String computertext;
    String[] Botchoices;
    int converter;
    boolean PlayerTurn;

    public void init() {

        pad = praktijkopdrachth14.class.getResource("/DevelopingFiles/");
        WinSound = getAudioClip(pad, "rotten-day.wav");
        LoseSound = getAudioClip(pad, "i-win.wav");
        coin = getImage(pad, "Coin.png");
        Lose = getImage(pad, "Wario-wins.jpg");
        Win = getImage(pad, "Wario-loses.jpg");
        button = new Button("Take");
        tekstvak = new TextField();
        label = new Label("Take 1, 2 or 3 coins");
        button.addActionListener(new Subtractionlistener());
        tekstvak.addActionListener(new Subtractionlistener());
        add(button);
        add(tekstvak);
        add(label);
        Botchoices = new String[3];

    }
    public void paint(Graphics g) {
        //LoseSound.play();
        resize(400,400);
        g.drawString("" + Errortext, 105,50);
        g.drawString("" + humantext, 105,50);
        g.drawString("" + computertext, 105, 65);
        g.drawString("The total of remaining coins = " + aantal, 105, 80);
        int j = 1;
        int k = 1;
        for ( int i = 1; i <= aantal; i++) {
            k++;
            g.drawImage(coin, (40 * k + 20), (50 * j + 50 ), 40, 50, this);
            if (i % 5 == 0) {
                j++;
                k = 1;
            }
        }
    }


    public class Subtractionlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // De menselijke speler's input
            grabber = tekstvak.getText();
            converter = Integer.parseInt(grabber);

                PlayerTurn = true;
                if (converter == 1) {
                    aantal = aantal - converter;
                    humantext = "You took 1 coin";
                    Errortext = "";
                }
           else if (converter == 2) {
                aantal = aantal - converter;
                    humantext = "You took 2 coin";
                    Errortext = "";
            }
           else if (converter == 3) {
                aantal = aantal - converter;
                    humantext = "You took 3 coin";
                    Errortext = "";
            }
            else {
                Errortext = "Use the numbers 1, 2 or 3";
                humantext = "";
            }
            System.out.println(aantal);
            // Wario's beurt
            PlayerTurn = false;
            int random = new Random().nextInt(Botchoices.length);
            if (!PlayerTurn) {
                aantal = aantal - (random + 1);
                computertext = "Wario took " + "" + random + " coin(s)";
                Errortext = "";
            }
            PlayerTurn = true;
            if (aantal < 0) {
                aantal = 0;
            }
            repaint();
        if (aantal == 0 && !PlayerTurn) {
            LoseSound.play();
            }
        else if (aantal == 0 && PlayerTurn) {
            WinSound.play();
        }
        }
    }
}
