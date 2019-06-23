package gamestart;

public class Location {
	static int [][] clx;
	static int [][] cly;
	public static void location() {
		clx = new int[9][8];
		cly = new int[9][8];
		clx[0][0] = clx[1][0] = clx[2][0] = clx[3][0] = clx[4][0] = clx[5][0] = clx[6][0] = clx[7][0] = clx[8][0] = clx[9][0] = 70;
		clx[0][1] = clx[1][1] = clx[2][1] = clx[3][1] = clx[4][1] = clx[5][1] = clx[6][1] = clx[7][1] = clx[8][1] = clx[9][1] = 127;  	//0-1:57
		clx[0][2] = clx[1][2] = clx[2][2] = clx[3][2] = clx[4][2] = clx[5][2] = clx[6][2] = clx[7][2] = clx[8][2] = clx[9][2] = 185;	//1-2:58
		clx[0][3] = clx[1][3] = clx[2][3] = clx[3][3] = clx[4][3] = clx[5][3] = clx[6][3] = clx[7][3] = clx[8][3] = clx[9][3] = 242;	//2-3:57
		clx[0][4] = clx[1][4] = clx[2][4] = clx[3][4] = clx[4][4] = clx[5][4] = clx[6][4] = clx[7][4] = clx[8][4] = clx[9][4] = 300;
		clx[0][5] = clx[1][5] = clx[2][5] = clx[3][5] = clx[4][5] = clx[5][5] = clx[6][5] = clx[7][5] = clx[8][5] = clx[9][5] = 357;
		clx[0][6] = clx[1][6] = clx[2][6] = clx[3][6] = clx[4][6] = clx[5][6] = clx[6][6] = clx[7][6] = clx[8][6] = clx[9][6] = 414;
		clx[0][7] = clx[1][7] = clx[2][7] = clx[3][7] = clx[4][7] = clx[5][7] = clx[6][7] = clx[7][7] = clx[8][7] = clx[9][7] = 472;
		clx[0][8] = clx[1][8] = clx[2][8] = clx[3][8] = clx[4][8] = clx[5][8] = clx[6][8] = clx[7][8] = clx[8][8] = clx[9][8] = 529;
		
		
		cly[0][0] = cly[0][1] = cly[0][2] = cly[0][3] = cly[0][4] = cly[0][5] = cly[0][6] = cly[0][7] = cly[0][8] = 88;
		cly[1][0] = cly[1][1] = cly[1][2] = cly[1][3] = cly[1][4] = cly[1][5] = cly[1][6] = cly[1][7] = cly[1][8] = 140;
		cly[2][0] = cly[2][1] = cly[2][2] = cly[2][3] = cly[2][4] = cly[2][5] = cly[2][6] = cly[2][7] = cly[2][8] = 192;
		cly[3][0] = cly[3][1] = cly[3][2] = cly[3][3] = cly[3][4] = cly[3][5] = cly[3][6] = cly[3][7] = cly[3][8] = 243;
		cly[4][0] = cly[4][1] = cly[4][2] = cly[4][3] = cly[4][4] = cly[4][5] = cly[4][6] = cly[4][7] = cly[4][8] = 295;
		cly[5][0] = cly[5][1] = cly[5][2] = cly[5][3] = cly[5][4] = cly[5][5] = cly[5][6] = cly[5][7] = cly[5][8] = 347;
		cly[6][0] = cly[6][1] = cly[6][2] = cly[6][3] = cly[6][4] = cly[6][5] = cly[6][6] = cly[6][7] = cly[6][8] = 399;
		cly[7][0] = cly[7][1] = cly[7][2] = cly[7][3] = cly[7][4] = cly[7][5] = cly[7][6] = cly[7][7] = cly[7][8] = 450;
		cly[8][0] = cly[8][1] = cly[8][2] = cly[8][3] = cly[8][4] = cly[8][5] = cly[8][6] = cly[8][7] = cly[8][8] = 502;
		
	}
}
