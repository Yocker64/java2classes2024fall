package Xmas;

import javax.swing.JFrame;

import task18.GraphicsExample;

public class Xmas extends JFrame{
     public static void main(String[] args) {
        new Xmas();
    }

    Xmas(){
        setTitle("Let's gooooo");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(new MyPanel());
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
