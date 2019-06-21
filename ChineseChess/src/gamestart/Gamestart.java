package gamestart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gamestart.TestFrame.MyFrameMouse;

public class Gamestart extends JFrame{
	public static JFrame frame;
	static boolean isClicked;
	static ImageIcon imagechesssoldier;
	static JButton soldierbutton1;
	static int x;
	static int y;
	
	public static void chessboard()
	{
		frame=new JFrame("中国象棋"); 
		frame.setBounds(100, 100, 650, 800);
		//背景图与棋盘
		ImageIcon imagehome = new ImageIcon("images/chessboard.jpg");
		JLabel label = new JLabel(imagehome);			
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		
		label.setBounds(0, 0, 650, 800);
		Container cp=frame.getContentPane();   
		cp.setLayout(new BorderLayout());		
		((JPanel)cp).setOpaque(false);	
		
		// 

		imagechesssoldier = new ImageIcon("images/redsoldier.png");
		soldierbutton1 = new JButton(imagechesssoldier);	
		soldierbutton1.setBounds(71, 397, 52, 52);
		soldierbutton1.setContentAreaFilled(false);
		soldierbutton1.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(soldierbutton1);
		soldierbutton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isClicked = true;
			}
		});
		frame.addMouseListener(new MyFrameMouse());

		frame.setVisible(true); 
		frame.setResizable(false);
	}
	public static void main(String[] args) {
		chessboard();
	}
	
	class MyFrameMouse extends MouseAdapter{
        public void mouseClicked(MouseEvent e) {
            if(isClicked){
                Point dp = e.getPoint();//得到点击的位置
                soldierbutton1.setLocation(dp.x-26,dp.y-26);//重新设置jbt的位置,以及修正偏移量,让鼠标处于按钮中间
                isClicked=false;//按钮点击设置为false
            }
        }
    }
}
