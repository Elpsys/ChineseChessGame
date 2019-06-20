package gamestart;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class TestFrame extends JFrame{
    JButton jbt;
    boolean isClickBt;//判断是按钮被点击还是别的地方被点击
    int w=100;//按钮宽度100像素
    int h = 30;//按钮高30像素
    int bh = 35;//窗口的上边框大约35像素
    public TestFrame() {
        jbt = new JButton("按钮");
        jbt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jbt.setText("可移动啦");
                jbt.setForeground(Color.RED);
                isClickBt =true;   //设置按钮被点击为true
            }
        });
        jbt.setBounds(50, 50, w, h);//按钮的初始位置
        add(jbt);
        addMouseListener(new MyFrameMouse());//添加窗口的点击响应
        setLayout(null);//绝对布局
        setTitle("移动按钮测试");
        setSize(300, 300);//窗口大小
        setLocationRelativeTo(null);//窗口居中
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
 
    }
    public static void main(String[] args) {
        new TestFrame();
    }
 
    class MyFrameMouse extends MouseAdapter{
        public void mouseClicked(MouseEvent e) {
            if(isClickBt){
                Point dp = e.getPoint();//得到点击的位置
                jbt.setLocation(dp.x-w/2,dp.y-h/2-bh);//重新设置jbt的位置,以及修正偏移量,让鼠标处于按钮中间
                isClickBt=false;//按钮点击设置为false
                jbt.setText("按钮");
                jbt.setForeground(Color.BLACK);
            }
        }
    }
}