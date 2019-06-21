package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {

	 public void mouseClicked(MouseEvent e) {
         if(Gamestart.isClicked){
             Point dp = e.getPoint();//得到点击的位置
             Gamestart.soldierbutton1.setLocation(dp.x-26,dp.y-26);//重新设置jbt的位置,以及修正偏移量,让鼠标处于按钮中间
             Gamestart.isClicked=false;//按钮点击设置为false
             
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
