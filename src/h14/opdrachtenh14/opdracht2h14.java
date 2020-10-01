package h14.opdrachtenh14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// doel: zorg ervoor dat je een applet maakt die 10 speelkaarten deelt (52 + 3 jokers)
// daarna doe je dat voor 3 andere personen nogmaals
// dit zou mogelijk kunnen zijn met twee for loops
public class opdracht2h14 extends Applet {
    String card;
    Button button;
    Label label;
    int theChosenOne = 0;
    String[] Spade = {"of Ace", "of Two", "of Three", "of Four", "of Five", "of Six", "of Seven", "of Eight", "of Nine", "of Ten", "of Jacks", "of Queens", "of Kings"};
    String[] Heart = {"of Ace", "of Two", "of Three", "of Four", "of Five", "of Six", "of Seven", "of Eight", "of Nine", "of Ten", "of Jacks", "of Queens", "of Kings"};
    String[] Diamond = {"of Ace", "of Two", "of Three", "of Four", "of Five", "of Six", "of Seven", "of Eight", "of Nine", "of Ten", "of Jacks", "of Queens", "of Kings"};
    String[] Clover = {"of Ace", "of Two", "of Three", "of Four", "of Five", "of Six", "of Seven", "of Eight", "of Nine", "of Ten", "of Jacks", "of Queens", "of Kings"};
    String[] Jokers = {"Joker #1", "Joker #2", "Joker #3"};
    int onetothirteen = 0;
    int onetothree = 0;

    public void init() {
        button = new Button("Generate card");
        button.addActionListener(new CardListener());
        add(button);
        label = new Label("Click the button to generate a random card!");
        add(label);
    }

    public void paint(Graphics g) {
        resize(600, 600);
        g.drawString("Your card is " + card, 150, 150);
    }

    public class CardListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            theChosenOne = (int) (Math.random() * 5 + 1);

            if (theChosenOne == 5) {
                onetothree = (int) (Math.random() * 3);
                System.out.println(onetothree);
            }

            if ( theChosenOne < 5) {
                onetothirteen = (int) (Math.random() * 13);
                System.out.println(onetothirteen);
            }

            if (theChosenOne == 1) {
                card = "Spade " + Spade[onetothirteen];
            }

            else if (theChosenOne == 2) {
                card = "Heart " + Heart[onetothirteen];
            }

            else if (theChosenOne == 3) {
                card = "Diamond " + Diamond[onetothirteen];
            }

            else if (theChosenOne == 4) {
                card = "Clover " + Clover[onetothirteen];
            }

            else if (theChosenOne == 5) {
                card = "" + Jokers[onetothree];
            }
            repaint();
        }
    }
}