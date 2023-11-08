package InterfejsyGraficzne;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfejsGraficznyUzytkownika implements ActionListener {

    JButton przycisk1;
    JFrame okno;
    public static void main (String[] args){
       InterfejsGraficznyUzytkownika obiekt1 = new InterfejsGraficznyUzytkownika();
       obiekt1.tworzOkno();
    }
    public void tworzOkno(){
        okno = new JFrame("w2itaj swiecie");
        przycisk1 = new JButton("Klinij mnie");
        przycisk1.addActionListener(this);
        okno.setSize(400, 500);
        okno.setVisible(true);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.add(przycisk1);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        przycisk1.setText("wcisnales mnie");
        przycisk1.setSize(80,40);
    }
}
