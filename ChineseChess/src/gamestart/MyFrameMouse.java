package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {
	static int [] clx = {68,126,184,242,300,358,416,474,532};
	static int [] cly = {87,139,191,243,295,347,399,451,503,555};
	
	static int x0,x1,x2,x3,x4,x5,x6,x7,x8;
	static int y0,y1,y2,y3,y4,y5,y6,y7,y8,y9;
	
	public void mouseClicked(MouseEvent e) {
		 int x,y;
		 int i,j;
		 Point dp = e.getPoint();//�õ������λ��
		 x0 = 68;
		 x1 = 126;
         x=dp.x;
         y=dp.y-35;
         System.out.println(Gamestart.rmove);
         //------------��ɫ����--------------
         if(Gamestart.rdClicked) {
			 if(Gamestart.rmove) {
				 if(Gamestart.rd == 1) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.redsoldier1.getX() == clx[i] && Gamestart.redsoldier1.getY() == cly[j]) {
			        			 if(x < clx[4]) {
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
				        				 Gamestart.redsoldier1.setLocation(clx[i],cly[j-1]);		//����λ��
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        			 }else {
			        				 Gamestart.redsoldier1.setLocation(clx[0],cly[5]);		//����λ��
							         Gamestart.rdClicked = false;
							         Gamestart.rmove = false;
									 Gamestart.bmove = true;
			        			 }
			        		 }
			        		 
			        	 }
			         }
				 }
			 }else {
				 ErrorTip.tip();
			 }
         }
         //��ɫ��
     /*    if(Gamestart.rdClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rd == 1) {	//�ж�����
			         if(x > clx[0] && x < clx[1] && y > cly[5] && y < cly[6]) {//���÷�Χ
			        	 if(Gamestart.redsoldier1.getX() == clx[0] && Gamestart.redsoldier1.getY() == cly[6]) {
					         Gamestart.redsoldier1.setLocation(clx[0],cly[5]);		//����λ��
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 2) {
			         if(x > clx[2] && x < clx[3] && y > cly[5] && y < cly[6]) {
			        	 if(Gamestart.redsoldier2.getX() == clx[2] && Gamestart.redsoldier2.getY() == cly[6]) {
					         Gamestart.redsoldier2.setLocation(clx[2],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 3) {
			         if(x > clx[4] && x < clx[5] && y > cly[5] && y < cly[6]) {
			        	 if(Gamestart.redsoldier3.getX() == clx[4] && Gamestart.redsoldier3.getY() == cly[6]) {
					         Gamestart.redsoldier3.setLocation(clx[4],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 4) {
			         if(x > clx[6] && x < clx[7] && y > cly[5] && y < cly[6]) {
			        	 if(Gamestart.redsoldier4.getX() == clx[6] && Gamestart.redsoldier4.getY() == cly[6]) {
					         Gamestart.redsoldier4.setLocation(clx[6],cly[5]);
					         Gamestart.rdClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.rd == 5) {
			         if(x > clx[8] && x < clx[9] && y > cly[5] && y < cly[6]) {
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
         }*/
         //����
         if(Gamestart.rgClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rg == 1) {	//�ж�����
		        	//����λ��------------------------------------------------------------------------
		        	if(x > clx[1] && x < clx[2] && y > cly[9] && y < 607) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[9]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		        	if(x > clx[1] && x < clx[2] && y > cly[8] && y < cly[9]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[8]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[1] && x < clx[2] && y > cly[6] && y < cly[7]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[6]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[1] && x < clx[2] && y > cly[5] && y < cly[6]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[5]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[1] && x < clx[2] && y > cly[4] && y < cly[5]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[4]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[1] && x < clx[2] && y > cly[3] && y < cly[4]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[3]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[1] && x < clx[2] && y > cly[2] && y < cly[3]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[2]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[1] && x < clx[2] && y > cly[1] && y < cly[2]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[1]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[1] && x < clx[2] && y > cly[0] && y < cly[1]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[1],cly[0]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         //����λ��------------------------------------------------------------------------------
			         if(x > clx[0] && x < clx[1] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[0],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[2] && x < clx[3] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[2],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[3] && x < clx[4] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[3],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[4] && x < clx[5] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[4],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[5] && x < clx[6] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[5],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[6] && x < clx[7] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[6],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[7],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[8] && x < clx[8]+53 && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Lredgun.getX() == clx[1] && Gamestart.Lredgun.getY() == cly[7]) {
					         Gamestart.Lredgun.setLocation(clx[8],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		         }
		        //-------------------------�ڶ�����
		         if(Gamestart.rg == 2) {
		        	 if(x > clx[7] && x < clx[8] && y > cly[9] && y < 607) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[9]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
		        	if(x > clx[7] && x < clx[8] && y > cly[8] && y < cly[9]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[8]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[6] && y < cly[7]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[6]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[5] && y < cly[6]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[5]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[4] && y < cly[5]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[4]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[3] && y < cly[4]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[3]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[2] && y < cly[3]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[2]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[1] && y < cly[2]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[1]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[0] && y < cly[1]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[7],cly[0]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         //����λ��------------------------------------------------------------------------------
			         if(x > clx[0] && x < clx[1] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[0],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[2] && x < clx[3] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[2],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[3] && x < clx[4] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[3],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[4] && x < clx[5] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[4],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[5] && x < clx[6] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[5],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[6] && x < clx[7] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[6],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[7] && x < clx[8] && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[1],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
					         Gamestart.rmove = false;
							 Gamestart.bmove = true;
			        	 }
			         }
			         if(x > clx[8] && x < clx[8]+53 && y > cly[7] && y < cly[8]) {//���÷�Χ
			        	 if(Gamestart.Rredgun.getX() == clx[7] && Gamestart.Rredgun.getY() == cly[7]) {
					         Gamestart.Rredgun.setLocation(clx[8],cly[7]);		//����λ��
					         Gamestart.rgClicked = false;
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
			         if(x > clx[0] && x < clx[1] && y > cly[4] && y < cly[5]) {		//���÷�Χ
			        	 if(Gamestart.blacksoldier1.getX() == clx[0] && Gamestart.blacksoldier1.getY() == cly[3]) {
					         Gamestart.blacksoldier1.setLocation(clx[0],cly[4]);		//����λ��
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 2) {
			         if(x > clx[2] && x < clx[3] && y > cly[4] && y < cly[5]) {
			        	 if(Gamestart.blacksoldier2.getX() == clx[2] && Gamestart.blacksoldier2.getY() == cly[3]) {
					         Gamestart.blacksoldier2.setLocation(clx[2],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 3) {
			         if(x > clx[4] && x < clx[5] && y > cly[4] && y < cly[5]) {
			        	 if(Gamestart.blacksoldier3.getX() == clx[4] && Gamestart.blacksoldier3.getY() == cly[3]) {
					         Gamestart.blacksoldier3.setLocation(clx[4],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 4) {
			         if(x > clx[6] && x < clx[7] && y > cly[4] && y < cly[5]) {
			        	 if(Gamestart.blacksoldier4.getX() == clx[6] && Gamestart.blacksoldier4.getY() == cly[3]) {
					         Gamestart.blacksoldier4.setLocation(clx[6],cly[4]);
					         Gamestart.bdClicked = false;
							 Gamestart.bmove = false;
							 Gamestart.rmove = true;
			        	 }
			         }
		         }
		         if(Gamestart.bd == 5) {
			         if(x > clx[8] && x < clx[8]+53 && y > cly[4] && y < cly[5]) {
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
