package homepage;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import gameexplain.Gameexplain;

import javax.swing.JLayeredPane;

public class Homepage {

	public static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage() {
		homepage();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public static void homepage() {
		frame = new JFrame("中国象棋");
		frame.setBounds(100, 100, 650, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//首页的背景图片
		
		ImageIcon imagehome = new ImageIcon("images/homepage.jpg");
		JLabel label = new JLabel(imagehome);			//将图片储存在label中
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//获取窗口的第二层，将label放入
		label.setBounds(0, 0, 650, 800);
		Container cp=frame.getContentPane();   //将获取的值，付给顶层容器
		cp.setLayout(new BorderLayout());		//设置布局为边框布局
		((JPanel)cp).setOpaque(false);		//将顶层容器获取，并设置为透明
		
		//开始按钮
		
		ImageIcon imagebutton1 = new ImageIcon("images/buttonstart.png");
		JButton button=new JButton(imagebutton1);
		button.setBounds(247, 504, 156, 48);
		//首先设置布局为空
		frame.getContentPane().setLayout(null); 
		//添加按钮控件
		frame.getContentPane().add(button);

		
		//说明按钮
		
		ImageIcon imagebutton2 = new ImageIcon("images/buttonexplain.png");
		JButton btnNewButton = new JButton(imagebutton2);		//将图片载入按钮中
		btnNewButton.setBounds(247, 570, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton);
		//开始使用监听器监听
		btnNewButton.addActionListener(new ActionListener(){    
			//单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
			//打开一个新窗口
			Gameexplain.Gameexplain();
			//关闭当前窗口
			closeThis();
			}

		});
		
		//退出游戏按钮
		
		ImageIcon imagebutton3 = new ImageIcon("images/buttonend.png");
		JButton btnNewButton2 = new JButton(imagebutton3);
		btnNewButton2.setBounds(247, 635, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener(){    
			//单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
			//关闭当前窗口
			closeThis();
			}

		});
		//设置窗口可见
		frame.setVisible(true); 
		//设置窗口大小不可改变
		frame.setResizable(false);


	}
	public static void closeThis(){
		frame.dispose();
	}
}
