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
import javax.swing.JLayeredPane;

public class Homepage {

	private static JFrame frame;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//首页的背景图片
		
		ImageIcon imagehome = new ImageIcon("images/homepage.jpg");
		JLabel label = new JLabel(imagehome);
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		label.setBounds(0, 0, 650, 800);
		Container cp=frame.getContentPane();
		cp.setLayout(new BorderLayout());
		((JPanel)cp).setOpaque(false);
		frame.setVisible(true); 
		frame.setResizable(false);
		
		//开始按钮
		
		ImageIcon imagebutton1 = new ImageIcon("images/buttonstart.png");
		JButton button=new JButton(imagebutton1);
		button.setBounds(247, 504, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(button);
		frame.setVisible(true); 
		frame.setResizable(false);
		
		//说明按钮
		
		ImageIcon imagebutton2 = new ImageIcon("images/buttonexplain.png");
		JButton btnNewButton = new JButton(imagebutton2);
		btnNewButton.setBounds(247, 570, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener(){
			//单击按钮执行的方法
			public void actionPerformed(ActionEvent e) {
			closeThis();
			//创建新的窗口
			JFrame frame = new JFrame("游戏说明");
			//设置在屏幕的位置
			frame.setLocation(100,100);
			// 窗体大小
			frame.setSize(650,800);
			// 显示窗体
			frame.setVisible(true);
			}

			});

		frame.setVisible(true); 
		frame.setResizable(false);
		
		//退出游戏按钮
		
		ImageIcon imagebutton3 = new ImageIcon("images/buttonend.png");
		JButton btnNewButton2 = new JButton(imagebutton3);
		btnNewButton2.setBounds(247, 635, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton2);
		frame.validate();
		frame.repaint();
		frame.setVisible(true); 
		frame.setResizable(false);
		//游戏说明按钮


	}
	public static void closeThis(){
		frame.dispose();
	}
}
