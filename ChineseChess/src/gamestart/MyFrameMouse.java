package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {
	static int [] clx = {68,126,184,242,300,358,416,474,532};

	static int [] cly = {87,139,191,243,295,347,399,451,503,555};

	 public void mouseClicked(MouseEvent e) {
		 int x,y;
		 Point dp = e.getPoint();//得到点击的位置
         x=dp.x;
         y=dp.y-35;
		 if(Gamestart.rdClicked) {
	         
//	         System.out.println(y);
	         if(Gamestart.rd == 1) {	//判断棋子
		         if(x > 68 && x < 120 && y > 347 && y < 400) {//设置范围
		        	 if(Gamestart.redsoldier1.getX() == clx[0] && Gamestart.redsoldier1.getY() == cly[6]) {
				         Gamestart.redsoldier1.setLocation(clx[0],cly[5]);		//设置位置
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.rd == 2) {
		         if(x > 184 && x < 236 && y > 347 && y < 400) {
		        	 if(Gamestart.redsoldier2.getX() == clx[2] && Gamestart.redsoldier2.getY() == cly[6]) {
				         Gamestart.redsoldier2.setLocation(clx[2],cly[5]);
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.rd == 3) {
		         if(x > 300 && x < 352 && y > 347 && y < 400) {
		        	 if(Gamestart.redsoldier3.getX() == clx[4] && Gamestart.redsoldier3.getY() == cly[6]) {
				         Gamestart.redsoldier3.setLocation(clx[4],cly[5]);
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.rd == 4) {
		         if(x > 416 && x < 468 && y > 347 && y < 400) {
		        	 if(Gamestart.redsoldier4.getX() == clx[6] && Gamestart.redsoldier4.getY() == cly[6]) {
				         Gamestart.redsoldier4.setLocation(clx[6],cly[5]);
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.rd == 5) {
		         if(x > 532 && x < 584 && y > 347 && y < 400) {
		        	 if(Gamestart.redsoldier5.getX() == clx[8] && Gamestart.redsoldier5.getY() == cly[6]) {
				         Gamestart.redsoldier5.setLocation(clx[8],cly[5]);
				         Gamestart.rdClicked = false;
		        	 }
		         }
	         }
		 }
		 //黑色棋子
		 if(Gamestart.bdClicked) {
	         if(Gamestart.bd == 1) {	//判断棋子
		         if(x > 68 && x < 120 && y > 295 && y < 347) {		//设置范围
		        	 if(Gamestart.blacksoldier1.getX() == clx[0] && Gamestart.blacksoldier1.getY() == cly[3]) {
				         Gamestart.blacksoldier1.setLocation(clx[0],cly[4]);		//设置位置
				         Gamestart.bdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.bd == 2) {
		         if(x > 184 && x < 236 && y > 295 && y < 347) {
		        	 if(Gamestart.blacksoldier2.getX() == clx[2] && Gamestart.blacksoldier2.getY() == cly[3]) {
				         Gamestart.blacksoldier2.setLocation(clx[2],cly[4]);
				         Gamestart.bdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.bd == 3) {
		         if(x > 300 && x < 352 && y > 295 && y < 347) {
		        	 if(Gamestart.blacksoldier3.getX() == clx[4] && Gamestart.blacksoldier3.getY() == cly[3]) {
				         Gamestart.blacksoldier3.setLocation(clx[4],cly[4]);
				         Gamestart.bdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.bd == 4) {
		         if(x > 416 && x < 468 && y > 295 && y < 347) {
		        	 if(Gamestart.blacksoldier4.getX() == clx[6] && Gamestart.blacksoldier4.getY() == cly[3]) {
				         Gamestart.blacksoldier4.setLocation(clx[6],cly[4]);
				         Gamestart.bdClicked = false;
		        	 }
		         }
	         }
	         if(Gamestart.bd == 5) {
		         if(x > 532 && x < 584 && y > 295 && y < 347) {
		        	 if(Gamestart.blacksoldier5.getX() == clx[8] && Gamestart.blacksoldier5.getY() == cly[3]) {
				         Gamestart.blacksoldier5.setLocation(clx[8],cly[4]);
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
