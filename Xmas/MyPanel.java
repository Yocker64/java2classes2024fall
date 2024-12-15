package Xmas;

import java.awt.*;
import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import javax.swing.*;
// import task18.GraphicsExample;

public class MyPanel extends JPanel implements MouseListener, MouseMotionListener {
    
    public MyPanel(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    public void paintComponent(Graphics g) {
        Dimension d = getSize();
        int center = d.width / 2 - 15;
        int mid = d.height / 2;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, d.width, d.height);
        g.setColor(new Color(150, 100, 10));
        g.fillRect(center, mid + 85, 30, 50);
        g.setColor(Color.GREEN);
        int x1Points[] = { center - 65, center + 95, center + 15 };
        int y1Points[] = { mid + 100, mid + 100, mid + 40 };
        g.fillPolygon(x1Points, y1Points, 3);

        int x2Points[] = { center - 50, center + 80, center + 15 };
        int y2Points[] = { mid + 40, mid + 40, mid };
        g.fillPolygon(x2Points, y2Points, 3);
        int x3Points[] = { center - 35, center + 65, center + 15 };
        int y3Points[] = { mid, mid, mid - 30 };
        Font f = new Font("TimesRoman", Font.PLAIN, 60);
        g.setFont(f);
        g.fillPolygon(x3Points, y3Points, 3);
        g.setColor(Color.YELLOW);
        g.drawString("★", center - 15, mid - 30);
        

    }


    @Override
    public void mouseDragged(MouseEvent e) { //ドラッグイベント
        Graphics g = getGraphics();
        g.setColor(Color.WHITE); //色の設定（白）
        g.fillOval(e.getX()-2, e.getY()-2, 5, 5); //●を表示（サイズ５）
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e){ //クリックイベント
        Graphics g = getGraphics();
        g.setColor(new Color( //色の設定（ランダム）
            (int)(Math.random()*256), //R：赤
            (int)(Math.random()*256), //G：緑
            (int)(Math.random()*256))); //B：青
        g.fillOval(e.getX()-5, e.getY()-5, 20, 20);//●を表示（サイズ10）
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
