package h14.opdrachtenh14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class praktijkopdrachth14 extends Applet {

    private Image selectedimage;
    private Image coin;
    private Image Lose;
    private Image Win;
    private URL pad;
    private AudioClip LoseSound;
    private AudioClip WinSound;
    Button takebutton;
    Button restartbutton;
    TextField tekstvak;
    Label label;
    int aantal = 23;
    String grabber;
    String Errortext;
    String humantext;
    String computertext;
    String winorlose;
    String[] Botchoices;
    int converter;
    boolean PlayerTurn;

    public void init() {

        pad = praktijkopdrachth14.class.getResource("/DevelopingFiles/");
        WinSound = getAudioClip(pad, "rotten-day.wav");
        LoseSound = getAudioClip(pad, "i-win.wav");
        coin = getImage(pad, "Coin.png");
        Lose = getImage(pad, "Wario-Wins.png");
        Win = getImage(pad, "Wario-loses.png");
        takebutton = new Button("Take");
        restartbutton = new Button("Restart");
        tekstvak = new TextField();
        label = new Label("Take 1, 2 or 3 coins");
        takebutton.addActionListener(new Subtractionlistener());
        tekstvak.addActionListener(new Subtractionlistener());
        restartbutton.addActionListener(new Resetlistener());
        add(restartbutton);
        add(takebutton);
        add(tekstvak);
        add(label);
        Botchoices = new String[3];
        restartbutton.setBackground(Color.red);
    }
    public void paint(Graphics g) {
        //LoseSound.play();
        resize(400,400);
        g.drawString("" + humantext, 105,55);
        g.drawString("" + Errortext, 105,55);
        g.drawString("" + computertext, 105, 70);
        g.drawString("" + winorlose, 105, 300);
        g.drawString("The rules are simple: don't be the one that grabs the last coin!", 50,40);
        g.drawString("The total of remaining coins = " + aantal, 105, 85);
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
        g.drawImage(selectedimage, 100,100,150,150, this);
    }


    public class Subtractionlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // De menselijke speler's input
            grabber = tekstvak.getText();
            converter = Integer.parseInt(grabber);
            for (int fakeloop = 0; fakeloop == 0; fakeloop++) {
                PlayerTurn = true;
                if (converter == 1 || converter == 2 || converter == 3) {
                    aantal = aantal - converter;
                    humantext = "You took " + converter + " coin(s)";
                    Errortext = "";
                } else {
                    humantext = "";
                    Errortext = "Use the numbers 1, 2 or 3";
                    computertext = "";
                    repaint();
                    break;
                }
                if (aantal == 0) {
                    LoseSound.play();
                    selectedimage = Lose;
                    winorlose = "Wario won better luck next time!";
                    repaint();
                    break;
                }
                System.out.println(aantal);
                // Wario's beurt

                /*if (aantal == 0 && !PlayerTurn) {
                    LoseSound.play();
                    selectedimage = Lose;
                    winorlose = "Wario won better luck next time!";
                    repaint();
                    break;
                }*/
                PlayerTurn = false;
                int random = new Random().nextInt(Botchoices.length);
                if (aantal == 1) {
                aantal = aantal - 1;
                computertext = "Wario took 1 coin";
                    System.out.println(aantal);
                }
                else if (aantal == 2 || aantal == 3 || aantal == 4) {
                    computertext = "Wario took " + "" + (aantal - 1) + " coin";
                    aantal = 1;
                    System.out.println(aantal);
                }
                else if (aantal == 6 || aantal == 7 || aantal == 8) {
                    computertext = "Wario took " + "" + (aantal - 5) + " coins";
                    aantal = 5;
                    System.out.println(aantal);
                }
                else if (aantal == 10 || aantal == 11 || aantal == 12) {
                    computertext = "Wario took " + "" + (aantal - 9) + " coins";
                    aantal = 9;
                    System.out.println(aantal);
                }
                else if (aantal == 14 || aantal == 15 || aantal == 16) {
                    computertext = "Wario took " + "" + (aantal - 13) + " coins";
                    aantal = 13;
                    System.out.println(aantal);
                }
                else if (aantal == 18 || aantal == 19 || aantal == 20) {
                    computertext = "Wario took " + "" + (aantal - 17) + " coins";
                    aantal = 17;
                    System.out.println(aantal);
                }
                else if (aantal == 22) {
                    computertext = "Wario took " + "" + (aantal - 21) + " coins";
                    aantal = 21;
                    System.out.println(aantal);
                }
                else if (!PlayerTurn) {
                    aantal = aantal - (random + 1);
                    computertext = "Wario took " + "" + (random + 1) + " coin(s)";
                    System.out.println(aantal);
                }

                PlayerTurn = true;
                if (aantal < 0) {
                    aantal = 0;
                    break;
                }
                repaint();

                if (aantal == 0 && PlayerTurn) {
                    WinSound.play();
                    selectedimage = Win;
                    winorlose = "You won, press the red restart button to play again!";
                    repaint();
                    break;
                }
            }
        }
    }
    public class Resetlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal = 23;
            computertext = "";
            humantext = "";
            Errortext = "";
            winorlose = "";
            selectedimage = null;
            repaint();
        }
    }
}
