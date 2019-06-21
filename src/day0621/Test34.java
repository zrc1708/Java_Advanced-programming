/**
 * 单选框
 */
package day0621;

import javax.swing.*;
import java.awt.*;

public class Test34 {
    public static void main(String[] args) {
        JFrame f  = new JFrame("窗体");
        JRadioButton jr1  = new JRadioButton("华为");
        JRadioButton jr2  = new JRadioButton("谷歌");
        JRadioButton jr3  = new JRadioButton("英伟达");
        JPanel jp = new JPanel();
        jp.setBorder(BorderFactory.createTitledBorder("请选择你喜欢的公司"));
        ButtonGroup bt  = new ButtonGroup();
        Container c = f.getContentPane();

        bt.add(jr1);
        bt.add(jr2);
        bt.add(jr3);

        jp.add(jr1);
        jp.add(jr2);
        jp.add(jr3);

        c.add(jp);

        f.setBounds(500,500,500,500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
