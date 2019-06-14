package checkerboard;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;

public class Checkerboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkerboard window = new Checkerboard();
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
	public Checkerboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		ImageIcon image=new ImageIcon("D:\\JAVAPROJECT\\WORKSPACE\\ChineseChess\\images\\homepage.jpg");
		JLabel label=new JLabel(image); frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(label); label.setBounds(0,0,650,800);
		frame.setVisible(true); 
		frame.setResizable(false);
//https://github.com/Elpsys/HomeWork.git
	}
}
