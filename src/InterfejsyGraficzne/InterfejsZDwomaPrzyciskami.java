package InterfejsyGraficzne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfejsZDwomaPrzyciskami implements ActionListener , MouseListener  {
    JFrame okno;
    JButton rozmiar_okna;
    JButton przycisk;
    public static int wartosc = 0 ;
    public static void main (String[] args){
        InterfejsZDwomaPrzyciskami obiekt = new InterfejsZDwomaPrzyciskami();
        obiekt.generowanieOkna();

    }
    public void generowanieOkna(){
        okno = new JFrame("Okno z przyciskiem");
        rozmiar_okna = new JButton("rozmiar okna");
        rozmiar_okna.setSize(100, 200); // Ustawienie rozmiarów przycisku
        rozmiar_okna.addActionListener(this);
        okno.addMouseListener(this);
        rozmiar_okna.setForeground(Color.GREEN);
        rozmiar_okna.setBackground(Color.RED);
        przycisk = new JButton("rozmiar okna");
        przycisk.setSize(100,200);
        przycisk.addActionListener(this);
        // Ustawienie layoutu i dodanie przycisku do okna
        okno.setLayout(new FlowLayout(FlowLayout.LEFT)); // Ustawienie FlowLayout z wyśrodkowaniem
        okno.add(rozmiar_okna);
        okno.add(przycisk);

        okno.setSize(400,500);
        okno.setVisible(true);
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
            System.out.println("przycisk");

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
