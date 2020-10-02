package h14.opdrachtenh14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// doel: zorg ervoor dat je een applet maakt die 10 speelkaarten deelt (52 + 3 jokers)
// daarna doe je dat voor 3 andere personen nogmaals
// dit zou mogelijk kunnen zijn met twee for loops
// Zorg ervoor dat er geen dubbele kaarten in het spel zitten bvb: speler 1 en 3 hebben allebei Clover of 4 dat kan niet
public class opdracht2h14 extends Applet {
    String[] card;
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
    int y = 15;

    public void init() {
        card = new String[10];
        button = new Button("Generate card");
        button.addActionListener(new CardListener());
        add(button);
        label = new Label("Click the button to generate a random card!");
        add(label);
    }

    public void paint(Graphics g) {
        resize(1000, 600);
        for (int aantal = 0; aantal <= 10; aantal++) {
            g.drawString("Player one's card are " + card[aantal], 10, (y * aantal + 150));
            g.drawString("Player two's card are " + card[aantal], 260, (y * aantal + 150));
            g.drawString("Player three's card are " + card[aantal], 500, (y * aantal + 150));
            g.drawString("Player four's card are " + card[aantal], 740, (y * aantal + 150));
        }
    }

    public class CardListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int aantal = 0; aantal <= 10; aantal++) {
                theChosenOne = (int) (Math.random() * 5 + 1);

                if (theChosenOne == 5) {
                    onetothree = (int) (Math.random() * 3);
                    System.out.println(onetothree);
                }

                if (theChosenOne < 5) {
                    onetothirteen = (int) (Math.random() * 13);
                    System.out.println(onetothirteen);
                }

                if (theChosenOne == 1) {
                    card[aantal] = "Spade " + Spade[onetothirteen];
                } else if (theChosenOne == 2) {
                    card[aantal] = "Heart " + Heart[onetothirteen];
                } else if (theChosenOne == 3) {
                    card[aantal] = "Diamond " + Diamond[onetothirteen];
                } else if (theChosenOne == 4) {
                    card[aantal] = "Clover " + Clover[onetothirteen];
                } else if (theChosenOne == 5) {
                    card[aantal] = "" + Jokers[onetothree];
                }
                repaint();
            }
        }
    }
}