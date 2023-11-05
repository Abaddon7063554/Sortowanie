package InterfejsyGraficzne;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;

public class ListaMenuDwupoziomowa {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista Menu Dwupoziomowa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Menu 1");
        JMenu menu2 = new JMenu("Menu 2");

        JMenuItem item1 = new JMenuItem("Opcja 1");
        JMenuItem item2 = new JMenuItem("Opcja 2");

        JMenu submenu = new JMenu("Podmenu");

        JMenuItem subitem1 = new JMenuItem("Opcja 1.1");
        JMenuItem subitem2 = new JMenuItem("Opcja 1.2");

        menu1.add(item1);
        menu1.add(item2);

        submenu.add(subitem1);
        submenu.add(subitem2);

        menu1.add(submenu);

        menuBar.add(menu1);
        menuBar.add(menu2);

        frame.setJMenuBar(menuBar);

        // Dodanie akcji do opcji
        item1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        Desktop.getDesktop().browse(new URI("https://www.example.com"));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        item2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        Desktop.getDesktop().browse(new URI("https://www.google.com"));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        subitem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        Desktop.getDesktop().browse(new URI("https://www.github.com"));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        subitem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                        Desktop.getDesktop().browse(new URI("https://www.stackoverflow.com"));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        frame.setVisible(true);
    }
}
