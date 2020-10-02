package h14.opdrachtenh14;



import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

// doel: zorg ervoor dat je een applet maakt die 10 speelkaarten deelt (52 + 3 jokers)
// daarna doe je dat voor 3 andere personen nogmaals
// dit zou mogelijk kunnen zijn met twee for loops
// Zorg ervoor dat er geen dubbele kaarten in het spel zitten bvb: speler 1 en 3 hebben allebei Clover of 4 dat kan niet
public class opdracht2h14 extends Applet {
    String[] cardsPlayer1;
    String[] cardsPlayer2;
    String[] cardsPlayer3;
    String[] cardsPlayer4;
    Button button;
    Label label;
    String[] Deck = {"Spade of Ace", "Spade of Two", "Spade of Three", "Spade of Four", "Spade of Five", "Spade of Six", "Spade of Seven", "Spade of Eight", "Spade of Nine",

            "Spade of Ten", "Spade of Jacks", "Spade of Queens", "Spade of Kings", "Heart of Ace", "Heart of Two", "Heart of Three", "Heart of Four", "Heart of Five",
            "Heart of Six", "Heart of Seven", "Heart of Eight", "Heart of Nine", "Heart of Ten", "Heart of Jacks", "Heart of Queens", "Heart of Kings","Diamond of Ace",
            "Diamond of Two",
            "Diamond of Three", "Diamond of Four", "Diamond of Five", "Diamond of Six", "Diamond of Seven", "Diamond of Eight", "Diamond of Nine", "Diamond of Ten",
            "Diamond of Jacks", "Diamond of Queens", "Diamond of Kings", "Clover of Ace", "Clover of Two", "Clover of Three",
            "Clover of Four", "Clover of Five", "Clover of Six", "Clover of Seven", "Clover of Eight", "Clover of Nine", "Clover of Ten", "Clover of Jacks",
            "Clover of Queens", "Clover of Kings"};

    String[] deckTemp = Deck;
    int y = 15;

    public void init() {

        cardsPlayer1 = new String[13];
        cardsPlayer2 = new String[13];
        cardsPlayer3 = new String[13];
        cardsPlayer4 = new String[13];
        button = new Button("Generate card");
        button.addActionListener(new CardListener());
        add(button);
        label = new Label("Click the button to generate a random Deck to 4 players!");
        add(label);
    }

    public void paint(Graphics g) {
        resize(1000, 600);
        for (int aantal = 0; aantal <= 12; aantal++) {
            g.drawString("Player one's card are " + cardsPlayer1[aantal], 10, (y * aantal + 150));
            g.drawString("Player two's card are " + cardsPlayer2[aantal], 260, (y * aantal + 150));
            g.drawString("Player three's card are " + cardsPlayer3[aantal], 500, (y * aantal + 150));
            g.drawString("Player four's card are " + cardsPlayer4[aantal], 740, (y * aantal + 150));
        }
    }

    public class CardListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String kaart;
            for (int indexNumberCard = 0; indexNumberCard < 13; indexNumberCard++) {
                for (int numberOfPLayers = 1; numberOfPLayers < 5; numberOfPLayers++) {


                    /*if (theChosenOne == 5) {
                        onetothree = (int) (Math.random() * 3);
                        System.out.println(onetothree);
                    }*/
                    kaart = deelKaart() + "";
                    givePlayerACard(numberOfPLayers, indexNumberCard,kaart);
                        //cardsPlayer1[aantal] = "Clover " + Clover[onetothirteen];
                    /*} else if (theChosenOne == 5) {
                        givePlayerACard(numberOfPLayers, indexNumberCard, "" + Jokers[onetothree]);
                        //cardsPlayer1[aantal] = "" + Jokers[onetothree];
                    }*/



                }

            }
            repaint();
            Deck = deckTemp;
        }

        private String deelKaart() {
            System.out.println(Deck.length);
            int random = new Random().nextInt(Deck.length);
            String kaart = Deck[random];
            //vervang de inhoud van deck met een nieuwe lijst
            //het nieuwe deck is 1 kaart kleiner dan het oude deck
            String[] hulpLijst = new String[Deck.length - 1];
            //om het nieuwe deck te vullen hebben we een index nodig
            int hulpindex = 0;
            //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
            for (int i = 0; i < Deck.length; i++) {
                if (i != random) {
                    hulpLijst[hulpindex] = Deck[i];
                    hulpindex++;
                }
            }
            //vervang nu deck met de nieuwe lijst
            Deck = hulpLijst;
            //de methode geeft de random kaart terug

            return kaart;
        }



        private void givePlayerACard(int player, int aantal, String card) {
            switch (player) {
                case 1:
                    cardsPlayer1[aantal] = card;
                    break;
                case 2:
                    cardsPlayer2[aantal] = card;
                    break;
                case 3:
                    cardsPlayer3[aantal] = card;
                    break;
                case 4:
                    cardsPlayer4[aantal] = card;
                    break;

            }
        }
    }
}