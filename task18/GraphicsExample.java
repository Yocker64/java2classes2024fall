package task18;

import javax.swing.JFrame;

public class GraphicsExample extends JFrame{
    public static void main(String[] args) {
        new GraphicsExample();
    }

    GraphicsExample(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new MyPanel());
        setSize(300,200);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
