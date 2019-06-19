package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

import kernel.Cpu;

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
		

		
//		for(int i = 0; i<130; i+=10) {
//			// x 
//			g.drawString(tabelle[i/10], (i/10)*39+10, 265);
//			if (tabelle[i/10] != "0") {
//				// y
//				g.drawString(tabelle[12-i/10], 235, (i/10)*39+22);
//			}
//		}
		g.setColor(Color.BLUE);
		for (int i = 0; i<11; i++) {
			g.drawRect((Cpu.wertetabelle[i][0]*20+250), (Cpu.wertetabelle[i][1]*20+250), 1, 1);
			System.out.println(i);

		}
		
		
		// print Dot
		g.setColor(Color.red);
		g.drawRect(249, 249, 2, 2);
		
		
		
		
	}
}
