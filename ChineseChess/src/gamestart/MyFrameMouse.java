package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {

	 public void mouseClicked(MouseEvent e) {
         if(Gamestart.isClicked){
             Point dp = e.getPoint();//�õ������λ��
             Gamestart.soldierbutton1.setLocation(dp.x-26,dp.y-26);//��������jbt��λ��,�Լ�����ƫ����,����괦�ڰ�ť�м�
             Gamestart.isClicked=false;//��ť�������Ϊfalse
             
         }
     }

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
