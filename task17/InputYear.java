package task17;

import java.awt.event.*;
import java.util.EventListener;

import javax.swing.*;
import java.awt.*;

public class InputYear extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new InputYear();
    }

    JTextField textfield = new JTextField(20);
    JButton OKbutton = new JButton("ＯＫ");
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JLabel label1 = new JLabel("", JLabel.CENTER);
    JLabel label2 = new JLabel("調べる年を半角４桁で入力してください", JLabel.CENTER);

    InputYear() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setLayout(new BorderLayout());
        p2.setLayout(new FlowLayout());
        p2.add(OKbutton);
        p1.add(BorderLayout.NORTH, textfield);
        p1.add(BorderLayout.CENTER, p2);
        getContentPane().add(BorderLayout.NORTH, label2);
        getContentPane().add(BorderLayout.CENTER, p1);
        getContentPane().add(BorderLayout.SOUTH, label1);
        setLocationRelativeTo(null);
        setSize(400, 400);
        OKbutton.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int year = Integer.parseInt(textfield.getText());
            String eto = Eto.calc(year);
            label1.setText(year + "年の干支は" + eto + "です");
        } catch (NumberFormatException ne) {
            textfield.setText("");
            label1.setText("半角数字を入力してください");
        }
    }

}
