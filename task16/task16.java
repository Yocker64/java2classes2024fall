package task16;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class task16 extends JFrame{
    public static void main(String[] args) {
        new task16();
    }
    task16(){
        JMenu menuTitle = new JMenu("File");
      
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        JButton confirmation1 = new JButton("OK");
        JButton confirmation2 = new JButton("OK");
        JButton confirmation3 = new JButton("OK");
        JButton confirmation4 = new JButton("OK");
        JButton reset = new JButton("Reset");
        JRadioButton radio1 = new JRadioButton("Let's go?", true);
        JRadioButton radio2 = new JRadioButton("No let's go?");
        JRadioButton radio3 = new JRadioButton("Let's goooooooooo");
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL,50,5,0,105);
        JLabel label = new JLabel("50",JLabel.CENTER);
        JTextField textField = new JTextField(20);
        JMenuBar menuBar = new JMenuBar();
        JCheckBox check = new JCheckBox("Checkbox");
        JComboBox comboBox = new JComboBox<>();
        comboBox.addItem("First choice");
        comboBox.addItem("Second choice");
        comboBox.addItem("Third choice");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        //Createing the subpanels and giving their corresponding layout
        JPanel submenu = new JPanel();
        submenu.setLayout(new FlowLayout());
        JPanel submenu2 = new JPanel();
        submenu2.setLayout(new FlowLayout());
        JPanel submenu3 = new JPanel();
        submenu3.setLayout(new FlowLayout());
        JPanel submenu4 = new JPanel();
        submenu4.setLayout(new BorderLayout());
        JPanel submenu5 = new JPanel();
        submenu5.setLayout(new BorderLayout());
        JLabel titleee = new JLabel("Java 2 GUI, hell yeah!!!");
        JPanel sub5_submenu = new JPanel();
        sub5_submenu.setLayout(new FlowLayout());
        

        sub5_submenu.add(reset);
        sub5_submenu.add(confirmation4);
        submenu.add(check);
        submenu.add(confirmation1);
        submenu5.add(titleee);
        submenu5.add(BorderLayout.NORTH,textField);
        submenu5.add(BorderLayout.CENTER,sub5_submenu);
        
        

        
        

        submenu2.add(radio1);
        submenu2.add(radio2);
        submenu2.add(radio3);
        submenu2.add(confirmation2);

        submenu3.add(comboBox);
        submenu3.add(confirmation3);
        submenu4.add(BorderLayout.SOUTH,label);
        submenu4.add(BorderLayout.NORTH, scrollBar);


        //Adding the subpanels to the main panel
        mainPanel.add(menuTitle);
        mainPanel.add(submenu);
        mainPanel.add(submenu2);
        mainPanel.add(submenu3);
        mainPanel.add(submenu4);
        mainPanel.add(submenu5);

        getContentPane().add(mainPanel);
        setSize(400,400);
        setVisible(true);

    }
}
