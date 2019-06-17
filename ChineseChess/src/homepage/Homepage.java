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
		frame = new JFrame("�й�����");
		frame.setBounds(100, 100, 650, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ҳ�ı���ͼƬ
		
		ImageIcon imagehome = new ImageIcon("images/homepage.jpg");
		JLabel label = new JLabel(imagehome);			//��ͼƬ������label��
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//��ȡ���ڵĵڶ��㣬��label����
		label.setBounds(0, 0, 650, 800);
		Container cp=frame.getContentPane();   //����ȡ��ֵ��������������
		cp.setLayout(new BorderLayout());		//���ò���Ϊ�߿򲼾�
		((JPanel)cp).setOpaque(false);		//������������ȡ��������Ϊ͸��
		
		//��ʼ��ť
		
		ImageIcon imagebutton1 = new ImageIcon("images/buttonstart.png");
		JButton button=new JButton(imagebutton1);
		button.setBounds(247, 504, 156, 48);
		//�������ò���Ϊ��
		frame.getContentPane().setLayout(null); 
		//��Ӱ�ť�ؼ�
		frame.getContentPane().add(button);

		
		//˵����ť
		
		ImageIcon imagebutton2 = new ImageIcon("images/buttonexplain.png");
		JButton btnNewButton = new JButton(imagebutton2);		//��ͼƬ���밴ť��
		btnNewButton.setBounds(247, 570, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton);
		//��ʼʹ�ü���������
		btnNewButton.addActionListener(new ActionListener(){    
			//������ťִ�еķ���
			public void actionPerformed(ActionEvent e) {
			//��һ���´���
			Gameexplain.Gameexplain();
			//�رյ�ǰ����
			closeThis();
			}

		});
		
		//�˳���Ϸ��ť
		
		ImageIcon imagebutton3 = new ImageIcon("images/buttonend.png");
		JButton btnNewButton2 = new JButton(imagebutton3);
		btnNewButton2.setBounds(247, 635, 156, 48);
		frame.getContentPane().setLayout(null); 
		frame.getContentPane().add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener(){    
			//������ťִ�еķ���
			public void actionPerformed(ActionEvent e) {
			//�رյ�ǰ����
			closeThis();
			}

		});
		//���ô��ڿɼ�
		frame.setVisible(true); 
		//���ô��ڴ�С���ɸı�
		frame.setResizable(false);


	}
	public static void closeThis(){
		frame.dispose();
	}
}
