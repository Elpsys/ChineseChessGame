package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {

	 public void mouseClicked(MouseEvent e) {
		 int x,y;
         if(Gamestart.isClicked){
             Point dp = e.getPoint();//得到点击的位置
             x=dp.x;
             y=dp.y-33;
             System.out.println(y);
             if(x > 72 && x < 123 && y > 343 && y < 397) {
            	 System.out.println("***********");
            	 Gamestart.soldierbutton1.setLocation(71,343);
            	 Gamestart.isClicked=false;
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
