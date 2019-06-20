package gamestart;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class TestFrame extends JFrame{
    JButton jbt;
    boolean isClickBt;//�ж��ǰ�ť��������Ǳ�ĵط������
    int w=100;//��ť���100����
    int h = 30;//��ť��30����
    int bh = 35;//���ڵ��ϱ߿��Լ35����
    public TestFrame() {
        jbt = new JButton("��ť");
        jbt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jbt.setText("���ƶ���");
                jbt.setForeground(Color.RED);
                isClickBt =true;   //���ð�ť�����Ϊtrue
            }
        });
        jbt.setBounds(50, 50, w, h);//��ť�ĳ�ʼλ��
        add(jbt);
        addMouseListener(new MyFrameMouse());//��Ӵ��ڵĵ����Ӧ
        setLayout(null);//���Բ���
        setTitle("�ƶ���ť����");
        setSize(300, 300);//���ڴ�С
        setLocationRelativeTo(null);//���ھ���
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
 
    }
    public static void main(String[] args) {
        new TestFrame();
    }
 
    class MyFrameMouse extends MouseAdapter{
        public void mouseClicked(MouseEvent e) {
            if(isClickBt){
                Point dp = e.getPoint();//�õ������λ��
                jbt.setLocation(dp.x-w/2,dp.y-h/2-bh);//��������jbt��λ��,�Լ�����ƫ����,����괦�ڰ�ť�м�
                isClickBt=false;//��ť�������Ϊfalse
                jbt.setText("��ť");
                jbt.setForeground(Color.BLACK);
            }
        }
    }
}