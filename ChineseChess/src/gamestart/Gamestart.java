package gamestart;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
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
	static boolean rdClicked;
	static JButton redsoldier1,redsoldier2,redsoldier3,redsoldier4,redsoldier5,Lredgun,Rredgun,Lredcar,Rredcar,Lredhorse,Rredhorse,Lredelephant,Rredelephant,Lredknight,Rredknight,redcommander;
	static int rd;//ÅÐ¶Ï±øµÄ²»Í¬
	static int x;
	static int y;
	
	public static void chessboard()
	{
		frame=new JFrame("ÖÐ¹úÏóÆå"); 
		frame.setBounds(100, 100, 650, 800);
		//±³¾°Í¼ÓëÆåÅÌ
		ImageIcon imagehome = new ImageIcon("images/chessboard.jpg");
		JLabel label = new JLabel(imagehome);			
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		
		label.setBounds(0, 0, 650, 800);
		Container cp=frame.getContentPane();   
		cp.setLayout(new BorderLayout());		
		((JPanel)cp).setOpaque(false);	
		
		//ºì·½±ø1
		ImageIcon imagerd;
		imagerd = new ImageIcon("images/redsoldier.png");
		redsoldier1 = new JButton(imagerd);	
		redsoldier1.setBounds(71, 399, 52, 52);
		redsoldier1.setContentAreaFilled(false);
		redsoldier1.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(redsoldier1);
		redsoldier1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 1;
			}
		});
		//ºì·½±ø2
		redsoldier2 = new JButton(imagerd);	
		redsoldier2.setBounds(184, 399, 52, 52);
		redsoldier2.setContentAreaFilled(false);
		redsoldier2.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(redsoldier2);
		redsoldier2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 2;
			}
		});
		//ºì·½±ø3
		redsoldier3 = new JButton(imagerd);	
		redsoldier3.setBounds(299, 399, 52, 52);
		redsoldier3.setContentAreaFilled(false);
		redsoldier3.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(redsoldier3);
		redsoldier3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 3;
			}
		});
		//ºì·½±ø4
		redsoldier4 = new JButton(imagerd);	
		redsoldier4.setBounds(415, 399, 52, 52);
		redsoldier4.setContentAreaFilled(false);
		redsoldier4.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(redsoldier4);
		redsoldier4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 4;
			}
		});
		//ºì·½±ø5
		redsoldier5 = new JButton(imagerd);	
		redsoldier5.setBounds(530, 399, 52, 52);
		redsoldier5.setContentAreaFilled(false);
		redsoldier5.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(redsoldier5);
		redsoldier5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});
		//ºì·½ÅÚ×ó
		ImageIcon imagegun;
		imagegun = new ImageIcon("images/redgun.png");
		Lredgun = new JButton(imagegun);	
		Lredgun.setBounds(127, 449, 52, 52);
		Lredgun.setContentAreaFilled(false);
		Lredgun.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredgun);
		Lredgun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		//ºì·½ÅÚÓÒ
		Rredgun = new JButton(imagegun);	
		Rredgun.setBounds(473, 449, 52, 52);
		Rredgun.setContentAreaFilled(false);
		Rredgun.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredgun);
		Rredgun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//ºì³µ×ó
		ImageIcon imagecar;
		imagecar = new ImageIcon("images/redcar.png");
		Lredcar = new JButton(imagecar);	
		Lredcar.setBounds(71, 550, 52, 52);
		Lredcar.setContentAreaFilled(false);
		Lredcar.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredcar);
		Lredcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//ºì³µÓÒ
		Rredcar = new JButton(imagecar);	
		Rredcar.setBounds(530, 550, 52, 52);
		Rredcar.setContentAreaFilled(false);
		Rredcar.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredcar);
		Rredcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//ºìÂí×ó
		ImageIcon imagehorse;
		imagehorse = new ImageIcon("images/redhorse.png");
		Lredhorse = new JButton(imagehorse);	
		Lredhorse.setBounds(127, 550, 52, 52);
		Lredhorse.setContentAreaFilled(false);
		Lredhorse.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredhorse);
		Lredhorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		//ºìÂíÓÒ
		Rredhorse = new JButton(imagehorse);	
		Rredhorse.setBounds(473, 550, 52, 52);
		Rredhorse.setContentAreaFilled(false);
		Rredhorse.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredhorse);
		Rredhorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//ºìÏó×ó
		ImageIcon imageelephant;
		imageelephant = new ImageIcon("images/redelephant.png");
		Lredelephant = new JButton(imageelephant);	
		Lredelephant.setBounds(184, 550, 52, 52);
		Lredelephant.setContentAreaFilled(false);
		Lredelephant.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredelephant);
		Lredelephant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		//ºìÏóÓÒ
		Rredelephant = new JButton(imageelephant);	
		Rredelephant.setBounds(416, 550, 52, 52);
		Rredelephant.setContentAreaFilled(false);
		Rredelephant.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredelephant);
		Rredelephant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//ºìÊ¿×ó
		ImageIcon imageknight;
		imageknight = new ImageIcon("images/redknight.png");
		Lredknight = new JButton(imageknight);	
		Lredknight.setBounds(241, 550, 52, 52);
		Lredknight.setContentAreaFilled(false);
		Lredknight.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredknight);
		Lredknight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		//ºìÊ¿ÓÒ
		Rredknight = new JButton(imageknight);	
		Rredknight.setBounds(359, 550, 52, 52);
		Rredknight.setContentAreaFilled(false);
		Rredknight.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredknight);
		Rredknight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//ºìË§
		ImageIcon imagecommander;
		imagecommander = new ImageIcon("images/redcommander.png");
		redcommander = new JButton(imagecommander);	
		redcommander.setBounds(298, 550, 52, 52);
		redcommander.setContentAreaFilled(false);
		redcommander.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(redcommander);
		redcommander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});			
		frame.addMouseListener(new MyFrameMouse());
		frame.setVisible(true); 
		frame.setResizable(false);		
		
	}
	public static void main(String[] args) {
		chessboard();
	}
	

}
