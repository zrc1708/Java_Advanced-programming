package day0621;

import javafx.embed.swing.JFXPanel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Tset31 {
    public static void main(String[] args) {
        JFrame f =new JFrame();
        f.setLayout(new BorderLayout(3,3));
        f.add(new JButton("东"),BorderLayout.EAST);
        f.add(new JButton("西"), BorderLayout.WEST);
        f.add(new JButton("南"),BorderLayout.SOUTH);
        f.add(new JButton("北"),BorderLayout.NORTH);
        f.add(new JButton("中"),BorderLayout.CENTER);
        f.setSize(500,500);
        f.setLocation(500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
