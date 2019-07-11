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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JFrame frame;
	static boolean rdClicked,bdClicked,rgClicked,bgClicked,rcClicked,bcClicked,rhClicked,bhClicked,reClicked,beClicked,rkClicked,bkClicked,rmClicked,bmClicked;
	static boolean rmove,bmove;
	static JButton redsoldier1,redsoldier2,redsoldier3,redsoldier4,redsoldier5,Lredgun,Rredgun,Lredcar,Rredcar,Lredhorse,Rredhorse,Lredelephant,Rredelephant,Lredknight,Rredknight,redcommander;
	static JButton blacksoldier1,blacksoldier2,blacksoldier3,blacksoldier4,blacksoldier5,Lblackgun,Rblackgun,Lblackcar,Rblackcar,Lblackhorse,Rblackhorse,Lblackelephant,Rblackelephant,Lblackknight,Rblackknight,blackcommander;
	static int rd,bd,rg,bg,rc,bc,rh,bh,re,be,rk,bk;//判断棋子的不同
	static int tips = 1;
	static int [] clx = {68,126,184,242,300,358,416,474,532};
	static int [] cly = {87,139,191,243,295,347,399,451,503,555};
	static int chesslocation [][] = {
			{1,0,0,1,0,0,1,0,0,1},   
			{1,0,1,0,0,0,0,1,0,1},
			{1,0,0,1,0,0,1,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,1,0,0,1},
			{1,0,0,0,0,0,0,0,0,1},
			{1,0,0,1,0,0,1,0,0,1},
			{1,0,1,0,0,0,0,1,0,1},
			{1,0,0,1,0,0,1,0,0,1}	
	};
	public static void chessboard()
	{
		if(tips == 1) {
			rmove = true;
			bmove = false;
		}
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
		//悔棋按钮
		ImageIcon imagebutton1 = new ImageIcon("images/backchess.png");
		JButton btnNewButton1 = new JButton(imagebutton1);
		btnNewButton1.setBounds(248, 652, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton1);
		btnNewButton1.addActionListener(new ActionListener() {    
			//单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
			//关闭当前窗口
			
			}

		});
		//返回主界面按钮
		ImageIcon imagebutton2 = new ImageIcon("images/buttonback.png");
		JButton btnNewButton = new JButton(imagebutton2);		//将图片载入按钮中
		btnNewButton.setBounds(64, 652, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton);
		//开始使用监听器监听
		btnNewButton.addActionListener(new ActionListener() {    
			//单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
			//打开一个新窗口
			Homepage.homepage();
			//关闭当前窗口
			closeThis();
			}

		});
		//退出游戏按钮
		ImageIcon imagebutton3 = new ImageIcon("images/buttonend.png");
		JButton btnNewButton2 = new JButton(imagebutton3);
		btnNewButton2.setBounds(431, 652, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener() {    
			//单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
			//关闭当前窗口
			closeThis();
			}

		});
		//红方兵1
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
				eatchessrd1();
			}
		});
		//红方兵2
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
				eatchessrd2();
			}
		});
		//红方兵3
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
				eatchessrd3();
			}
		});
		//红方兵4
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
				eatchessrd4();
			}
		});
		//红方兵5
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
				eatchessrd5();
			}
		});
		//红方炮左
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
				eatchessrg1();
			}
		});		
		//红方炮右
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
				eatchessrg2();
			}
		});	
		//红车左
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
				eatchessrc1();
			}
		});	
		//红车右
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
				eatchessrc2();
			}
		});	
		//红马左
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
				eatchessrh1();
			}
		});		
		//红马右
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
				eatchessrh2();
			}
		});	
		//红象左
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
				eatchessre1();
			}
		});		
		//红象右
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
				eatchessre2();
			}
		});	
		//红士左
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
				eatchessrk1();
			}
		});		
		//红士右
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
				eatchessrk2();
			}
		});	
		//红帅
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
				eatchessrm();
		 		if(Gamestart.redcommander.getX() == 593 && Gamestart.redcommander.getY() == 53) {
		 			 Victory.blackV();
		 		}
			}
		});			
		
		//黑色方------------------------------------------------------------------------------
		
		//黑方兵1
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
				eatchessbd1();
				
			}
		});
		//黑方兵2
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
				eatchessbd2();
			}
		});
		//黑方兵3
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
				eatchessbd3();
			}
		});
		//黑方兵4
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
				eatchessbd4();
			}
		});
		//黑方兵5
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
				eatchessbd5();
			}
		});
		//黑方炮左
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
				bgClicked = true;
				bg = 1;
				eatchessbg1();
			}
		});		
		//黑方炮右
		Rblackgun = new JButton(imagegun1);	
		Rblackgun.setBounds(474, 191, 52, 52);
		Rblackgun.setContentAreaFilled(false);
		Rblackgun.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackgun);
		Rblackgun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bgClicked = true;
				bg = 2;
				eatchessbg2();
			}
		});	
		//黑车左
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
				bcClicked = true;
				bc = 1;
				eatchessbc1();
			}
		});	
		//黑车右
		Rblackcar = new JButton(imagecar1);	
		Rblackcar.setBounds(532, 87, 52, 52);
		Rblackcar.setContentAreaFilled(false);
		Rblackcar.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackcar);
		Rblackcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bcClicked = true;
				bc = 2;
				eatchessbc2();
			}
		});	
		//黑马左
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
				bhClicked = true;
				bh = 1;
				eatchessbh1();
			}
		});		
		//黑马右
		Rblackhorse = new JButton(imagehorse1);	
		Rblackhorse.setBounds(474, 87, 52, 52);
		Rblackhorse.setContentAreaFilled(false);
		Rblackhorse.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackhorse);
		Rblackhorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bhClicked = true;
				bh = 2;
				eatchessbh2();
			}
		});	
		//黑象左
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
				beClicked = true;
				be = 1;
				eatchessbe1();
			}
		});		
		//黑象右
		Rblackelephant = new JButton(imageelephant1);	
		Rblackelephant.setBounds(416, 87, 52, 52);
		Rblackelephant.setContentAreaFilled(false);
		Rblackelephant.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackelephant);
		Rblackelephant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beClicked = true;
				be = 2;
				eatchessbe2();
			}
		});	
		//黑士左
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
				bkClicked = true;
				bk = 1;
				eatchessbk1();
			}
		});		
		//黑士右
		Rblackknight = new JButton(imageknight1);	
		Rblackknight.setBounds(358, 87, 52, 52);
		Rblackknight.setContentAreaFilled(false);
		Rblackknight.setBorderPainted(false);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(Rblackknight);
		Rblackknight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bkClicked = true;
				bk = 2;
				eatchessbk2();
			}
		});	
		//黑帅
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
				bmClicked = true;
				eatchessbm();
				if(blackcommander.getX() == 593 && blackcommander.getY() == 53) {
		 			 Victory.redV();
		 		}
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
	public static void eatchessbd1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(blacksoldier1.getX() == clx[i] && blacksoldier1.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier1.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier2.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier1.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier1.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier1.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier1.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier1.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier1.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier1.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier1.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier1.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier1.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier1.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier1.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier1.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier1.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier1.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier1.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier1.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier1.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier1.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										blacksoldier1.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbd2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(blacksoldier2.getX() == clx[i] && blacksoldier2.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier2.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier2.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier2.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier2.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier2.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier2.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier2.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier2.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier2.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier2.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier2.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier2.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier2.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier2.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier2.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier2.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier2.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier2.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier2.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier2.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier2.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										blacksoldier2.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbd3() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(blacksoldier3.getX() == clx[i] && blacksoldier3.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier3.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier3.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier3.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier3.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier3.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier3.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier3.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier3.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier3.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier3.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier3.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier3.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier3.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier3.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier3.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier3.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier3.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier3.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier3.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier3.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier3.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										blacksoldier3.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbd4() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(blacksoldier4.getX() == clx[i] && blacksoldier4.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier4.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier4.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier4.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier4.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier4.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier4.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier4.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier4.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier4.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier4.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier4.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier4.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier4.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier4.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier4.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier4.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier4.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier4.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier4.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier4.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier4.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										blacksoldier4.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbd5() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(blacksoldier5.getX() == clx[i] && blacksoldier5.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier5.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier5.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier5.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier5.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blacksoldier5.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier5.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier5.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier5.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blacksoldier5.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier5.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier5.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blacksoldier5.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blacksoldier5.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier5.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier5.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier5.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blacksoldier5.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier5.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blacksoldier5.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier5.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blacksoldier5.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										blacksoldier5.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbg1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lblackgun.getX() == clx[i] && Lblackgun.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackgun.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackgun.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackgun.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackgun.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackgun.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackgun.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackgun.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackgun.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackgun.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackgun.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackgun.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackgun.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackgun.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackgun.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackgun.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackgun.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackgun.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackgun.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackgun.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackgun.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackgun.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lblackgun.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbg2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rblackgun.getX() == clx[i] && Rblackgun.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackgun.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackgun.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackgun.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackgun.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackgun.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackgun.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackgun.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackgun.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackgun.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackgun.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackgun.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackgun.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackgun.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackgun.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackgun.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackgun.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackgun.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackgun.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackgun.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackgun.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackgun.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rblackgun.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbc1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lblackcar.getX() == clx[i] && Lblackcar.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackcar.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackcar.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackcar.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackcar.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackcar.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackcar.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackcar.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackcar.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackcar.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackcar.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackcar.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackcar.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackcar.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackcar.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackcar.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackcar.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackcar.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackcar.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackcar.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackcar.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackcar.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lblackcar.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbc2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rblackcar.getX() == clx[i] && Rblackcar.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackcar.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackcar.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackcar.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackcar.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackcar.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackcar.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackcar.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackcar.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackcar.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackcar.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackcar.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackcar.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackcar.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackcar.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackcar.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackcar.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackcar.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackcar.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackcar.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackcar.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackcar.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rblackcar.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbh1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lblackhorse.getX() == clx[i] && Lblackhorse.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackhorse.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackhorse.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackhorse.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackhorse.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackhorse.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackhorse.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackhorse.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackhorse.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackhorse.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackhorse.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackhorse.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackhorse.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackhorse.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackhorse.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackhorse.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackhorse.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackhorse.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackhorse.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackhorse.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackhorse.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackhorse.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lblackhorse.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbh2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rblackhorse.getX() == clx[i] && Rblackhorse.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackhorse.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackhorse.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackhorse.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackhorse.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackhorse.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackhorse.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackhorse.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackhorse.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackhorse.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackhorse.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackhorse.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackhorse.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackhorse.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackhorse.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackhorse.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackhorse.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackhorse.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackhorse.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackhorse.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackhorse.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackhorse.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rblackhorse.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbe1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lblackelephant.getX() == clx[i] && Lblackelephant.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackelephant.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackelephant.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackelephant.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackelephant.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackelephant.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackelephant.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackelephant.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackelephant.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackelephant.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackelephant.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackelephant.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackelephant.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackelephant.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackelephant.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackelephant.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackelephant.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackelephant.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackelephant.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackelephant.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackelephant.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackelephant.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lblackelephant.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbe2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rblackelephant.getX() == clx[i] && Rblackelephant.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackelephant.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackelephant.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackelephant.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackelephant.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackelephant.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackelephant.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackelephant.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackelephant.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackelephant.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackelephant.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackelephant.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackelephant.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackelephant.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackelephant.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackelephant.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackelephant.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackelephant.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackelephant.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackelephant.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackelephant.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackelephant.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rblackelephant.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbk1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lblackknight.getX() == clx[i] && Lblackknight.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackknight.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackknight.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackknight.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackknight.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lblackknight.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackknight.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackknight.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackknight.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lblackknight.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackknight.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackknight.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lblackknight.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lblackknight.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackknight.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackknight.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackknight.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lblackknight.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackknight.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lblackknight.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackknight.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lblackknight.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lblackknight.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbk2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rblackknight.getX() == clx[i] && Rblackknight.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackknight.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackknight.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackknight.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackknight.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rblackknight.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackknight.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackknight.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackknight.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rblackknight.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackknight.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackknight.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rblackknight.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rblackknight.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackknight.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackknight.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackknight.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rblackknight.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackknight.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rblackknight.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackknight.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rblackknight.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rblackknight.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessbm() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(blackcommander.getX() == clx[i] && blackcommander.getY() == cly[j]) {
					if(rdClicked) {
						if(rd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blackcommander.setLocation(593, 53);
											redsoldier1.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blackcommander.setLocation(593, 53);
											redsoldier2.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blackcommander.setLocation(593, 53);
											redsoldier3.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blackcommander.setLocation(593, 53);
											redsoldier4.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											blackcommander.setLocation(593, 53);
											redsoldier5.setLocation(clx[i], cly[j]);
											rdClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rgClicked) {
						if(rg == 1) {
							if(Lredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blackcommander.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blackcommander.setLocation(593, 53);
											Lredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rg == 2) {
							if(Rredgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blackcommander.setLocation(593, 53);
											Rredgun.setLocation(clx[8-i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rredgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											blackcommander.setLocation(593, 53);
											Rredgun.setLocation(clx[i], cly[j]);
											rgClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(rhClicked) {
						if(rh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blackcommander.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blackcommander.setLocation(593, 53);
											Lredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											blackcommander.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											blackcommander.setLocation(593, 53);
											Rredhorse.setLocation(clx[i], cly[j]);
											rhClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rcClicked) {
						if(rc == 1) {
							if(Lredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blackcommander.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blackcommander.setLocation(593, 53);
											Lredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(rc == 2) {
							if(Rredcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rredcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blackcommander.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rredcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rredcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											blackcommander.setLocation(593, 53);
											Rredcar.setLocation(clx[i], cly[j]);
											rcClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(reClicked) {
						if(re == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blackcommander.setLocation(593, 53);
											Lredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											blackcommander.setLocation(593, 53);
											Rredelephant.setLocation(clx[i], cly[j]);
											reClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rkClicked) {
						if(rk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blackcommander.setLocation(593, 53);
											Lredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(rk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											blackcommander.setLocation(593, 53);
											Rredknight.setLocation(clx[i], cly[j]);
											rkClicked = false;
											rmove = false;
											bmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(rmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										blackcommander.setLocation(593, 53);
										redcommander.setLocation(clx[i], cly[j]);
										rmClicked = false;
										rmove = false;
										bmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrd1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {;
				if(redsoldier1.getX() == clx[i] && redsoldier1.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier1.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier1.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier1.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier1.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier1.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier1.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier1.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier1.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier1.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier1.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier1.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier1.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier1.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier1.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier1.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier1.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier1.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier1.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier1.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier1.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier1.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redsoldier1.getX() == clx[m] && redsoldier1.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										redsoldier1.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrd2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(redsoldier2.getX() == clx[i] && redsoldier2.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier2.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier2.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier2.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier2.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier2.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier2.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier2.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier2.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier2.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier2.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier2.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier2.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier2.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier2.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier2.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier2.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier2.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier2.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier2.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier2.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier2.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redsoldier2.getX() == clx[m] && redsoldier2.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										redsoldier2.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrd3() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(redsoldier3.getX() == clx[i] && redsoldier3.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier3.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier3.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier3.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier3.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier3.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier3.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier3.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier3.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier3.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier3.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier3.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier3.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier3.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier3.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier3.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier3.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier3.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier3.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier3.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier3.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier3.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redsoldier3.getX() == clx[m] && redsoldier3.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										redsoldier3.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrd4() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(redsoldier4.getX() == clx[i] && redsoldier4.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier4.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier4.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier4.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier4.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier4.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier4.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier4.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier4.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier4.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier4.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier4.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier4.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier4.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier4.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier4.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier4.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier4.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier4.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier4.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier4.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier4.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redsoldier4.getX() == clx[m] && redsoldier4.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										redsoldier4.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrd5() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(redsoldier5.getX() == clx[i] && redsoldier5.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier5.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier5.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier5.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier5.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redsoldier5.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier5.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier5.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier5.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redsoldier5.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier5.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier5.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redsoldier5.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redsoldier5.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier5.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier5.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier5.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redsoldier5.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier5.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redsoldier5.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier5.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redsoldier5.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redsoldier5.getX() == clx[m] && redsoldier5.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										redsoldier5.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrg1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lredgun.getX() == clx[i] && Lredgun.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredgun.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredgun.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredgun.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredgun.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredgun.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredgun.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredgun.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredgun.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredgun.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredgun.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredgun.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredgun.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredgun.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredgun.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredgun.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredgun.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredgun.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredgun.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredgun.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredgun.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredgun.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Lredgun.getX() == clx[m] && Lredgun.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lredgun.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrg2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rredgun.getX() == clx[i] && Rredgun.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredgun.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredgun.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredgun.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredgun.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredgun.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredgun.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredgun.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredgun.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredgun.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredgun.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredgun.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredgun.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredgun.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredgun.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredgun.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredgun.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredgun.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredgun.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredgun.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredgun.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredgun.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Rredgun.getX() == clx[m] && Rredgun.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rredgun.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrc1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lredcar.getX() == clx[i] && Lredcar.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredcar.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredcar.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredcar.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredcar.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredcar.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredcar.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredcar.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredcar.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredcar.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredcar.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredcar.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredcar.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredcar.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredcar.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredcar.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredcar.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredcar.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredcar.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredcar.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredcar.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredcar.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Lredcar.getX() == clx[m] && Lredcar.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lredcar.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrc2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rredcar.getX() == clx[i] && Rredcar.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredcar.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredcar.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredcar.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredcar.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredcar.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredcar.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredcar.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredcar.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredcar.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredcar.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredcar.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredcar.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredcar.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredcar.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredcar.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredcar.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredcar.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredcar.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredcar.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredcar.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredcar.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Rredcar.getX() == clx[m] && Rredcar.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rredcar.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrh1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lredhorse.getX() == clx[i] && Lredhorse.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredhorse.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredhorse.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredhorse.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredhorse.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredhorse.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredhorse.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredhorse.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredhorse.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredhorse.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredhorse.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredhorse.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredhorse.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredhorse.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredhorse.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredhorse.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredhorse.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredhorse.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredhorse.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredhorse.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredhorse.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredhorse.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Lredhorse.getX() == clx[m] && Lredhorse.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lredhorse.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrh2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rredhorse.getX() == clx[i] && Rredhorse.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredhorse.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredhorse.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredhorse.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredhorse.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredhorse.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredhorse.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredhorse.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredhorse.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredhorse.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredhorse.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredhorse.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredhorse.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredhorse.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredhorse.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredhorse.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredhorse.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredhorse.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredhorse.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredhorse.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredhorse.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredhorse.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Rredhorse.getX() == clx[m] && Rredhorse.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rredhorse.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessre1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lredelephant.getX() == clx[i] && Lredelephant.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredelephant.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredelephant.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredelephant.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredelephant.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredelephant.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredelephant.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredelephant.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredelephant.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredelephant.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredelephant.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredelephant.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredelephant.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredelephant.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredelephant.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredelephant.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredelephant.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredelephant.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredelephant.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredelephant.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredelephant.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredelephant.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Lredelephant.getX() == clx[m] && Lredelephant.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lredelephant.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessre2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rredelephant.getX() == clx[i] && Rredelephant.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredelephant.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredelephant.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredelephant.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredelephant.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredelephant.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredelephant.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredelephant.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredelephant.setLocation(593, 53);
											Rblackgun.setLocation(clx[8-i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredelephant.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredelephant.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredelephant.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredelephant.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredelephant.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredelephant.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredelephant.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredelephant.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredelephant.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredelephant.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredelephant.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredelephant.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredelephant.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Rredelephant.getX() == clx[m] && Rredelephant.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rredelephant.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrk1() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Lredknight.getX() == clx[i] && Lredknight.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredknight.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredknight.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredknight.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredknight.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Lredknight.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredknight.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredknight.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredknight.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Lredknight.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredknight.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredknight.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Lredknight.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Lredknight.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredknight.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredknight.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredknight.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Lredknight.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredknight.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Lredknight.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredknight.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Lredknight.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Lredknight.getX() == clx[m] && Lredknight.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Lredknight.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrk2() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(Rredknight.getX() == clx[i] && Rredknight.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredknight.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredknight.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredknight.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredknight.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											Rredknight.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredknight.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredknight.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredknight.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											Rredknight.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredknight.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredknight.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											Rredknight.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											Rredknight.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredknight.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredknight.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredknight.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											Rredknight.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredknight.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											Rredknight.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredknight.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											Rredknight.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(Rredknight.getX() == clx[m] && Rredknight.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										Rredknight.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
	public static void eatchessrm() {
		int i,j,k,m;
		int number = 0;
		for(i = 0;i <= 8;i ++) {
			for(j = 0;j <= 9;j ++) {
				if(redcommander.getX() == clx[i] && redcommander.getY() == cly[j]) {
					if(bdClicked) {
						if(bd == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier1.getX() == clx[m] && blacksoldier1.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redcommander.setLocation(593, 53);
											blacksoldier1.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier2.getX() == clx[m] && blacksoldier2.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redcommander.setLocation(593, 53);
											blacksoldier2.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 3) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier3.getX() == clx[m] && blacksoldier3.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redcommander.setLocation(593, 53);
											blacksoldier3.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 4) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier4.getX() == clx[m] && blacksoldier4.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redcommander.setLocation(593, 53);
											blacksoldier4.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bd == 5) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(blacksoldier5.getX() == clx[m] && blacksoldier5.getY() == cly[k]) {
										if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
											redcommander.setLocation(593, 53);
											blacksoldier5.setLocation(clx[i], cly[j]);
											bdClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bgClicked) {
						if(bg == 1) {
							if(Lblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redcommander.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackgun.getY() == cly[j]) {
								
								for(k = 0;k <= 8;k ++) {
									if(Lblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redcommander.setLocation(593, 53);
											Lblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bg == 2) {
							if(Rblackgun.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackgun.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redcommander.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackgun.getY() == cly[j]) {
								for(k = 0;k <= 8;k ++) {
									if(Rblackgun.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												System.out.println(m);
												if(chesslocation[8-m][j] == 1) {
													number ++;	
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 1) {
											redcommander.setLocation(593, 53);
											Rblackgun.setLocation(clx[i], cly[j]);
											bgClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(bhClicked) {
						if(bh == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackhorse.getX() == clx[m] && Lblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redcommander.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redcommander.setLocation(593, 53);
											Lblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bh == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackhorse.getX() == clx[m] && Rblackhorse.getY() == cly[k]) {
										if(m == i+1 && k == j-2 || m == i-1 && k == j-2 || m == i+1 && k == j+2 || m == i-1 && k == j+2 ) {
											redcommander.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
										if(m == i+2 && k == j-1 || m == i-2 && k == j-1 || m == i+2 && k == j+1 || m == i-2 && k == j+1 ) {
											redcommander.setLocation(593, 53);
											Rblackhorse.setLocation(clx[i], cly[j]);
											bhClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bcClicked) {
						if(bc == 1) {
							if(Lblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Lblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redcommander.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Lblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Lblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redcommander.setLocation(593, 53);
											Lblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
						if(bc == 2) {
							if(Rblackcar.getX() == clx[i]){
								for(k = 0;k <=9;k ++) {
									if(Rblackcar.getY() == cly[k]) {
										if(k > j) {
											m = j + 1;
											for(m = j+1;m < k;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < j;m ++) {
												if(chesslocation[8-i][m] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redcommander.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-i][k] = 0;
										}
									}
								}
							}else if(Rblackcar.getY() == cly[j]) {	
								for(k = 0;k <= 8;k ++) {
									if(Rblackcar.getX() == clx[k]) {
										if(k > i) {
											for(m = i + 1;m < k;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}else if(k < j){
											for(m = k + 1;m < i;m ++) {
												if(chesslocation[8-m][j] == 1) {
													number ++;
												}
											}
										}
										if(number == 0) {
											redcommander.setLocation(593, 53);
											Rblackcar.setLocation(clx[i], cly[j]);
											bcClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-k][j] = 0;
										}
									}
								}
							}
						}
					}
					if(beClicked) {
						if(be == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackelephant.getX() == clx[m] && Lblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redcommander.setLocation(593, 53);
											Lblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(re == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackelephant.getX() == clx[m] && Rblackelephant.getY() == cly[k]) {
										if(m == i+2 && k == j-2 || m == i-1 && k == j-2 || m == i+2 && k == j+2 || m == i-2 && k == j+2 ) {
											redcommander.setLocation(593, 53);
											Rblackelephant.setLocation(clx[i], cly[j]);
											beClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bkClicked) {
						if(bk == 1) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Lblackknight.getX() == clx[m] && Lblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redcommander.setLocation(593, 53);
											Lblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
						if(bk == 2) {
							for(m = 0;m <= 8;m ++) {
								for(k = 0;k <= 9;k ++) {
									if(Rblackknight.getX() == clx[m] && Rblackknight.getY() == cly[k]) {
										if(m == i+1 && k == j-1 || m == i-1 && k == j-1 || m == i+1 && k == j+1 || m == i-1 && k == j+1 ) {
											redcommander.setLocation(593, 53);
											Rblackknight.setLocation(clx[i], cly[j]);
											bkClicked = false;
											bmove = false;
											rmove = true;
											chesslocation[8-m][k] = 0;
										}
									}
								}
							}
						}
					}
					if(bmClicked) {
						for(m = 0;m <= 8;m ++) {
							for(k = 0;k <= 9;k ++) {
								if(redcommander.getX() == clx[m] && redcommander.getY() == cly[k]) {
									if(m == i && k == j-1 || m == i && k == j+1 || m == i+1 && k == j || m == i-1 && k == j ) {
										redcommander.setLocation(593, 53);
										blackcommander.setLocation(clx[i], cly[j]);
										bmClicked = false;
										bmove = false;
										rmove = true;
										chesslocation[8-m][k] = 0;
									}
								}
							}
						}	
					}
				}	
			}
		}
	}
}
