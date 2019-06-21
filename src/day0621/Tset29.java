package day0621;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//class Myframe2 extends WindowAdapter {
//
//}

public class Tset29 {
    public static void main(String[] args) {
        JFrame f = new JFrame("第一个窗体");
        Dimension d = new Dimension(500,300);
        Point p = new Point(400,300);

        JLabel jl1  = new JLabel("姓名：");
//        jl1.setBounds(0, 0, 100, 100);
//        jl1.setPreferredSize(new Dimension(50, 50));
        jl1.setFont(new Font("宋体", Font.PLAIN, 20));
        f.add(jl1);

        JButton b = new JButton("点击");
//        b.setBounds(0, 0, 100, 30);
        b.setPreferredSize(new Dimension(80, 60));
        f.add(b);

        // 输入框
        JTextField tfName = new JTextField("");
        tfName.setText("请输入");
        tfName.setPreferredSize(new Dimension(300, 30));
        f.add(tfName);

        JLabel jl2 = new JLabel("你的爱好是什么呀");
        jl2.setBounds(0,0,50,50);
        f.add(jl2);

        JCheckBox bCheckBox = new JCheckBox("游泳");
        bCheckBox.setSelected(true);        //设置 为 默认被选中
        bCheckBox.setBounds(0, 0, 130, 30);
        JCheckBox bCheckBox2 = new JCheckBox("电影");
        bCheckBox2.setBounds(0, 0, 130, 30);
        JCheckBox bCheckBox3 = new JCheckBox("美食");
        bCheckBox3.setBounds(0, 0, 130, 30);
        f.add(bCheckBox);
        f.add(bCheckBox2);
        f.add(bCheckBox3);


        JRadioButton b1 = new JRadioButton("男");
        b1.setSelected(true);           // 设置 为 默认被选中
        b1.setBounds(0, 0, 130, 30);
        f.add(b1);

        //下拉框出现的条目
        String[] heros = new String[] { "星期一", "星期二","星期三" };
        JComboBox cb = new JComboBox(heros);
        cb.setBounds(0, 0, 80, 30);
        f.add(cb);


        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("打开");
            }
        });


        f.setSize(d);
        f.setLocation(p);
        f.setLayout(new FlowLayout());
        //f.setSize(230,120);
        //f.setLocation(300,200);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.pink);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
