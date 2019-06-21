package day0621;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class number{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        int num=(int)(1+Math.random()*(100-1+1));
        this.number = num;
        System.out.println(this.number);
    }
}

public class MunberGame {
    public static void main(String[] args) {

        JFrame f =new JFrame("来猜数字呀");
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        TextField text = new TextField();
        JLabel jl = new JLabel("快点输入",SwingConstants.CENTER);
        JButton jb1 = new JButton("猜数");
        JButton jb2 = new JButton("重新来过");
        JButton jb3 = new JButton("退出");

        number num = new number();
        num.setNumber();

        text.setPreferredSize(new Dimension(280, 30));

//        jp2.add(text);
//        jp2.add(jl);

        jl.setFont(new Font("宋体", Font.PLAIN, 30));
        jl.setOpaque(true);  //重点 设置背景颜色必须先将它设置为不透明的 因为默认是透明的
        jl.setBackground(Color.pink);
        jl.setPreferredSize(new Dimension(280,100));


        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(Integer.parseInt(text.getText())>num.getNumber()){
                    jl.setText("<html><body><p align=\"center\">你猜的数字是："+text.getText()+"<br>猜大了</p></body></html>");
                }else if(Integer.parseInt(text.getText())<num.getNumber()){
                    jl.setText("<html><body><p align=\"center\">你猜的数字是："+text.getText()+"<br>猜小了</p></body></html>");
                }else{
                    jl.setText("<html><body><p style='color:red;font-size:30px;font-family:黑体;'>恭喜你猜对了</p></body></html>");
                }
                text.setText("");
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             num.setNumber();
             jl.setText("快点输入");
             text.setText("");
            }
        });

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jp3.add(jb1);
        jp3.add(jb2);
        jp3.add(jb3);
        jp3.setPreferredSize(new Dimension(280,50));


        f.add(text);
        f.add(jl);
        f.add(jp3);


        f.setBounds(500,500,300,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
