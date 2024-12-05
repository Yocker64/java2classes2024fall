package task16;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class task16br extends JFrame implements ActionListener, AdjustmentListener {
    public static void main(String[] args) {
        new task16br();
    }

    // ボタンコンポーネントの変数
    JButton button1;// チェックボックスのOKボタン
    JButton button2;// ラジオボタンのOKボタン
    JButton button3;// コンボボックスのOKボタン
    JButton clearButton;// テキストフィールドのリセットボタン
    JButton OKButton;// テキストフィールドのOKボタン
    // ボタン以外のコンポーネントのインスタンス生成
    JCheckBox checkBox = new JCheckBox("チェックボックス");
    JRadioButton rd1 = new JRadioButton("選択肢１", true);
    JRadioButton rd2 = new JRadioButton("選択肢２");
    JRadioButton rd3 = new JRadioButton("選択肢３");
    JComboBox comboBox = new JComboBox();
    JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 5, 0, 105);
    JLabel label = new JLabel("50", JLabel.CENTER);
    JTextField textField = new JTextField(20);
    JMenuBar menuBar = new JMenuBar();
    JMenu menuFile = new JMenu("ファイル");
    JMenuItem menuOpen = new JMenuItem("開く");
    JMenuItem menuExit = new JMenuItem("終了");

    task16br() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));// コンテナ内配置（縦並び）
        // パネルのインスタンス生成
        JPanel panel1 = new JPanel();// チェックボックスとOKボタンのパネル
        JPanel panel2 = new JPanel();// ラジオボタン３個とOKボタンのパネル
        JPanel panel3 = new JPanel();// コンボボックスとOKボタンのパネル
        JPanel panel4 = new JPanel();// スクロールバーとラベルのパネル
        JPanel panel5 = new JPanel();// テキストフィールドのパネル
        JPanel panel6 = new JPanel();// テキストフィールドのボタン（リセット，OK）のパネル
        // パネル内の配置
        panel1.setLayout(new FlowLayout());// チェックボックスとOKボタンのパネル（横並び）
        panel2.setLayout(new FlowLayout());// ラジオボタン３個とOKボタンのパネル（横並び）
        panel3.setLayout(new FlowLayout());// コンボボックスとOKボタンのパネル（横並び）
        panel4.setLayout(new BorderLayout());// スクロールバーとラベルのパネル（縦並び）
        panel5.setLayout(new BorderLayout());// テキストフィールドのパネル（縦並び）
        panel6.setLayout(new FlowLayout());// テキストフィールドのボタン（リセット，OK）のパネル（横並び）
        // ボタンのインスタンス生成
        button1 = new JButton("OK");// チェックボックスのOKボタン
        button2 = new JButton("OK");// ラジオボタンのOKボタン
        button3 = new JButton("OK");// コンボボックスのOKボタン
        clearButton = new JButton("リセット");// テキストフィールドのリセットボタン
        OKButton = new JButton("OK");// テキストフィールドのOKボタン
        // リスナ登録
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        scrollBar.addAdjustmentListener(this);
        clearButton.addActionListener(this);
        OKButton.addActionListener(this);
        menuOpen.addActionListener(this);
        menuExit.addActionListener(this);
        // コンポーネントをパネルに配置
        panel1.add(checkBox);
        panel1.add(button1);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rd1);
        bg.add(rd2);
        bg.add(rd3);
        panel2.add(rd1);
        panel2.add(rd2);
        panel2.add(rd3);
        panel2.add(button2);
        comboBox.addItem("選択肢１");
        comboBox.addItem("選択肢２");
        comboBox.addItem("選択肢３");
        panel3.add(comboBox);
        panel3.add(button3);
        panel4.add(BorderLayout.NORTH, scrollBar);
        panel4.add(BorderLayout.SOUTH, label);
        panel5.add(BorderLayout.NORTH, textField);
        panel5.add(BorderLayout.CENTER, panel6);
        panel6.add(clearButton);
        panel6.add(OKButton);
        // パネルをコンテナに配置
        getContentPane().add(panel1);// チェックボックスとOKボタンのパネルを配置
        getContentPane().add(panel2);// ラジオボタンとOKボタンのパネルを配置
        getContentPane().add(panel3);// コンボボックスとOKボタンのパネルを配置
        getContentPane().add(panel4);// スクロールバーとラベルのパネルを配置
        getContentPane().add(panel5);// テキストフィールドとリセットボタンとOKボタンのパネルを配置
        // メニューバーの配置
        menuFile.add(menuOpen);
        menuFile.add(menuExit);
        menuBar.add(menuFile);
        setJMenuBar(menuBar);
        setSize(400, 400);
        setVisible(true);
    }

    // ボタンが押された時の動作
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if (checkBox.isSelected()) {
                System.out.println("チェックボックスはONです");
            } else {
                System.out.println("チェックボックスはOFFです");
            }
        }
        if (e.getSource() == button2) {
            if (rd1.isSelected()) {
                System.out.println("【選択肢１】が選択されています");
            } else if (rd2.isSelected()) {
                System.out.println("【選択肢２】が選択されています");
            } else if (rd3.isSelected()) {
                System.out.println("【選択肢３】が選択されています");
            }
        }
        if (e.getSource() == button3) {
            System.out.println(comboBox.getSelectedItem() + "が選択されています");
        }
        if (e.getSource() == clearButton) {
            textField.setText("");
        } else if (e.getSource() == OKButton) {
            System.out.println("値は[" + textField.getText() + "]です");
        }
        if (e.getSource() == menuOpen) {
            System.out.println("ファイルが開きます");
        } else if (e.getSource() == menuExit) {
            System.exit(0);
        }
    }

    public void adjustmentValueChanged(AdjustmentEvent e) {
        JScrollBar sb = (JScrollBar) e.getSource();
        label.setText("" + sb.getValue());
    }
}
