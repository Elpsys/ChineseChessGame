package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {

	 public void mouseClicked(MouseEvent e) {
		 int x,y;
		 Point dp = e.getPoint();//得到点击的位置
         x=dp.x;
         y=dp.y-33;
		 if(Gamestart.rdClicked) {
	         
//	         System.out.println(y);
	         if(Gamestart.rd == 1) {	//判断棋子
		         if(x > 71 && x < 123 && y > 343 && y < 397) {//设置范围
		        	 if(Gamestart.redsoldier1.getX() == 71 && Gamestart.redsoldier1.getY() == 399) {
				         Gamestart.redsoldier1.setLocation(71,343);		//设置位置
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.rd == 2) {
		         if(x > 184 && x < 235 && y > 343 && y < 397) {
		        	 if(Gamestart.redsoldier2.getX() == 184 && Gamestart.redsoldier2.getY() == 399) {
				         Gamestart.redsoldier2.setLocation(184,343);
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.rd == 3) {
		         if(x > 299 && x < 351 && y > 343 && y < 397) {
		        	 if(Gamestart.redsoldier3.getX() == 299 && Gamestart.redsoldier3.getY() == 399) {
				         Gamestart.redsoldier3.setLocation(299,343);
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.rd == 4) {
		         if(x > 415 && x < 467 && y > 343 && y < 397) {
		        	 if(Gamestart.redsoldier4.getX() == 415 && Gamestart.redsoldier4.getY() == 399) {
				         Gamestart.redsoldier4.setLocation(415,343);
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.rd == 5) {
		         if(x > 530 && x < 582 && y > 343 && y < 397) {
		        	 if(Gamestart.redsoldier5.getX() == 530 && Gamestart.redsoldier5.getY() == 399) {
				         Gamestart.redsoldier5.setLocation(530,343);
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
		 }
		 if(Gamestart.bdClicked) {
	         if(Gamestart.bd == 1) {	//判断棋子
		         if(x > 71 && x < 123 && y > 295 && y < 348) {		//设置范围
		        	 if(Gamestart.blacksoldier1.getX() == 71 && Gamestart.blacksoldier1.getY() == 245) {
				         Gamestart.blacksoldier1.setLocation(71,295);		//设置位置
				         Gamestart.bdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.bd == 2) {
		         if(x > 184 && x < 235 && y > 295 && y < 348) {
		        	 if(Gamestart.blacksoldier2.getX() == 184 && Gamestart.blacksoldier2.getY() == 245) {
				         Gamestart.blacksoldier2.setLocation(184,295);
				         Gamestart.bdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.bd == 3) {
		         if(x > 299 && x < 351 && y > 295 && y < 348) {
		        	 if(Gamestart.blacksoldier3.getX() == 299 && Gamestart.blacksoldier3.getY() == 245) {
				         Gamestart.blacksoldier3.setLocation(299,295);
				         Gamestart.bdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.bd == 4) {
		         if(x > 415 && x < 467 && y > 295 && y < 348) {
		        	 if(Gamestart.blacksoldier4.getX() == 415 && Gamestart.blacksoldier4.getY() == 245) {
				         Gamestart.blacksoldier4.setLocation(415,295);
				         Gamestart.bdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.bd == 5) {
		         if(x > 530 && x < 582 && y > 295 && y < 348) {
		        	 if(Gamestart.blacksoldier5.getX() == 530 && Gamestart.blacksoldier5.getY() == 245) {
				         Gamestart.blacksoldier5.setLocation(530,295);
				         Gamestart.bdClicked = false;
		        	 }
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
