package homework;

import javax.swing.*;
import java.awt.*;

public class Swing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JPanel jp4 = new JPanel();
        JPanel jp5 = new JPanel();
        JPanel jp6 = new JPanel();
        JPanel jp7 = new JPanel();
        JPanel jp8 = new JPanel();
        JPanel jp = new JPanel();


        JLabel jl = new JLabel("人员基础信息表");
        jp1.setPreferredSize(new Dimension(300,90));
//        jp1.setBackground(Color.blue);
        jp1.add(jl);

        JLabel jl2 = new JLabel("姓名：");
        TextField t = new TextField(20);
        jp2.add(jl2,BorderLayout.CENTER);
        jp2.add(t,BorderLayout.CENTER);
//        jp1.setLayout(new BorderLayout());
//        jp2.setBackground(Color.red);
        jp2.setPreferredSize(new Dimension(300,90));

        JLabel jl3 = new JLabel("性别");
        JRadioButton jr1  = new JRadioButton("男");
        JRadioButton jr2  = new JRadioButton("女");
        ButtonGroup bt  = new ButtonGroup();
        bt.add(jr1);
        bt.add(jr2);
        jp3.add(jl3);
        jp3.add(jr1);
        jp3.add(jr2);
        jp3.setPreferredSize(new Dimension(300,90));
//        jp3.setBackground(Color.blue);

        JLabel jl4 = new JLabel("名族");
        String[] mingzu = new String[] { "汉族", "壮族" };
        JComboBox cb = new JComboBox(mingzu);
        jp4.add(jl4);
        jp4.add(cb);
//        jp4.setBackground(Color.red);
        jp4.setPreferredSize(new Dimension(300,90));

        JLabel jl5 = new JLabel("<html><body><p style='color:white;font-size:10px;font-family:黑体;'>1、党员<br>2、年龄35岁以下<br>3、热爱国家，拥护党的指针</p></body></html>");
        jp5.add(jl5);
        jp5.setBackground(Color.red);
        jp5.setPreferredSize(new Dimension(200,60));

        jp.add(jp5);
        jp.setPreferredSize(new Dimension(400,90));

        JLabel jl6 = new JLabel("英语水平");
        JCheckBox box1 = new JCheckBox("四级水平");
        JCheckBox box2 = new JCheckBox("六级水平");
        JCheckBox box3 = new JCheckBox("托福");
        JCheckBox box4 = new JCheckBox("雅思");
        jp6.add(jl6);
        jp6.add(box1);
        jp6.add(box2);
        jp6.add(box3);
        jp6.add(box4);
        jp6.setPreferredSize(new Dimension(400,90));


        f.add(jp1);
        f.add(jp2);
        f.add(jp3);
        f.add(jp4);
//        f.add(jp5);
        f.add(jp);
        f.add(jp6);

        f.setLayout(new FlowLayout());
        f.setBounds(500,100,400,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
