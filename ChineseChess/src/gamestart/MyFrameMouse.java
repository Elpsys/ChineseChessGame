package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {

	 public void mouseClicked(MouseEvent e) {
		 int x,y;
		 if(Gamestart.rdClicked) {
	         Point dp = e.getPoint();//得到点击的位置
	         x=dp.x;
	         y=dp.y-33;
//	         System.out.println(y);
	         if(Gamestart.rd == 1) {	//判断棋子
		         if(x > 72 && x < 123 && y > 343 && y < 397) {		//设置范围
			         Gamestart.redsoldier1.setLocation(71,343);		//设置位置
			         Gamestart.rdClicked = false;
			         Gamestart.rd = 0;
		         }
	         }
	         if(Gamestart.rd == 2) {
		         if(x > 184 && x < 235 && y > 343 && y < 397) {
			         Gamestart.redsoldier2.setLocation(184,343);
			         Gamestart.rdClicked = false;
			         Gamestart.rd = 0;
		         }
	         }
	         if(Gamestart.rd == 3) {
		         if(x > 299 && x < 351 && y > 343 && y < 397) {
			         Gamestart.redsoldier3.setLocation(299,343);
			         Gamestart.rdClicked = false;
			         Gamestart.rd = 0;
		         }
	         }
	         if(Gamestart.rd == 4) {
		         if(x > 415 && x < 467 && y > 343 && y < 397) {
			         Gamestart.redsoldier4.setLocation(415,343);
			         Gamestart.rdClicked = false;
			         Gamestart.rd = 0;
		         }
	         }
	         if(Gamestart.rd == 5) {
		         if(x > 530 && x < 582 && y > 343 && y < 397) {
			         Gamestart.redsoldier5.setLocation(530,343);
			         Gamestart.rdClicked = false;
			         Gamestart.rd = 0;
		         }
	         }
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
