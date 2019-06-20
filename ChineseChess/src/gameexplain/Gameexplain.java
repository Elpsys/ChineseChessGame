package gameexplain;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import homepage.Homepage;

public class Gameexplain extends JFrame{
	public static JFrame frame;
	public static void Gameexplain() {
		//closeThis();
		//创建新的窗口
		frame = new JFrame("游戏说明");
		//背景图片
		frame.setBounds(100, 100, 650, 800);
		ImageIcon imagehome = new ImageIcon("images/explain.jpg");
		JLabel label = new JLabel(imagehome);			//将图片储存在label中
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//获取窗口的第二层，将label放入
		label.setBounds(0, 0, 650, 800);
		Container cp=frame.getContentPane();   //将获取的值，付给顶层容器
		cp.setLayout(new BorderLayout());		//设置布局为边框布局
		((JPanel)cp).setOpaque(false);		//将顶层容器获取，并设置为透明
		//返回按钮
		ImageIcon imagebutton2 = new ImageIcon("images/buttonback.png");
		JButton btnNewButton = new JButton(imagebutton2);		//将图片载入按钮中
		btnNewButton.setBounds(247, 669, 156, 48);
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
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Gameexplain();
	}
	public static void closeThis() {
		frame.dispose();
	}
}
