package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {
	static int [] clx = {68,126,184,242,300,358,416,474,532};

	static int [] cly = {87,139,191,243,295,347,399,451,503,555};

	 public void mouseClicked(MouseEvent e) {
		 int x,y;
		 Point dp = e.getPoint();//�õ������λ��
         x=dp.x;
         y=dp.y-35;
         System.out.println(Gamestart.rmove);
         //------------��ɫ����--------------
         //��ɫ��
         if(Gamestart.rdClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rd == 1) {	//�ж�����
			         if(x > 68 && x < 120 && y > 347 && y < 400) {//���÷�Χ
			        	 if(Gamestart.redsoldier1.getX() == clx[0] && Gamestart.redsoldier1.getY() == cly[6]) {
					         Gamestart.redsoldier1.setLocation(clx[0],cly[5]);		//����λ��
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 2) {
			         if(x > 184 && x < 236 && y > 347 && y < 400) {
			        	 if(Gamestart.redsoldier2.getX() == clx[2] && Gamestart.redsoldier2.getY() == cly[6]) {
					         Gamestart.redsoldier2.setLocation(clx[2],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 3) {
			         if(x > 300 && x < 352 && y > 347 && y < 400) {
			        	 if(Gamestart.redsoldier3.getX() == clx[4] && Gamestart.redsoldier3.getY() == cly[6]) {
					         Gamestart.redsoldier3.setLocation(clx[4],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 4) {
			         if(x > 416 && x < 468 && y > 347 && y < 400) {
			        	 if(Gamestart.redsoldier4.getX() == clx[6] && Gamestart.redsoldier4.getY() == cly[6]) {
					         Gamestart.redsoldier4.setLocation(clx[6],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 5) {
			         if(x > 532 && x < 584 && y > 347 && y < 400) {
			        	 if(Gamestart.redsoldier5.getX() == clx[8] && Gamestart.redsoldier5.getY() == cly[6]) {
					         Gamestart.redsoldier5.setLocation(clx[8],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
			 }else {
				 ErrorTip.tip();
			 }
         }
         //����
         if(Gamestart.rgClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rg == 1) {	//�ж�����
		        	//����λ��------------------------------------------------------------------------
		        	if(x > 126 && x < 178 && y > 555 && y < 607) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[9]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		        	if(x > 126 && x < 178 && y > 503 && y < 555) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[8]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 126 && x < 178 && y > 399 && y < 451) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[6]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 126 && x < 178 && y > 346 && y < 399) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[5]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 126 && x < 178 && y > 295 && y < 347) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[4]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 126 && x < 178 && y > 243 && y < 295) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[3]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 126 && x < 178 && y > 191 && y < 243) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[2]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 126 && x < 178 && y > 139 && y < 191) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[1]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 126 && x < 178 && y > 87 && y < 139) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[0]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         //����λ��------------------------------------------------------------------------------
			         if(x > 184 && x < 242 && y > 451 && y < 503) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[2],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 242 && x < 300 && y > 451 && y < 503) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[3],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 300 && x < 358 && y > 451 && y < 503) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[4],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 358 && x < 416 && y > 451 && y < 503) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[5],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 416 && x < 474 && y > 451 && y < 503) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[6],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > 474 && x < 532 && y > 451 && y < 503) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[7],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         
		         }
		         if(Gamestart.rg == 2) {
			         if(x > 184 && x < 236 && y > 347 && y < 400) {
			        	 if(Gamestart.redsoldier2.getX() == clx[2] && Gamestart.redsoldier2.getY() == cly[6]) {
					         Gamestart.redsoldier2.setLocation(clx[2],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
			 }else {
				 ErrorTip.tip();
			 }
         }
		 //��ɫ����
         if(Gamestart.bdClicked) {
			 if(Gamestart.bmove) {
		         if(Gamestart.bd == 1) {	//�ж�����
			         if(x > 68 && x < 120 && y > 295 && y < 347) {		//���÷�Χ
			        	 if(Gamestart.blacksoldier1.getX() == clx[0] && Gamestart.blacksoldier1.getY() == cly[3]) {
					         Gamestart.blacksoldier1.setLocation(clx[0],cly[4]);		//����λ��
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 2) {
			         if(x > 184 && x < 236 && y > 295 && y < 347) {
			        	 if(Gamestart.blacksoldier2.getX() == clx[2] && Gamestart.blacksoldier2.getY() == cly[3]) {
					         Gamestart.blacksoldier2.setLocation(clx[2],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 3) {
			         if(x > 300 && x < 352 && y > 295 && y < 347) {
			        	 if(Gamestart.blacksoldier3.getX() == clx[4] && Gamestart.blacksoldier3.getY() == cly[3]) {
					         Gamestart.blacksoldier3.setLocation(clx[4],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 4) {
			         if(x > 416 && x < 468 && y > 295 && y < 347) {
			        	 if(Gamestart.blacksoldier4.getX() == clx[6] && Gamestart.blacksoldier4.getY() == cly[3]) {
					         Gamestart.blacksoldier4.setLocation(clx[6],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 5) {
			         if(x > 532 && x < 584 && y > 295 && y < 347) {
			        	 if(Gamestart.blacksoldier5.getX() == clx[8] && Gamestart.blacksoldier5.getY() == cly[3]) {
					         Gamestart.blacksoldier5.setLocation(clx[8],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
			 }else {
				 ErrorTip.tip();
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
