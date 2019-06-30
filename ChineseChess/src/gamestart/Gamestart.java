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

import homepage.Homepage;


public class Gamestart extends JFrame{
	public static JFrame frame;
	static boolean rdClicked,bdClicked,rgClicked,bgClicked,rcClicked,bcClicked,rhClicked,bhClicked,reClicked,beClicked,rkClicked,bkClicked,rmClicked,bmClicked;
	static boolean rmove,bmove;
	static JButton redsoldier1,redsoldier2,redsoldier3,redsoldier4,redsoldier5,Lredgun,Rredgun,Lredcar,Rredcar,Lredhorse,Rredhorse,Lredelephant,Rredelephant,Lredknight,Rredknight,redcommander;
	static JButton blacksoldier1,blacksoldier2,blacksoldier3,blacksoldier4,blacksoldier5,Lblackgun,Rblackgun,Lblackcar,Rblackcar,Lblackhorse,Rblackhorse,Lblackelephant,Rblackelephant,Lblackknight,Rblackknight,blackcommander;
	static int rd,bd,rg,bg,rc,bc,rh,bh,re,be,rk,bk;//�ж����ӵĲ�ͬ
	static int x,y;
	static int tips = 1;
	static int [] clx = {68,126,184,242,300,358,416,474,532};
	static int [] cly = {87,139,191,243,295,347,399,451,503,555};
	static int chesslocation [][] = {//��ɫ��1��ͷ����ɫ��2��ͷ
			{211,212,213,214,215,216,217,218,219},   //211���󳵣�212������213������214����ʿ��215˧��26������21-25С��
			{0,0,0,0,0,0,0,0,0},
			{0,26,0,0,0,0,0,27,0},
			{21,0,22,0,23,0,24,0,25},
			{0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0},
			{11,0,12,0,13,0,14,0,15},
			{0,16,0,0,0,0,0,17,0},
			{0,0,0,0,0,0,0,0,0},
			{111,112,113,114,115,116,117,118,119}	//111���󳵣�112������113������114����ʿ��115˧��16������11-15С��
	};
	public static void chessboard()
	{
		if(tips == 1) {
			rmove = true;
			bmove = false;
		}
		frame=new JFrame("�й�����"); 
		frame.setBounds(100, 100, 650, 800);
		//����ͼ������
		ImageIcon imagehome = new ImageIcon("images/chessboard.jpg");
		JLabel label = new JLabel(imagehome);			
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		
		label.setBounds(0, 0, 650, 800);
		Container cp=frame.getContentPane();   
		cp.setLayout(new BorderLayout());		
		((JPanel)cp).setOpaque(false);	
		//���尴ť
		ImageIcon imagebutton1 = new ImageIcon("images/backchess.png");
		JButton btnNewButton1 = new JButton(imagebutton1);
		btnNewButton1.setBounds(248, 652, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton1);
		btnNewButton1.addActionListener(new ActionListener() {    
			//������ťִ�еķ���
			public void actionPerformed(ActionEvent e) {
			//�رյ�ǰ����
			
			}

		});
		//���������水ť
		ImageIcon imagebutton2 = new ImageIcon("images/buttonback.png");
		JButton btnNewButton = new JButton(imagebutton2);		//��ͼƬ���밴ť��
		btnNewButton.setBounds(64, 652, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton);
		//��ʼʹ�ü���������
		btnNewButton.addActionListener(new ActionListener() {    
			//������ťִ�еķ���
			public void actionPerformed(ActionEvent e) {
			//��һ���´���
			Homepage.homepage();
			//�رյ�ǰ����
			closeThis();
			}

		});
		//�˳���Ϸ��ť
		ImageIcon imagebutton3 = new ImageIcon("images/buttonend.png");
		JButton btnNewButton2 = new JButton(imagebutton3);
		btnNewButton2.setBounds(431, 652, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener() {    
			//������ťִ�еķ���
			public void actionPerformed(ActionEvent e) {
			//�رյ�ǰ����
			closeThis();
			}

		});
		//�췽��1
		ImageIcon imagerd;
		imagerd = new ImageIcon("images/redsoldier.png");
		redsoldier1 = new JButton(imagerd);	
		redsoldier1.setBounds(68, 399, 52, 52);
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
		//�췽��2
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
		//�췽��3
		redsoldier3 = new JButton(imagerd);	
		redsoldier3.setBounds(300, 399, 52, 52);
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
		//�췽��4
		redsoldier4 = new JButton(imagerd);	
		redsoldier4.setBounds(416, 399, 52, 52);
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
		//�췽��5
		redsoldier5 = new JButton(imagerd);	
		redsoldier5.setBounds(532, 399, 52, 52);
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
		//�췽����
		ImageIcon imagegun;
		imagegun = new ImageIcon("images/redgun.png");
		Lredgun = new JButton(imagegun);	
		Lredgun.setBounds(126, 451, 52, 52);
		Lredgun.setContentAreaFilled(false);
		Lredgun.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredgun);
		Lredgun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rgClicked = true;
				rg = 1;
			}
		});		
		//�췽����
		Rredgun = new JButton(imagegun);	
		Rredgun.setBounds(474, 451, 52, 52);
		Rredgun.setContentAreaFilled(false);
		Rredgun.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredgun);
		Rredgun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rgClicked = true;
				rg = 2;
			}
		});	
		//�쳵��
		ImageIcon imagecar;
		imagecar = new ImageIcon("images/redcar.png");
		Lredcar = new JButton(imagecar);	
		Lredcar.setBounds(68, 555, 52, 52);
		Lredcar.setContentAreaFilled(false);
		Lredcar.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredcar);
		Lredcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rcClicked = true;
				rc = 1;
			}
		});	
		//�쳵��
		Rredcar = new JButton(imagecar);	
		Rredcar.setBounds(532, 555, 52, 52);
		Rredcar.setContentAreaFilled(false);
		Rredcar.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredcar);
		Rredcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rcClicked = true;
				rc = 2;
			}
		});	
		//������
		ImageIcon imagehorse;
		imagehorse = new ImageIcon("images/redhorse.png");
		Lredhorse = new JButton(imagehorse);	
		Lredhorse.setBounds(126, 555, 52, 52);
		Lredhorse.setContentAreaFilled(false);
		Lredhorse.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredhorse);
		Lredhorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rhClicked = true;
				rh = 1;
			}
		});		
		//������
		Rredhorse = new JButton(imagehorse);	
		Rredhorse.setBounds(474, 555, 52, 52);
		Rredhorse.setContentAreaFilled(false);
		Rredhorse.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredhorse);
		Rredhorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rhClicked = true;
				rh = 2;
			}
		});	
		//������
		ImageIcon imageelephant;
		imageelephant = new ImageIcon("images/redelephant.png");
		Lredelephant = new JButton(imageelephant);	
		Lredelephant.setBounds(184, 555, 52, 52);
		Lredelephant.setContentAreaFilled(false);
		Lredelephant.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredelephant);
		Lredelephant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reClicked = true;
				re = 1;
			}
		});		
		//������
		Rredelephant = new JButton(imageelephant);	
		Rredelephant.setBounds(416, 555, 52, 52);
		Rredelephant.setContentAreaFilled(false);
		Rredelephant.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredelephant);
		Rredelephant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reClicked = true;
				re = 2;
			}
		});	
		//��ʿ��
		ImageIcon imageknight;
		imageknight = new ImageIcon("images/redknight.png");
		Lredknight = new JButton(imageknight);	
		Lredknight.setBounds(242, 555, 52, 52);
		Lredknight.setContentAreaFilled(false);
		Lredknight.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lredknight);
		Lredknight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rkClicked = true;
				rk = 1;
			}
		});		
		//��ʿ��
		Rredknight = new JButton(imageknight);	
		Rredknight.setBounds(358, 555, 52, 52);
		Rredknight.setContentAreaFilled(false);
		Rredknight.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rredknight);
		Rredknight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rkClicked = true;
				rk = 2;
			}
		});	
		//��˧
		ImageIcon imagecommander;
		imagecommander = new ImageIcon("images/redcommander.png");
		redcommander = new JButton(imagecommander);	
		redcommander.setBounds(300, 555, 52, 52);
		redcommander.setContentAreaFilled(false);
		redcommander.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(redcommander);
		redcommander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rmClicked = true;
			}
		});			
		
		//------------------------------------------------------------------------------
		
		//�ڷ���1
		ImageIcon imagebd;
		imagebd = new ImageIcon("images/blacksoldier.png");
		blacksoldier1 = new JButton(imagebd);	
		blacksoldier1.setBounds(68, 243, 52, 52);
		blacksoldier1.setContentAreaFilled(false);
		blacksoldier1.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(blacksoldier1);
		blacksoldier1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bdClicked = true;
				bd = 1;
				if(rdClicked) {
					eatchess();
					
				}
			}
		});
		//�ڷ���2
		blacksoldier2 = new JButton(imagebd);	
		blacksoldier2.setBounds(184, 243, 52, 52);
		blacksoldier2.setContentAreaFilled(false);
		blacksoldier2.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(blacksoldier2);
		blacksoldier2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bdClicked = true;
				bd = 2;
			}
		});
		//�ڷ���3
		blacksoldier3 = new JButton(imagebd);	
		blacksoldier3.setBounds(300, 243, 52, 52);
		blacksoldier3.setContentAreaFilled(false);
		blacksoldier3.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(blacksoldier3);
		blacksoldier3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bdClicked = true;
				bd = 3;
			}
		});
		//�ڷ���4
		blacksoldier4 = new JButton(imagebd);	
		blacksoldier4.setBounds(416, 243, 52, 52);
		blacksoldier4.setContentAreaFilled(false);
		blacksoldier4.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(blacksoldier4);
		blacksoldier4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bdClicked = true;
				bd = 4;
			}
		});
		//�ڷ���5
		blacksoldier5 = new JButton(imagebd);	
		blacksoldier5.setBounds(532, 243, 52, 52);
		blacksoldier5.setContentAreaFilled(false);
		blacksoldier5.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(blacksoldier5);
		blacksoldier5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bdClicked = true;
				bd = 5;
			}
		});
		//�ڷ�����
		ImageIcon imagegun1;
		imagegun1 = new ImageIcon("images/blackgun.png");
		Lblackgun = new JButton(imagegun1);	
		Lblackgun.setBounds(126, 191, 52, 52);
		Lblackgun.setContentAreaFilled(false);
		Lblackgun.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lblackgun);
		Lblackgun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		//�ڷ�����
		Rblackgun = new JButton(imagegun1);	
		Rblackgun.setBounds(474, 191, 52, 52);
		Rblackgun.setContentAreaFilled(false);
		Rblackgun.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackgun);
		Rblackgun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//�ڳ���
		ImageIcon imagecar1;
		imagecar1 = new ImageIcon("images/blackcar.png");
		Lblackcar = new JButton(imagecar1);	
		Lblackcar.setBounds(68, 87, 52, 52);
		Lblackcar.setContentAreaFilled(false);
		Lblackcar.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lblackcar);
		Lblackcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//�ڳ���
		Rblackcar = new JButton(imagecar1);	
		Rblackcar.setBounds(532, 87, 52, 52);
		Rblackcar.setContentAreaFilled(false);
		Rblackcar.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackcar);
		Rblackcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//������
		ImageIcon imagehorse1;
		imagehorse1 = new ImageIcon("images/blackhorse.png");
		Lblackhorse = new JButton(imagehorse1);	
		Lblackhorse.setBounds(126, 87, 52, 52);
		Lblackhorse.setContentAreaFilled(false);
		Lblackhorse.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lblackhorse);
		Lblackhorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		//������
		Rblackhorse = new JButton(imagehorse1);	
		Rblackhorse.setBounds(474, 87, 52, 52);
		Rblackhorse.setContentAreaFilled(false);
		Rblackhorse.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackhorse);
		Rblackhorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//������
		ImageIcon imageelephant1;
		imageelephant1 = new ImageIcon("images/blackelep.png");
		Lblackelephant = new JButton(imageelephant1);	
		Lblackelephant.setBounds(184, 87, 52, 52);
		Lblackelephant.setContentAreaFilled(false);
		Lblackelephant.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lblackelephant);
		Lblackelephant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		//������
		Rblackelephant = new JButton(imageelephant1);	
		Rblackelephant.setBounds(414, 88, 52, 52);
		Rblackelephant.setContentAreaFilled(false);
		Rblackelephant.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackelephant);
		Rblackelephant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//��ʿ��
		ImageIcon imageknight1;
		imageknight1 = new ImageIcon("images/blackknight.png");
		Lblackknight = new JButton(imageknight1);	
		Lblackknight.setBounds(242, 87, 52, 52);
		Lblackknight.setContentAreaFilled(false);
		Lblackknight.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Lblackknight);
		Lblackknight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		//��ʿ��
		Rblackknight = new JButton(imageknight1);	
		Rblackknight.setBounds(357, 88, 52, 52);
		Rblackknight.setContentAreaFilled(false);
		Rblackknight.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackknight);
		Rblackknight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});	
		//��˧
		ImageIcon imagecommander1;
		imagecommander1 = new ImageIcon("images/blackcommander.png");
		blackcommander = new JButton(imagecommander1);	
		blackcommander.setBounds(300, 87, 52, 52);
		blackcommander.setContentAreaFilled(false);
		blackcommander.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(blackcommander);
		blackcommander.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdClicked = true;
				rd = 5;
			}
		});		
		frame.addMouseListener(new MyFrameMouse());
		frame.setVisible(true); 
		frame.setResizable(false);		
		if(tips == 1) {
			Tip.tip();
			tips = 2;
		}
		
	}
	public static void main(String[] args) {
		chessboard();
	}
	public static void closeThis() {
		frame.dispose();
	}
	public static void eatchess() {
		int i,j;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <=9;j ++) {
				if(blacksoldier1.getX() == clx[i] && blacksoldier1.getY() == cly[j]) {
					if(rd == 1) {
						//��ɫ���ںڱ����
						if(redsoldier1.getX() == clx[i] && redsoldier1.getY() == cly[j+1]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier1.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
						//����ںڱ��ұ�
						if(redsoldier1.getX() == clx[i]+58 && redsoldier1.getY() == cly[j]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier1.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
						//����ںڱ����
						if(redsoldier1.getX() == clx[i]-58 && redsoldier1.getY() == cly[j]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier1.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
					}
					if(rd == 2) {
						//��ɫ���ںڱ����
						if(redsoldier2.getX() == clx[i] && redsoldier2.getY() == cly[j+1]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
						//����ںڱ��ұ�
						if(redsoldier2.getX() == clx[i]+58 && redsoldier2.getY() == cly[j]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
						//����ںڱ����
						if(redsoldier2.getX() == clx[i]-58 && redsoldier2.getY() == cly[j]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
					}
					if(rd == 3) {
						//��ɫ���ںڱ����
						if(redsoldier2.getX() == clx[i] && redsoldier2.getY() == cly[j+1]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
						//����ںڱ��ұ�
						if(redsoldier2.getX() == clx[i]+58 && redsoldier2.getY() == cly[j]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
						//����ںڱ����
						if(redsoldier2.getX() == clx[i]-58 && redsoldier2.getY() == cly[j]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
					}
					if(rd == 3) {
						//��ɫ���ںڱ����
						if(redsoldier2.getX() == clx[i] && redsoldier2.getY() == cly[j+1]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
						//����ںڱ��ұ�
						if(redsoldier2.getX() == clx[i]+58 && redsoldier2.getY() == cly[j]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
						//����ںڱ����
						if(redsoldier2.getX() == clx[i]-58 && redsoldier2.getY() == cly[j]) {
							blacksoldier1.setLocation(593, 53);
							redsoldier2.setLocation(clx[i], cly[j]);
							rdClicked = false;
							rmove = false;
							bmove = true;
						}
					}
				}
			}
		}
	}

}
