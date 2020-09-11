package h08.codetest;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TextvakEnGetal extends Applet {
    TextField tekstvak;
    Label label;
    double getal;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        tekstvak.addActionListener( new TekstvakListener() );
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Het getal is " + getal, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            getal = Double.parseDouble( s );
            //Je kan deze regels ook samenvoegen
            //getal = Double.parseDouble(tekstvak.getText());
            //getal = Integer.parseInt( s );
            // integer zorgt ervoor dat het als een int werkt
            // waardoor je geen komma getallen kan doen
            repaint();
        }
    }
}
