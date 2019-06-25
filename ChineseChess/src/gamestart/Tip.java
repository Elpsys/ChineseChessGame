package gamestart;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tip extends JFrame{
	public static JFrame frame;
	public static void tip() {
		frame = new JFrame();
		frame.setBounds(300, 300, 300, 200);
		JLabel label = new JLabel("请红方先走！",JLabel.CENTER);
		label.setFont(new Font("黑体",Font.PLAIN,16));
		frame.add(label);
		label.setSize(100, 100);
		label.setLocation(106, 20);
		JButton button = new JButton("确定");
		button.setBounds(106, 120, 88, 31);
		frame.getContentPane().add(button);
		frame.getContentPane().setLayout(null);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				closeThis();
			}
		});
		frame.setVisible(true);
		frame.setResizable(false);
	}
	public static void closeThis() {
		frame.dispose();
	}
} 
