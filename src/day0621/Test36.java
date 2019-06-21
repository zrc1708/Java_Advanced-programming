package day0621;

import javax.swing.*;
import java.awt.*;

public class Test36 {
    public static void main(String[] args) {
        JFrame jf  = new JFrame("窗体");
        JLabel jl = new JLabel("用户名");
        JTextField jt = new JTextField(10);
        JLabel jl1 = new JLabel("密码：");
        JPasswordField jw = new JPasswordField(10);
        JButton jb1 = new JButton("注册");
        JButton jb2 = new JButton("登录");

        jf.add(jl);
        jf.add(jt);
        jf.add(jl1);
        jf.add(jw);
        jf.add(jb1);
        jf.add(jb2);

        jf.setLayout(new FlowLayout());

        jf.setSize(500,500);
        jf.setLocation(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
