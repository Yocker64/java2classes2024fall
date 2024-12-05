package clase_2024_11_28;

import javax.swing.*;
import java.awt.event.*;

public class SingleButtonExample extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new SingleButtonExample();
    }

    SingleButtonExample() {
        JButton button = new JButton(); // No String constructor, just to check if JButton is recognized
        button.setText("Hola");// 'this' now refers to an ActionListener
        getContentPane().add(button);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        setVisible(true);
    }

    // Implement the actionPerformed method from ActionListener
    public void actionPerformed(ActionEvent ae) {
        System.out.println("ボタンが押されました");
    }
}
