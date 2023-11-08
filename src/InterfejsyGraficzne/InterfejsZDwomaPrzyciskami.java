package InterfejsyGraficzne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class InterfejsZDwomaPrzyciskami implements ActionListener , MouseListener  {
    JFrame okno;
    JButton rozmiar_okna;
    JButton przycisk;
    TextField tekst1;
    TextField tekst2;
    public static int wartosc = 0 ;
    public static void main (String[] args){
        InterfejsZDwomaPrzyciskami obiekt = new InterfejsZDwomaPrzyciskami();
        obiekt.generowanieOkna();

    }
    public void generowanieOkna(){
        okno = new JFrame("Okno z przyciskiem");
        rozmiar_okna = new JButton("2");
        przycisk = new JButton("skopiuj tekst ");
        tekst1 = new TextField("wpisz tekst");
        tekst2 = new TextField("tekst skopiowany");
        rozmiar_okna.setSize(200, 200); // Ustawienie rozmiarów przycisku
        przycisk.setSize(200,200);
        tekst1.setSize(100,100);
        okno.setSize(400,100);
        okno.setLayout(new GridLayout(2,2));
        okno.setVisible(true);
        rozmiar_okna.addActionListener(this);
        okno.addMouseListener(this);
        przycisk.addActionListener(this);
        rozmiar_okna.setForeground(Color.GREEN);
        rozmiar_okna.setBackground(Color.RED);



        // Ustawienie layoutu i dodanie przycisku do okna
        okno.setLayout(new FlowLayout(FlowLayout.LEFT)); // Ustawienie FlowLayout z wyśrodkowaniem
        okno.add(rozmiar_okna);
        okno.add(przycisk);
        okno.add(tekst1);
        okno.add(tekst2);


        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == rozmiar_okna) {
            System.out.println(okno.getHeight() + " " + okno.getWidth());
            System.out.println(okno.getX()+" "+okno.getY());
            System.out.println(okno.getSize());
            System.out.println(okno.getDefaultCloseOperation());
            System.out.println(e.getSource());
        } else if (e.getSource()==przycisk) {
            System.out.println(tekst1.getText());
            tekst2.setText(tekst1.getText());

        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("myszka");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
