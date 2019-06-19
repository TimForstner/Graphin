package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Gui extends JLabel{
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
//		-----------------------------
		String wertetabelle[][] = new String[25][2];
		int werteBereich = -12;
		for(int i = 0; i<=25; i+=2) {
			for(int q = 0; q<=1; q++) {

					if(q == 0) {
						wertetabelle[i][q] = werteBereich+"";
					}
					else {
						wertetabelle[i][q] = werteBereich*10+"";
					}
				
				System.out.println(wertetabelle[i][q]);
			}
			werteBereich+=2;
		}
		

		String[] tabelle = {"-12", "-10", "-8", "-6", "-4", "-2", "0", "2", "4", "6", "8", "10", "12"};
	
		

//		-----------------------------
		
		int[] tabl = new int[600];
		for (int i = 0; i<600; i++) {
//			for (int j = 0; j<2; j++) {
				tabl[i] = (int)Math.pow(i, 1);
			
		}


//		-----------------------------
		
		
		// set background x
		g.setColor(Color.WHITE);
		g.fillRect(10, 10, 480, 480);
		
		g.setColor(Color.LIGHT_GRAY);
		for(int i = 10; i<=490; i+=20) {
			g.drawLine(i, 10, i, 490);
		}
		// set background y
		for(int i = 10 ; i<=490; i+=20) {
			g.drawLine(10, i, 490, i);
		}
		
		// draw Kooordinatensystem
		g.setColor(Color.BLUE);
		// x
		g.drawLine(20*12+10, 10, 20*12+10, 490);
		for(int i = 0; i<130; i+=10) {
			// x 
			g.drawString(tabelle[i/10], (i/10)*39+10, 265);
			if (tabelle[i/10] != "0") {
				// y
				g.drawString(tabelle[12-i/10], 235, (i/10)*39+22);
			}
		}
		// y
		g.drawLine(10, 20*12+10, 490, 20*12+10);

		// draw function
		for (int i = 0; i<600; i++) {
			g.drawRect(tabl[i]+1, tabl[i]+1, 1, 1);
			System.out.println(i);

		}
		
	
		
	}

}





