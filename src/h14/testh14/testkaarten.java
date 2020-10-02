package h14.testh14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class testkaarten extends Applet {

    int[] random = {1,2,3,4};
    String kaart;
    String[] Player1;
    String[] Player2;
    String[] Player3;
    String[] Player4;
    String[] Symbols = {"Spades","Hearts","Diamonds","Clovers"};
    String[] CardType = {"of Ace", "of Two", "of Three", "of Four", "of Five", "of Six", "of Seven", "of Eight", "of Nine", "of Ten", "of Jacks", "of Queens", "of Kings"};
    Button button;
    Label label;

    public void init() {
        Player1 = new String[13];
        Player2 = new String[13];
        Player3 = new String[13];
        Player4 = new String[13];
        CardType = new String[13];
        Symbols = new String[4];
        button = new Button("Generate decks");
        label = new Label("Click the button to generate a random Deck to 4 players!");
        button.addActionListener(new Cardlistener());
        add(button);
        add(label);
    }

    public void paint(Graphics g) {


    }

   /* private String deelKaart() {
        int random = new Random().nextInt(Symbols.length);
        String kaart = Symbols[random];
        //vervang de inhoud van deck met een nieuwe lijst
        //het nieuwe deck is 1 kaart kleiner dan het oude deck
        String[] hulpLijst = new String[Symbols.length - 1];
        //om het nieuwe deck te vullen hebben we een index nodig
        int hulpindex = 0;
        //kopieer alle kaarten naar hulplijst behalve de kaart die net gedeeld is
        for (int i = 0; i < Symbols.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = Symbols[i];
                hulpindex++;
            }
        }
        //vervang nu deck met de nieuwe lijst
        Symbols = hulpLijst;
        //de methode geeft de random kaart terug

        return kaart;
    }*/

    public class Cardlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
