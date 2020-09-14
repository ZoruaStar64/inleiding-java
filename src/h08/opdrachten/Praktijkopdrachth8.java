package h08.opdrachten;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdrachth8 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Button keer;
    Button delen;
    Button plus;
    Button min;
    String antwoord;
    String ingave1;
    String ingave2;
    double a;
    double b;



public void init(){
    tekstvak1 = new TextField("", 15);
    tekstvak2 = new TextField("", 15);
    add(tekstvak1);
    add(tekstvak2);
    keer = new Button("*");
    keer.addActionListener(new KeerListener());
    delen = new Button("/");
    delen.addActionListener(new DelenListener());
    plus = new Button("+");
    plus.addActionListener(new PlusListener());
    min = new Button("-");
    min.addActionListener(new MinListener());
    antwoord = "";
    add(keer);
    add(delen);
    add(plus);
    add(min);

}
public void paint(Graphics g) {
    g.drawString("vak1 = " + ingave1 , 40,40);
    g.drawString("vak2 = " + ingave2 , 40,60);
    g.drawString("Antwoord = " + antwoord , 40,80);
    //g.drawString(ingave1 + " * " + ingave2 + " = " + antwoord , 40,100);
}
    class KeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            ingave1 = tekstvak1.getText();
            ingave2 = tekstvak2.getText();
            a = Double.parseDouble( ingave1 );
            b = Double.parseDouble( ingave2 );
            antwoord = "" + (a * b);
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
    class DelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            ingave1 = tekstvak1.getText();
            ingave2 = tekstvak2.getText();
            a = Double.parseDouble( ingave1 );
            b = Double.parseDouble( ingave2 );
            antwoord = "" + (a / b);
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            ingave1 = tekstvak1.getText();
            ingave2 = tekstvak2.getText();
            a = Double.parseDouble( ingave1 );
            b = Double.parseDouble( ingave2 );
            antwoord = "" + (a + b);
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
    class MinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            ingave1 = tekstvak1.getText();
            ingave2 = tekstvak2.getText();
            a = Double.parseDouble( ingave1 );
            b = Double.parseDouble( ingave2 );
            antwoord = "" + (a - b);
            tekstvak1.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }
}