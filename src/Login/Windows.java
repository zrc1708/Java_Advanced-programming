package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class window2 extends JFrame{
    JLabel jl = new JLabel("",JLabel.CENTER);
    public window2(String str) {
        super("lovelive");
        setSize(280, 200);
        this.setLocation(300,300);
        jl.setText("<html><body><p style='color:black;font-size:20px;font-family:黑体;'>用户"+str+"欢迎你</p></body></html>");
        this.add(jl);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


class window{
    static void create(){
        JFrame jf  = new JFrame("窗体");
        JLabel jl = new JLabel("用户名:");
        JTextField jt = new JTextField(10);
        JLabel jl1 = new JLabel("密码：");
        JPasswordField jw = new JPasswordField(10);
        JButton jb1 = new JButton("注册");
        JButton jb2 = new JButton("登录");
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();

        jp1.add(jl);
        jp1.add(jt);
        jp1.setPreferredSize(new Dimension(280,40));


        jp2.add(jl1);
         jp2.add(jw);
        jp2.setPreferredSize(new Dimension(280,40));


        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jt.getText();
                String password=new String(jw.getPassword());
                SQL sql = new SQL();
                sql.add(name,password);
                JOptionPane.showMessageDialog(null, "注册成功");
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = jt.getText();
                String password=new String(jw.getPassword());
//                System.out.println(name+password);
                SQL sql = new SQL();
                if(sql.findname(name,password)){
//                 System.out.println("找到了");
                 new window2(name);
                 jf.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "账户信息有误");
                }

            }
        });

        jf.add(jp1);
        jf.add(jp2);
        jf.add(jb1);
        jf.add(jb2);

        jf.setLayout(new FlowLayout());

        jf.setSize(280,200);
        jf.setLocation(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


public class Windows {
    public static void main(String[] args) {
        window.create();

    }
}
