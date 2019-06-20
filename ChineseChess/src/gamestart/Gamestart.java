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

public class Gamestart extends JFrame{
	public static JFrame frame;
	static boolean isClicked;
	static ImageIcon imagechesssoldier;
	static JButton soldierbutton1;
	public void 

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
		soldierbutton1.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				isClicked = true;
				System.out.println(isClicked);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.setVisible(true); 
		frame.setResizable(false);
	}
	public static void main(String[] args) {
		chessboard();
	}
    
}
