package kernel;

import javax.swing.JFrame;

import graphics.Zeichnung;

public class Graph_Main {
	
//	Fehler bei kleiner Steigung
//	Rechnung mit regex
//	
	
	public static void main(String[] args) {
		
		QuadCore cpu = new QuadCore();
		cpu.funktion();
		
		 JFrame jf = new JFrame("Graph");
	        Zeichnung l = new Zeichnung();
	       
	        jf.setSize(515, 540);
	        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        jf.setLayout(null);
	        jf.setLocationRelativeTo(null);
	        jf.setContentPane(l);
	        jf.setBounds(0, 0, 505, 530);
	       
	        jf.setVisible(true);
		
//		wertetabelle[0][0] = -5;
//		wertetabelle[1][0] = -4;
//		wertetabelle[2][0] = -3;
//		wertetabelle[3][0] = -2;
//		wertetabelle[4][0] = -1;
//		wertetabelle[5][0] = 0;
//		wertetabelle[6][0] = 1;
//		wertetabelle[7][0] = 2;
//		wertetabelle[8][0] = 3;
//		wertetabelle[9][0] = 4;
//		wertetabelle[10][0] = 5;

//		1,8x+7x-3
		

	}
	
	

}
