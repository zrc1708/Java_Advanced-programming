package day0621;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.security.PublicKey;

public class Test33 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton but = new JButton("显示");
        JLabel lab  = new JLabel();
        JTextField text = new JTextField(10);
        JPanel pan = new JPanel();


            Font font = new Font("Serief",Font.ITALIC+Font.BOLD,28);
            lab.setFont(font);
            lab.setText("等待用户输入信息");

            but.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(e.getSource()== but){
                        lab.setText(text.getText());
                    }
                }
            });
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(1);
                }
            });

            text.setPreferredSize(new Dimension(120, 60));
            but.setPreferredSize(new Dimension(120,60));

            pan.add(text);
            pan.add(but);
            frame.add(pan);
            frame.add(lab);

            frame.setBounds(500,500,300,200);
            frame.setVisible(true);
            frame.setLayout(new FlowLayout());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
