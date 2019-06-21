package day0621;

import javax.swing.*;
import java.awt.*;

public class Test30 {
    public static void main(String[] args) {
        JFrame f  = new JFrame("窗体");
        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton b = null;

        for(int i =0;i<9;i++){
            b = new JButton("按钮"+i);
            f.add(b);
        }

        f.setSize(280,300);
        f.setVisible(true);
        f.setLocation(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
