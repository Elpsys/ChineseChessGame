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
		//�����µĴ���
		frame = new JFrame("��Ϸ˵��");
		//����ͼƬ
		frame.setBounds(100, 100, 650, 800);
		ImageIcon imagehome = new ImageIcon("images/explain.jpg");
		JLabel label = new JLabel(imagehome);			//��ͼƬ������label��
		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));		//��ȡ���ڵĵڶ��㣬��label����
		label.setBounds(0, 0, 650, 800);
		Container cp=frame.getContentPane();   //����ȡ��ֵ��������������
		cp.setLayout(new BorderLayout());		//���ò���Ϊ�߿򲼾�
		((JPanel)cp).setOpaque(false);		//������������ȡ��������Ϊ͸��
		//���ذ�ť
		ImageIcon imagebutton2 = new ImageIcon("images/buttonback.png");
		JButton btnNewButton = new JButton(imagebutton2);		//��ͼƬ���밴ť��
		btnNewButton.setBounds(247, 669, 156, 48);
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
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Gameexplain();
	}
	public static void closeThis() {
		frame.dispose();
	}
}
