package day0621;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame1 implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("窗体打开");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("窗体关闭");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("窗体被关闭");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("最小化");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("从最小化恢复");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("被选中");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("取消选中");
    }
}

public class Test28 {
    public static void main(String[] args) {
        JFrame f = new JFrame("第一个窗体");
        Dimension d = new Dimension(400,400);
        Point p = new Point(300,300);

        //在窗体上年注册事件监听
        f.addWindowListener(new MyFrame1());

        JLabel jl  = new JLabel("niconico",JLabel.CENTER);

        f.add(jl);
        f.setSize(d);
        f.setLocation(p);
        //f.setSize(230,120);
        //f.setLocation(300,200);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.red);


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
