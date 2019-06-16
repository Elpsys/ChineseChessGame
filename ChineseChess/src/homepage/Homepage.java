package homepage;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLayeredPane;

public class Homepage {

	private JFrame frame;

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
		//首页
		ImageIcon imagehome=new ImageIcon("images/homepage.jpg");
		JLabel label=new JLabel(imagehome);
		label.setBounds(0, 0, 650, 800);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(label);
		//开始按钮
		
		ImageIcon imagebutton1=new ImageIcon("images/buttonstart.png");
		JButton button=new JButton(imagebutton1);
		button.setBounds(247, 504, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(button);

		frame.validate();
		
		ImageIcon imagebutton2=new ImageIcon("images/buttonexplain.png");
		JButton btnNewButton = new JButton(imagebutton2);
		btnNewButton.setBounds(247, 570, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton);
		frame.validate();
		ImageIcon imagebutton3=new ImageIcon("images/buttonend.png");
		JButton btnNewButton2 = new JButton(imagebutton3);
		btnNewButton2.setBounds(247, 635, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton2);
		frame.repaint();
		frame.setVisible(true); 
		frame.setResizable(false);
		//游戏说明按钮


	}
}
