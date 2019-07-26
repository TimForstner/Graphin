package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import kernel.Coordinates;
import kernel.Cpu;
import kernel.QuadCore;

public class Zeichnung extends JLabel{

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
		
		
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
		// y
		g.drawLine(10, 20*12+10, 490, 20*12+10);
		
		// paint the numbers
		String[] tabelle = {"-12", "-10", "-8", "-6", "-4", "-2", " 0"," 2", " 4", " 6", " 8", "10", "12"};
		for(int i = 0; i<130; i+=10) {
			// x 
			g.drawString(tabelle[i/10], (i/10)*39+10, 265);
			if (tabelle[i/10] != " 0") {
				// y
				g.drawString(tabelle[12-i/10], 235, (i/10)*39+22);
			}
		}
		
		// building the black dots
		g.setColor(Color.BLACK);
		for (int i = 0; i<11; i++) {
			g.fillRect(Coordinates.xCorToPixl(QuadCore.wertetabelle[i][0]), Coordinates.yCorToPixl(QuadCore.wertetabelle[i][1]), 2, 2);
			System.out.println(i);

		}
		
		
		// print the zero red Dot
		g.setColor(Color.red);
		g.drawRect(249, 249, 2, 2);
		
		
		
		
	}
}
