package h14.opdrachtenh14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

// doel: zorg ervoor dat je een applet maakt die een van de vele speelkaarten deelt (52 + 3 jokers)
// dit die je door de math.random methode te gebruiken met een if statement
// probeer dit met arrays te doen
public class opdracht1h14 extends Applet {
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
            System.out.println(theChosenOne);

            if (theChosenOne == 5 && onetothree == 0) {
                onetothree = (int) (Math.random() * 4);
                System.out.println(onetothree);
            }

            if ( theChosenOne < 5 && onetothirteen == 0) {
                onetothirteen = (int) (Math.random() * 14);
                System.out.println(onetothirteen);
            }

            if (theChosenOne == 1) {
                System.out.println(Arrays.toString(Spade));
                System.out.println(card);
            card = "Spade " + Spade[onetothirteen];
            }
            else if (theChosenOne == 2) {
                System.out.println(Arrays.toString(Heart));
                System.out.println(card);
            card = "Heart " + Heart[onetothirteen];
            }
            else if (theChosenOne == 3) {
                System.out.println(Arrays.toString(Diamond));
                System.out.println(card);
                card = "Diamond " + Diamond[onetothirteen];
            }
            else if (theChosenOne == 4) {
                System.out.println(Arrays.toString(Clover));
                System.out.println(card);
            card = "Clover " + Clover[onetothirteen];
            }
            else if (theChosenOne == 5) {
                System.out.println(Arrays.toString(Jokers));
                System.out.println(card);
            card = "" + Jokers[onetothree];
            }
            repaint();
        }
    }
}
