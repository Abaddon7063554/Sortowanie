package InterfejsyGraficzne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;

public class InterfejsZDwomaPrzyciskami implements ActionListener , MouseListener  {
    JFrame okno;
    JButton rozmiar_okna;
    JButton przycisk,przycisk_textArea;
    JTextArea TextArea;
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
        przycisk_textArea = new JButton("TextArea");
        tekst1 = new TextField("wpisz tekst");
        tekst2 = new TextField("tekst skopiowany");
        TextArea = new JTextArea("TEXTAREA");
        TextArea.setPreferredSize(new Dimension (400,400));
        rozmiar_okna.setSize(200, 200); // Ustawienie rozmiarów przycisku
        przycisk.setSize(200,200);
        przycisk_textArea.setSize(500,500);
        tekst1.setSize(100,100);
        okno.setSize(400,100);
        okno.setLayout(new GridLayout(2,2));
        okno.setVisible(true);
        rozmiar_okna.addActionListener(this);
        okno.addMouseListener(this);
        przycisk.addActionListener(this);
        przycisk_textArea.addActionListener(this);
        rozmiar_okna.setForeground(Color.GREEN);
        rozmiar_okna.setBackground(Color.RED);
        okno.setLayout(new FlowLayout(FlowLayout.LEFT));
        okno.add(rozmiar_okna);
        okno.add(przycisk);
        okno.add(przycisk_textArea);
        okno.add(TextArea);
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
        else if(e.getSource()==przycisk_textArea){

            Dimension b = okno.getSize();
            String a = b.toString();
            TextArea.setText(a);
            System.out.println(b);
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
