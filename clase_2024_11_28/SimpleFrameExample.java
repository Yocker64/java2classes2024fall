package clase_2024_11_28;

import javax.swing.JFrame;

public class SimpleFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
        
    }
}
