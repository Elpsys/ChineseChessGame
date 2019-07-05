package gamestart;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrameMouse implements MouseListener {
	static int [] clx = {68,126,184,242,300,358,416,474,532};
	static int [] cly = {87,139,191,243,295,347,399,451,503,555};
	

	
	public void mouseClicked(MouseEvent e) {
		 int x,y;
		 int i,j,k;
		 Point dp = e.getPoint();//得到点击的位置
         x=dp.x;
         y=dp.y-35;
         //------------红色棋子--------------
         //红兵-----------
         if(Gamestart.rdClicked) {
			 if(Gamestart.rmove) {
				 if(Gamestart.rd == 1) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.redsoldier1.getX() == clx[i] && Gamestart.redsoldier1.getY() == cly[j]) {
			        			 if(cly[j] > 295) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
				        				 Gamestart.redsoldier1.setLocation(clx[i],cly[j-1]);		//设置位置
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.redsoldier1.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
					        				 Gamestart.redsoldier1.setLocation(clx[i],cly[j-1]);		//设置位置
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.redsoldier1.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.redsoldier1.setLocation(clx[i-1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.redsoldier1.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.redsoldier1.setLocation(clx[i+1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        		 
			        	 }
			         }
				 }
				 if(Gamestart.rd == 2) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.redsoldier2.getX() == clx[i] && Gamestart.redsoldier2.getY() == cly[j]) {
			        			 if(cly[j] > 295) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
				        				 Gamestart.redsoldier2.setLocation(clx[i],cly[j-1]);		//设置位置
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.redsoldier2.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
					        				 Gamestart.redsoldier2.setLocation(clx[i],cly[j-1]);		//设置位置
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.redsoldier2.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.redsoldier2.setLocation(clx[i+1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.redsoldier2.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.redsoldier2.setLocation(clx[i-1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        	}
			         }
				 }
				 if(Gamestart.rd == 3) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.redsoldier3.getX() == clx[i] && Gamestart.redsoldier3.getY() == cly[j]) {
			        			 if(cly[j] > 295) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
				        				 Gamestart.redsoldier3.setLocation(clx[i],cly[j-1]);		//设置位置
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.redsoldier3.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
					        				 Gamestart.redsoldier3.setLocation(clx[i],cly[j-1]);		//设置位置
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.redsoldier3.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.redsoldier3.setLocation(clx[i+1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.redsoldier3.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.redsoldier3.setLocation(clx[i-1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        	}
			         }
				 }
				 if(Gamestart.rd == 4) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.redsoldier4.getX() == clx[i] && Gamestart.redsoldier4.getY() == cly[j]) {
			        			 if(cly[j] > 295) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
				        				 Gamestart.redsoldier4.setLocation(clx[i],cly[j-1]);		//设置位置
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.redsoldier4.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
					        				 Gamestart.redsoldier4.setLocation(clx[i],cly[j-1]);		//设置位置
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.redsoldier4.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.redsoldier4.setLocation(clx[i+1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.redsoldier4.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.redsoldier4.setLocation(clx[i-1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        	}
			         }
				 }
				 if(Gamestart.rd == 5) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.redsoldier5.getX() == clx[i] && Gamestart.redsoldier5.getY() == cly[j]) {
			        			 if(cly[j] > 295) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i]+52 && y > cly[j-1] && y < cly[j]) {
				        				 Gamestart.redsoldier5.setLocation(clx[i],cly[j-1]);		//设置位置
								         Gamestart.rdClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.redsoldier5.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
					        				 Gamestart.redsoldier5.setLocation(clx[i],cly[j-1]);		//设置位置
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.redsoldier5.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.redsoldier5.setLocation(clx[i+1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.redsoldier5.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.redsoldier5.setLocation(clx[i-1],cly[j]);		
									         Gamestart.rdClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        	}
			         }
				 }
			 }else {
				 ErrorTip.tip();
			 }
         }
         //红炮
         if(Gamestart.rgClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rg == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lredgun.getX() == clx[i] && Gamestart.Lredgun.getY() == cly[j]) {
			        			 if(x > clx[i] && x < clx[i] + 58) {
			        				 for(k = 0;k <= 9;k ++) {
			        					 if(y > cly[k] && y < cly[k] + 52) {
			        						 Gamestart.Lredgun.setLocation(clx[i],cly[k]);		
									         Gamestart.rgClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        				 }
			        			 }
			        			 if(y > cly[j] && y < cly[j] + 52) {
			        				 for(k = 0;k <= 8;k ++) {
			        					 if(x > clx[k] && x < clx[k] + 58) {
			        						 Gamestart.Lredgun.setLocation(clx[k],cly[j]);		
									         Gamestart.rgClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        				 }
			        			 }
			        		 }
			        	 }
		        	}
		         }
		        //-------------------------第二个炮
		         if(Gamestart.rg == 2) {
		        	 for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rredgun.getX() == clx[i] && Gamestart.Rredgun.getY() == cly[j]) {
			        			 if(x > clx[i] && x < clx[i] + 58) {
			        				 for(k = 0;k <= 9;k ++) {
			        					 if(y > cly[k] && y < cly[k] + 52) {
			        						 Gamestart.Rredgun.setLocation(clx[i],cly[k]);		
									         Gamestart.rgClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        				 }
			        			 }
			        			 if(y > cly[j] && y < cly[j] + 52) {
			        				 for(k = 0;k <= 8;k ++) {
			        					 if(x > clx[k] && x < clx[k] + 58) {
			        						 Gamestart.Rredgun.setLocation(clx[k],cly[j]);		
									         Gamestart.rgClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        				 }
			        			 }
			        		 }
			        	 }
		        	}
		         }
			 }else {
				 ErrorTip.tip();
			 }
			  
         }
         //红车
         if(Gamestart.rcClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rc == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lredcar.getX() == clx[i] && Gamestart.Lredcar.getY() == cly[j]) {
			        			 if(x > clx[i] && x < clx[i] + 58) {
			        				 for(k = 0;k <= 9;k ++) {
			        					 if(y > cly[k] && y < cly[k] + 52) {
			        						 Gamestart.Lredcar.setLocation(clx[i],cly[k]);		
									         Gamestart.rcClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        				 }
			        			 }
			        			 if(y > cly[j] && y < cly[j] + 52) {
			        				 for(k = 0;k <= 8;k ++) {
			        					 if(x > clx[k] && x < clx[k] + 58) {
			        						 Gamestart.Lredcar.setLocation(clx[k],cly[j]);		
									         Gamestart.rcClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        				 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
		        if(Gamestart.rc == 2) {
		        	 for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rredcar.getX() == clx[i] && Gamestart.Rredcar.getY() == cly[j]) {
			        			 if(x > clx[i] && x < clx[i] + 58) {
			        				 for(k = 0;k <= 9;k ++) {
			        					 if(y > cly[k] && y < cly[k] + 52) {
			        						 Gamestart.Rredcar.setLocation(clx[i],cly[k]);		
									         Gamestart.rcClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        				 }
			        			 }
			        			 if(y > cly[j] && y < cly[j] + 52) {
			        				 for(k = 0;k <= 8;k ++) {
			        					 if(x > clx[k] && x < clx[k] + 58) {
			        						 Gamestart.Rredcar.setLocation(clx[k],cly[j]);		
									         Gamestart.rcClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        				 }
			        			 }
			        		 }
			        	 }
		        	 }
		        }
			 }else {
				 ErrorTip.tip();
			 }
		 }
         //红马
         if(Gamestart.rhClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rh == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lredhorse.getX() == clx[i] && Gamestart.Lredhorse.getY() == cly[j]) {
			        			 //左右跳一个格子
			        			 if(x > clx[i] + 58 && x < clx[i] + 116) {
			        				 //向右上方跳
		        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
		        						 Gamestart.Lredhorse.setLocation(clx[i] + 58,cly[j] - 104);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
		        					 //右下方跳
		        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
		        						 Gamestart.Lredhorse.setLocation(clx[i] + 58,cly[j] + 104);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
			        			 }
			        			 if(x > clx[i] - 58 && x < clx[i]) {
			        				 //向左上方跳
		        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
		        						 Gamestart.Lredhorse.setLocation(clx[i] - 58,cly[j] - 104);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
		        					 //左下方跳
		        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
		        						 Gamestart.Lredhorse.setLocation(clx[i] - 58,cly[j] + 104);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
			        			 }
			        			//左右跳两个格子
			        			 if(x > clx[i] + 116 && x < clx[i] + 174) {
			        				 //向右上方跳
		        					 if(y > cly[j] - 52 && y < cly[j]) {
		        						 Gamestart.Lredhorse.setLocation(clx[i] + 116,cly[j] - 52);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
		        					 //右下方跳
		        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
		        						 Gamestart.Lredhorse.setLocation(clx[i] + 116,cly[j] + 52);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
			        			 }
			        			 if(x > clx[i] - 116 && x < clx[i]-58) {
			        				 //向左上方跳
		        					 if(y > cly[j] - 52 && y < cly[j]) {
		        						 Gamestart.Lredhorse.setLocation(clx[i] - 116,cly[j] - 52);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
		        					 //左下方跳
		        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
		        						 Gamestart.Lredhorse.setLocation(clx[i] - 116,cly[j] + 52);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
		        if(Gamestart.rh == 2) {
		        	 for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rredhorse.getX() == clx[i] && Gamestart.Rredhorse.getY() == cly[j]) {
			        			 //左右跳一个格子
			        			 if(x > clx[i] + 58 && x < clx[i] + 116) {
			        				 //向右上方跳
		        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
		        						 Gamestart.Rredhorse.setLocation(clx[i] + 58,cly[j] - 104);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
		        					 //右下方跳
		        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
		        						 Gamestart.Rredhorse.setLocation(clx[i] + 58,cly[j] + 104);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
			        			 }
			        			 if(x > clx[i] - 58 && x < clx[i]) {
			        				 //向左上方跳
		        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
		        						 Gamestart.Rredhorse.setLocation(clx[i] - 58,cly[j] - 104);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
		        					 //左下方跳
		        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
		        						 Gamestart.Rredhorse.setLocation(clx[i] - 58,cly[j] + 104);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
			        			 }
			        			//左右跳两个格子
			        			 if(x > clx[i] + 116 && x < clx[i] + 174) {
			        				 //向右上方跳
		        					 if(y > cly[j] - 52 && y < cly[j]) {
		        						 Gamestart.Rredhorse.setLocation(clx[i] + 116,cly[j] - 52);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
		        					 //右下方跳
		        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
		        						 Gamestart.Rredhorse.setLocation(clx[i] + 116,cly[j] + 52);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
			        			 }
			        			 if(x > clx[i] - 116 && x < clx[i]-58) {
			        				 //向左上方跳
		        					 if(y > cly[j] - 52 && y < cly[j]) {
		        						 Gamestart.Rredhorse.setLocation(clx[i] - 116,cly[j] - 52);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
		        					 //左下方跳
		        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
		        						 Gamestart.Rredhorse.setLocation(clx[i] - 116,cly[j] + 52);		
								         Gamestart.rhClicked = false;
								         Gamestart.rmove = false;
										 Gamestart.bmove = true;	 
		        					 }
			        			 }
			        		 }
			        	 }
		        	 }
		        }
			 }else {
				 ErrorTip.tip();
			 }
		 }
         //红象
         if(Gamestart.reClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.re == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lredelephant.getX() == clx[i] && Gamestart.Lredelephant.getY() == cly[j]) {
			        			 if(y > 295) {
			        				 if(x > clx[i] + 116 && x < clx[i] + 174) {
				        				 //向右上方跳
			        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
			        						 Gamestart.Lredelephant.setLocation(clx[i] + 116,cly[j] - 104);		
									         Gamestart.reClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        					 //右下方跳
			        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
			        						 Gamestart.Lredelephant.setLocation(clx[i] + 116,cly[j] + 104);		
									         Gamestart.reClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
				        			 }
				        			 if(x > clx[i] - 116 && x < clx[i]-58) {
				        				 //向左上方跳
			        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
			        						 Gamestart.Lredelephant.setLocation(clx[i] - 116,cly[j] - 104);		
									         Gamestart.reClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        					 //左下方跳
			        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
			        						 Gamestart.Lredelephant.setLocation(clx[i] - 116,cly[j] + 104);		
									         Gamestart.reClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
				        			 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
		        if(Gamestart.re == 2) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rredelephant.getX() == clx[i] && Gamestart.Rredelephant.getY() == cly[j]) {
			        			 if(y > 295) {
			        				 if(x > clx[i] + 116 && x < clx[i] + 174) {
				        				 //向右上方跳
			        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
			        						 Gamestart.Rredelephant.setLocation(clx[i] + 116,cly[j] - 104);		
									         Gamestart.reClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        					 //右下方跳
			        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
			        						 Gamestart.Rredelephant.setLocation(clx[i] + 116,cly[j] + 104);		
									         Gamestart.reClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
				        			 }
				        			 if(x > clx[i] - 116 && x < clx[i]-58) {
				        				 //向左上方跳
			        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
			        						 Gamestart.Rredelephant.setLocation(clx[i] - 116,cly[j] - 104);		
									         Gamestart.reClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        					 //左下方跳
			        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
			        						 Gamestart.Rredelephant.setLocation(clx[i] - 116,cly[j] + 104);		
									         Gamestart.reClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
				        			 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
			 }
         }
         //红士
         if(Gamestart.rkClicked) {
			 if(Gamestart.rmove) {
		        if(Gamestart.rk == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lredknight.getX() == clx[i] && Gamestart.Lredknight.getY() == cly[j]) {
			        			 if(x > clx[3] && x < clx[6] && y < cly[9] + 52 && y > cly[7]) {
			        				 if(x > clx[i] + 58 && x < clx[i] + 116) {
				        				 //向右上方跳
			        					 if(y > cly[j] - 52 && y < cly[j]) {
			        						 Gamestart.Lredknight.setLocation(clx[i] + 58,cly[j] - 52);		
									         Gamestart.rkClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        					 //右下方跳
			        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
			        						 Gamestart.Lredknight.setLocation(clx[i] + 58,cly[j] + 52);		
									         Gamestart.rkClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
				        			 }
				        			 if(x > clx[i] - 58 && x < clx[i]) {
				        				 //向左上方跳
			        					 if(y > cly[j] - 52 && y < cly[j]) {
			        						 Gamestart.Lredknight.setLocation(clx[i] - 58,cly[j] - 52);		
									         Gamestart.rkClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        					 //左下方跳
			        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
			        						 Gamestart.Lredknight.setLocation(clx[i] - 58,cly[j] + 52);		
									         Gamestart.rkClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
				        			 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
		        if(Gamestart.rk == 2) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rredknight.getX() == clx[i] && Gamestart.Rredknight.getY() == cly[j]) {
			        			 if(x > clx[3] && x < clx[6] && y < cly[9] + 52 && y > cly[7]) {
			        				 if(x > clx[i] + 58 && x < clx[i] + 116) {
				        				 //向右上方跳
			        					 if(y > cly[j] - 52 && y < cly[j]) {
			        						 Gamestart.Rredknight.setLocation(clx[i] + 58,cly[j] - 52);		
									         Gamestart.rkClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        					 //右下方跳
			        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
			        						 Gamestart.Rredknight.setLocation(clx[i] + 58,cly[j] + 52);		
									         Gamestart.rkClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
				        			 }
				        			 if(x > clx[i] - 58 && x < clx[i]) {
				        				 //向左上方跳
			        					 if(y > cly[j] - 52 && y < cly[j]) {
			        						 Gamestart.Rredknight.setLocation(clx[i] - 58,cly[j] - 52);		
									         Gamestart.rkClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
			        					 //左下方跳
			        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
			        						 Gamestart.Rredknight.setLocation(clx[i] - 58,cly[j] + 52);		
									         Gamestart.rkClicked = false;
									         Gamestart.rmove = false;
											 Gamestart.bmove = true;	 
			        					 }
				        			 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
			 }
         }
         //红帅
         if(Gamestart.rmClicked) {
			 if(Gamestart.rmove) {
	        	for(i = 0;i <= 8;i ++) {
		        	 for(j = 0;j <=9;j ++) {
		        		 if(Gamestart.redcommander.getX() == clx[i] && Gamestart.redcommander.getY() == cly[j]) {
		        			 if(x > clx[3] && x < clx[6] && y < cly[9] + 52 && y > cly[7]) {
		        				//向前走
		        				 if(x > clx[i] && x < clx[i+1] && y > cly[j-1] && y < cly[j]) {
			        				 Gamestart.redcommander.setLocation(clx[i],cly[j-1]);		//设置位置
							         Gamestart.rmClicked = false;
							         Gamestart.rmove = false;
									 Gamestart.bmove = true;
		        				 }
		        				 //向左走
		        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j] + 52) {
		        					 Gamestart.redcommander.setLocation(clx[i-1],cly[j]);		
							         Gamestart.rmClicked = false;
							         Gamestart.rmove = false;
									 Gamestart.bmove = true;
		        				 }
		        				 //向右走
		        				 if(x > clx[i+1] && x < clx[i+2] && y > cly[j] && y < cly[j] + 52) {
			        				 Gamestart.redcommander.setLocation(clx[i+1],cly[j]);		
							         Gamestart.rmClicked = false;
							         Gamestart.rmove = false;
									 Gamestart.bmove = true;
		        				 }
		        				 //向后走
		        				 if(x > clx[i] && x < clx[i+1] && y > cly[j] + 52 && y < cly[j] + 104) {
			        				 Gamestart.redcommander.setLocation(clx[i],cly[j+1]);		
							         Gamestart.rmClicked = false;
							         Gamestart.rmove = false;
									 Gamestart.bmove = true;
		        				 }
		        			 }
		        		 }
		        	 }
	        	}
			 }
         }
		 //--------------------------黑色棋子----------------------------------
         //黑兵--------------
         if(Gamestart.bdClicked) {
			 if(Gamestart.bmove) {
				 if(Gamestart.bd == 1) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.blacksoldier1.getX() == clx[i] && Gamestart.blacksoldier1.getY() == cly[j]) {
			        			 if(cly[j] < 347) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j+1] && y < cly[j+2]) {
				        				 Gamestart.blacksoldier1.setLocation(clx[i],cly[j+1]);		//设置位置
								         Gamestart.bdClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.blacksoldier1.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j+1] && y < cly[j+2]) {
					        				 Gamestart.blacksoldier1.setLocation(clx[i],cly[j+1]);		//设置位置
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.blacksoldier1.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.blacksoldier1.setLocation(clx[i-1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.blacksoldier1.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.blacksoldier1.setLocation(clx[i+1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        		 
			        	 }
			         }
				 }
				 if(Gamestart.bd == 2) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.blacksoldier2.getX() == clx[i] && Gamestart.blacksoldier2.getY() == cly[j]) {
			        			 if(cly[j] < 347) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j+1] && y < cly[j+2]) {
				        				 Gamestart.blacksoldier2.setLocation(clx[i],cly[j+1]);		//设置位置
								         Gamestart.bdClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.blacksoldier2.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j+1] && y < cly[j+2]) {
					        				 Gamestart.blacksoldier1.setLocation(clx[i],cly[j+1]);		//设置位置
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.blacksoldier2.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.blacksoldier2.setLocation(clx[i+1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.blacksoldier2.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.blacksoldier2.setLocation(clx[i-1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        		 
			        	 }
			         }
				 }
				 if(Gamestart.bd == 3) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.blacksoldier3.getX() == clx[i] && Gamestart.blacksoldier3.getY() == cly[j]) {
			        			 if(cly[j] < 347) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j+1] && y < cly[j+2]) {
				        				 Gamestart.blacksoldier3.setLocation(clx[i],cly[j+1]);		//设置位置
								         Gamestart.bdClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.blacksoldier3.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j+1] && y < cly[j+2]) {
					        				 Gamestart.blacksoldier3.setLocation(clx[i],cly[j+1]);		//设置位置
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.blacksoldier3.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.blacksoldier3.setLocation(clx[i+1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.blacksoldier3.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.blacksoldier3.setLocation(clx[i-1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        		 
			        	 }
			         }
				 }
				 if(Gamestart.bd == 4) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.blacksoldier4.getX() == clx[i] && Gamestart.blacksoldier4.getY() == cly[j]) {
			        			 if(cly[j] < 347) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i+1] && y > cly[j+1] && y < cly[j+2]) {
				        				 Gamestart.blacksoldier4.setLocation(clx[i],cly[j+1]);		//设置位置
								         Gamestart.bdClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.blacksoldier4.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i+1] && y > cly[j+1] && y < cly[j+2]) {
					        				 Gamestart.blacksoldier4.setLocation(clx[i],cly[j+1]);		//设置位置
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.blacksoldier4.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.blacksoldier4.setLocation(clx[i+1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.blacksoldier4.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.blacksoldier4.setLocation(clx[i-1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        		 
			        	 }
			         }
				 }
				 if(Gamestart.bd == 5) {
			         for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.blacksoldier5.getX() == clx[i] && Gamestart.blacksoldier5.getY() == cly[j]) {
			        			 if(cly[j] < 347) {
			        				 //过河之前只能向前走
			        				 if(x > clx[i] && x < clx[i]+52 && y > cly[j+1] && y < cly[j+2]) {
				        				 Gamestart.blacksoldier5.setLocation(clx[i],cly[j+1]);		//设置位置
								         Gamestart.bdClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;
			        				 }
			        			 }else {
			        				 //判断向前走的位置
			        				 if(Gamestart.blacksoldier5.getY() != cly[0]) {
				        				 if(x > clx[i] && x < clx[i]+52 && y > cly[j+1] && y < cly[j+2]) {
					        				 Gamestart.blacksoldier5.setLocation(clx[i],cly[j+1]);		//设置位置
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				 //判断右走的位置
			        				 if(Gamestart.blacksoldier5.getX() != clx[8]) {
				        				 if(x > clx[i+1] && x < clx[i+1]+58 && y > cly[j] && y < cly[j+1]) {
					        				 Gamestart.blacksoldier5.setLocation(clx[i+1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        				//判断左走的位置
			        				 if(Gamestart.blacksoldier5.getX() != clx[0]) {
				        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j+1]) {
				        					 Gamestart.blacksoldier5.setLocation(clx[i-1],cly[j]);		
									         Gamestart.bdClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;
				        				 }
			        				 }
			        			 }
			        		 }
			        		 
			        	 }
			         }
				 }
			 }else {
				 ErrorTip.tip();
			 }
         }
         //黑炮
         if(Gamestart.bgClicked) {
			 if(Gamestart.bmove) {
		        if(Gamestart.bg == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lblackgun.getX() == clx[i] && Gamestart.Lblackgun.getY() == cly[j]) {
			        			 if(x > clx[i] && x < clx[i+1]) {
			        				 for(k = 0;k <= 9;k ++) {
			        					 if(y > cly[k] && y < cly[k] + 52) {
			        						 Gamestart.Lblackgun.setLocation(clx[i],cly[k]);		
									         Gamestart.bgClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        				 }
			        			 }
			        			 if(y > cly[j] && y < cly[j+1]) {
			        				 for(k = 0;k <= 8;k ++) {
			        					 if(x > clx[k] && x < clx[k] + 58) {
			        						 Gamestart.Lblackgun.setLocation(clx[k],cly[j]);		
									         Gamestart.bgClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        				 }
			        			 }
			        		 }
			        	 }
		        	}
		         }
		        //-------------------------第二个炮
		         if(Gamestart.bg == 2) {
		        	 for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rblackgun.getX() == clx[i] && Gamestart.Rblackgun.getY() == cly[j]) {
			        			 if(x > clx[i] && x < clx[i+1]) {
			        				 for(k = 0;k <= 9;k ++) {
			        					 if(y > cly[k] && y < cly[k] + 52) {
			        						 Gamestart.Rblackgun.setLocation(clx[i],cly[k]);		
									         Gamestart.bgClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        				 }
			        			 }
			        			 if(y > cly[j] && y < cly[j+1]) {
			        				 for(k = 0;k <= 8;k ++) {
			        					 if(x > clx[k] && x < clx[k] + 58) {
			        						 Gamestart.Rblackgun.setLocation(clx[k],cly[j]);		
									         Gamestart.bgClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        				 }
			        			 }
			        		 }
			        	 }
		        	}
		         }
			 }else {
				 ErrorTip.tip();
			 }
         }
         //黑车
         if(Gamestart.bcClicked) {
			 if(Gamestart.bmove) {
		        if(Gamestart.bc == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lblackcar.getX() == clx[i] && Gamestart.Lblackcar.getY() == cly[j]) {
			        			 if(x > clx[i] && x < clx[i] + 58) {
			        				 for(k = 0;k <= 9;k ++) {
			        					 if(y > cly[k] && y < cly[k] + 52) {
			        						 Gamestart.Lblackcar.setLocation(clx[i],cly[k]);		
									         Gamestart.bcClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        				 }
			        			 }
			        			 if(y > cly[j] && y < cly[j+1]) {
			        				 for(k = 0;k <= 8;k ++) {
			        					 if(x > clx[k] && x < clx[k] + 58) {
			        						 Gamestart.Lblackcar.setLocation(clx[k],cly[j]);		
									         Gamestart.bcClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        				 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
		        if(Gamestart.bc == 2) {
		        	 for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rblackcar.getX() == clx[i] && Gamestart.Rblackcar.getY() == cly[j]) {
			        			 if(x > clx[i] && x < clx[i] + 58) {
			        				 for(k = 0;k <= 9;k ++) {
			        					 if(y > cly[k] && y < cly[k] + 52) {
			        						 Gamestart.Rblackcar.setLocation(clx[i],cly[k]);		
									         Gamestart.rcClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        				 }
			        			 }
			        			 if(y > cly[j] && y < cly[j+1]) {
			        				 for(k = 0;k <= 8;k ++) {
			        					 if(x > clx[k] && x < clx[k] + 58) {
			        						 Gamestart.Rblackcar.setLocation(clx[k],cly[j]);		
									         Gamestart.rcClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        				 }
			        			 }
			        		 }
			        	 }
		        	 }
		        }
			 }else {
				 ErrorTip.tip();
			 }
		 }
         //黑马
         if(Gamestart.bhClicked) {
			 if(Gamestart.bmove) {
		        if(Gamestart.bh == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lblackhorse.getX() == clx[i] && Gamestart.Lblackhorse.getY() == cly[j]) {
			        			 //左右跳一个格子
			        			 if(x > clx[i] + 58 && x < clx[i] + 116) {
			        				 //向右上方跳
		        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
		        						 Gamestart.Lblackhorse.setLocation(clx[i] + 58,cly[j] - 104);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
		        					 //右下方跳
		        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
		        						 Gamestart.Lblackhorse.setLocation(clx[i] + 58,cly[j] + 104);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
			        			 }
			        			 if(x > clx[i] - 58 && x < clx[i]) {
			        				 //向左上方跳
		        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
		        						 Gamestart.Lblackhorse.setLocation(clx[i] - 58,cly[j] - 104);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
		        					 //左下方跳
		        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
		        						 Gamestart.Lblackhorse.setLocation(clx[i] - 58,cly[j] + 104);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
			        			 }
			        			//左右跳两个格子
			        			 if(x > clx[i] + 116 && x < clx[i] + 174) {
			        				 //向右上方跳
		        					 if(y > cly[j] - 52 && y < cly[j]) {
		        						 Gamestart.Lblackhorse.setLocation(clx[i] + 116,cly[j] - 52);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
		        					 //右下方跳
		        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
		        						 Gamestart.Lblackhorse.setLocation(clx[i] + 116,cly[j] + 52);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
			        			 }
			        			 if(x > clx[i] - 116 && x < clx[i]-58) {
			        				 //向左上方跳
		        					 if(y > cly[j] - 52 && y < cly[j]) {
		        						 Gamestart.Lblackhorse.setLocation(clx[i] - 116,cly[j] - 52);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
		        					 //左下方跳
		        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
		        						 Gamestart.Lblackhorse.setLocation(clx[i] - 116,cly[j] + 52);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
		        if(Gamestart.bh == 2) {
		        	 for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rblackhorse.getX() == clx[i] && Gamestart.Rblackhorse.getY() == cly[j]) {
			        			 //左右跳一个格子
			        			 if(x > clx[i] + 58 && x < clx[i] + 116) {
			        				 //向右上方跳
		        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
		        						 Gamestart.Rblackhorse.setLocation(clx[i] + 58,cly[j] - 104);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
		        					 //右下方跳
		        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
		        						 Gamestart.Rblackhorse.setLocation(clx[i] + 58,cly[j] + 104);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
			        			 }
			        			 if(x > clx[i] - 58 && x < clx[i]) {
			        				 //向左上方跳
		        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
		        						 Gamestart.Rblackhorse.setLocation(clx[i] - 58,cly[j] - 104);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
		        					 //左下方跳
		        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
		        						 Gamestart.Rblackhorse.setLocation(clx[i] - 58,cly[j] + 104);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
			        			 }
			        			//左右跳两个格子
			        			 if(x > clx[i] + 116 && x < clx[i] + 174) {
			        				 //向右上方跳
		        					 if(y > cly[j] - 52 && y < cly[j]) {
		        						 Gamestart.Rblackhorse.setLocation(clx[i] + 116,cly[j] - 52);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
		        					 //右下方跳
		        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
		        						 Gamestart.Rblackhorse.setLocation(clx[i] + 116,cly[j] + 52);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
			        			 }
			        			 if(x > clx[i] - 116 && x < clx[i]-58) {
			        				 //向左上方跳
		        					 if(y > cly[j] - 52 && y < cly[j]) {
		        						 Gamestart.Rblackhorse.setLocation(clx[i] - 116,cly[j] - 52);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
		        					 //左下方跳
		        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
		        						 Gamestart.Rblackhorse.setLocation(clx[i] - 116,cly[j] + 52);		
								         Gamestart.bhClicked = false;
								         Gamestart.bmove = false;
										 Gamestart.rmove = true;	 
		        					 }
			        			 }
			        		 }
			        	 }
		        	 }
		        }
			 }else {
				 ErrorTip.tip();
			 }
		 }
         //黑象
         if(Gamestart.beClicked) {
			 if(Gamestart.bmove) {
		        if(Gamestart.be == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lblackelephant.getX() == clx[i] && Gamestart.Lblackelephant.getY() == cly[j]) {
			        			 if(y < 347) {
			        				 if(x > clx[i] + 116 && x < clx[i] + 174) {
				        				 //向右上方跳
			        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
			        						 Gamestart.Lblackelephant.setLocation(clx[i] + 116,cly[j] - 104);		
									         Gamestart.beClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        					 //右下方跳
			        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
			        						 Gamestart.Lblackelephant.setLocation(clx[i] + 116,cly[j] + 104);		
									         Gamestart.beClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
				        			 }
				        			 if(x > clx[i] - 116 && x < clx[i]-58) {
				        				 //向左上方跳
			        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
			        						 Gamestart.Lblackelephant.setLocation(clx[i] - 116,cly[j] - 104);		
									         Gamestart.beClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        					 //左下方跳
			        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
			        						 Gamestart.Lblackelephant.setLocation(clx[i] - 116,cly[j] + 104);		
									         Gamestart.beClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
				        			 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
		        if(Gamestart.be == 2) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rblackelephant.getX() == clx[i] && Gamestart.Rblackelephant.getY() == cly[j]) {
			        			 if(y < 347) {
			        				 if(x > clx[i] + 116 && x < clx[i] + 174) {
				        				 //向右上方跳
			        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
			        						 Gamestart.Rblackelephant.setLocation(clx[i] + 116,cly[j] - 104);		
									         Gamestart.beClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        					 //右下方跳
			        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
			        						 Gamestart.Rblackelephant.setLocation(clx[i] + 116,cly[j] + 104);		
									         Gamestart.beClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
				        			 }
				        			 if(x > clx[i] - 116 && x < clx[i]-58) {
				        				 //向左上方跳
			        					 if(y > cly[j] - 104 && y < cly[j] - 52) {
			        						 Gamestart.Rblackelephant.setLocation(clx[i] - 116,cly[j] - 104);		
									         Gamestart.beClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        					 //左下方跳
			        					 if(y > cly[j] + 104 && y < cly[j] + 156) {
			        						 Gamestart.Rblackelephant.setLocation(clx[i] - 116,cly[j] + 104);		
									         Gamestart.beClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
				        			 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
			 }
         }
         //黑士
         if(Gamestart.bkClicked) {
			 if(Gamestart.bmove) {
		        if(Gamestart.bk == 1) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Lblackknight.getX() == clx[i] && Gamestart.Lblackknight.getY() == cly[j]) {
			        			 if(x > clx[3] && x < clx[6] && y > cly[0] && y < cly[3]) {
			        				 if(x > clx[i] + 58 && x < clx[i] + 116) {
				        				 //向右上方跳
			        					 if(y > cly[j] - 52 && y < cly[j]) {
			        						 Gamestart.Lblackknight.setLocation(clx[i] + 58,cly[j] - 52);		
									         Gamestart.bkClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        					 //右下方跳
			        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
			        						 Gamestart.Lblackknight.setLocation(clx[i] + 58,cly[j] + 52);		
									         Gamestart.bkClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
				        			 }
				        			 if(x > clx[i] - 58 && x < clx[i]) {
				        				 //向左上方跳
			        					 if(y > cly[j] - 52 && y < cly[j]) {
			        						 Gamestart.Lblackknight.setLocation(clx[i] - 58,cly[j] - 52);		
									         Gamestart.bkClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        					 //左下方跳
			        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
			        						 Gamestart.Lblackknight.setLocation(clx[i] - 58,cly[j] + 52);		
									         Gamestart.bkClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
				        			 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
		        if(Gamestart.bk == 2) {	//判断棋子
		        	for(i = 0;i <= 8;i ++) {
			        	 for(j = 0;j <=9;j ++) {
			        		 if(Gamestart.Rblackknight.getX() == clx[i] && Gamestart.Rblackknight.getY() == cly[j]) {
			        			 if(x > clx[3] && x < clx[6] && y > cly[0] && y < cly[3]) {
			        				 if(x > clx[i] + 58 && x < clx[i] + 116) {
				        				 //向右上方跳
			        					 if(y > cly[j] - 52 && y < cly[j]) {
			        						 Gamestart.Rblackknight.setLocation(clx[i] + 58,cly[j] - 52);		
									         Gamestart.bkClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        					 //右下方跳
			        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
			        						 Gamestart.Rblackknight.setLocation(clx[i] + 58,cly[j] + 52);		
									         Gamestart.bkClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
				        			 }
				        			 if(x > clx[i] - 58 && x < clx[i]) {
				        				 //向左上方跳
			        					 if(y > cly[j] - 52 && y < cly[j]) {
			        						 Gamestart.Rblackknight.setLocation(clx[i] - 58,cly[j] - 52);		
									         Gamestart.bkClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
			        					 //左下方跳
			        					 if(y > cly[j] + 52 && y < cly[j] + 104) {
			        						 Gamestart.Rblackknight.setLocation(clx[i] - 58,cly[j] + 52);		
									         Gamestart.bkClicked = false;
									         Gamestart.bmove = false;
											 Gamestart.rmove = true;	 
			        					 }
				        			 }
			        			 }
			        		 }
			        	 }
		        	}
		        }
			 }
         }  
         //黑帅
         if(Gamestart.bmClicked) {
			 if(Gamestart.bmove) {
	        	for(i = 0;i <= 8;i ++) {
		        	 for(j = 0;j <=9;j ++) {
		        		 if(Gamestart.blackcommander.getX() == clx[i] && Gamestart.blackcommander.getY() == cly[j]) {
		        			 if(x > clx[3] && x < clx[6] && y < cly[3] && y > cly[0]) {
		        				//向前走
		        				 if(x > clx[i] && x < clx[i+1] && y > cly[j] - 52 && y < cly[j]) {
			        				 Gamestart.blackcommander.setLocation(clx[i],cly[j-1]);		//设置位置
							         Gamestart.bmClicked = false;
							         Gamestart.bmove = false;
									 Gamestart.rmove = true;
		        				 }
		        				 //向左走
		        				 if(x > clx[i-1] && x < clx[i] && y > cly[j] && y < cly[j] + 52) {
		        					 Gamestart.blackcommander.setLocation(clx[i-1],cly[j]);		
							         Gamestart.bmClicked = false;
							         Gamestart.bmove = false;
									 Gamestart.rmove = true;
		        				 }
		        				 //向右走
		        				 if(x > clx[i+1] && x < clx[i+2] && y > cly[j] && y < cly[j] + 52) {
			        				 Gamestart.blackcommander.setLocation(clx[i+1],cly[j]);		
							         Gamestart.bmClicked = false;
							         Gamestart.bmove = false;
									 Gamestart.rmove = true;
		        				 }
		        				 //向后走
		        				 if(x > clx[i] && x < clx[i+1] && y > cly[j] + 52 && y < cly[j] + 104) {
			        				 Gamestart.blackcommander.setLocation(clx[i],cly[j+1]);		
							         Gamestart.bmClicked = false;
							         Gamestart.bmove = false;
									 Gamestart.rmove = true;
		        				 }
		        			 }
		        		 }
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
