package kernel;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JFrame;

import graphics.Zeichnung;

public class Cpu {
	
	public static int wertetabelle[][] = new int[11][2];

	
	public void funktion() {
		
		// Einleitung
		System.out.println("Hallo, dies ist ein Programm um eine Funktion grafisch in der Konsole abzubilden.");

		Scanner harald = new Scanner(System.in);
		System.out.println("Gib die Funktion ein im Format: ax^n + bx + c\nf(x): y= ");
		String funktion_raw = harald.nextLine();
		
		System.out.println("Welchen Wertebereich(X) willst du abbilden. (Tipp: Der Wertebreich umfasst dann X bis X+zehn Zahlenabstände)\nX:_____");
		int wertebereichAb = harald.nextInt();
		System.out.println("Und welchen Zahlenabstand möchtest du?\nZahlenabstand:_____");
		int zahlenAbstand = harald.nextInt();
		for (int i = 0; i<=10;i++) {
			wertetabelle[i][0] = wertebereichAb;
			wertebereichAb += zahlenAbstand;
		}
		
		for (int i = 0; i < wertetabelle.length; i++) {
			
			String[] bearbFunktion = getBearbFunktion(i, funktion_raw, wertetabelle);
			for(String sdpwDesign:bearbFunktion) {
				String[] sdpqArr = sdpwDesign.split("@"); 
				wertetabelle[i][1] += getSDPQ(sdpqArr);
//				System.out.println("Ergebis: "+getSDPQ(sdpqArr));
			}
		}
		System.out.println("Für ");
		for(int i = 0;i<wertetabelle.length;i++) {
			System.out.println("x= "+wertetabelle[i][0]+ " : y= "+wertetabelle[i][1]);
		}
		
		harald.close();
	}
	
//	------------------------------ Funktion herrichten
	
	public static String[] getBearbFunktion(int i, String funktion_raw,int[][] wertetabelle2) {
		
		String x = wertetabelle2[i][0] + "";
		String fMitPunkt = funktion_raw.replace(',', '.');
		System.out.println(fMitPunkt);
		Pattern pattern = Pattern.compile("[x]\\^(\\d)");
		Matcher matcher = pattern.matcher(fMitPunkt);
		if (matcher.find()) {
			System.out.println("HIER: " + matcher.group());
			String[] potenz = matcher.group().split("");
			
			
		}
//		String fMitX = fMitPunkt.replaceAll("x^\\d", newChar)
		String fMitX = fMitPunkt.replaceAll("x", "@*@"+x+"!");
		String[] rechung = fMitX.split("!");
		System.out.println(fMitX);
		return rechung;
		
//		1,8x+7x-3
		
	}
	
//	----------------------------- SDPQ
	
	public static int getSDPQ(String[] sdpqArr) {
		
		float erg = 0;
		
		if(sdpqArr.length==1) {
			erg = Float.parseFloat(sdpqArr[0]);
		}
		else if(sdpqArr[1].equals("+")) {
			erg = (Float.parseFloat(sdpqArr[0]) + Float.parseFloat(sdpqArr[2]));
			
		}
		else if(sdpqArr[1].equals("-")) {
			erg = (Float.parseFloat(sdpqArr[0]) - Float.parseFloat(sdpqArr[2]));
			
		}
		else if(sdpqArr[1].equals("*")) {
			erg = (Float.parseFloat(sdpqArr[0]) * Float.parseFloat(sdpqArr[2]));
			
		}
		else if(sdpqArr[1].equals("/")) {
			erg = (Float.parseFloat(sdpqArr[0]) / Float.parseFloat(sdpqArr[2]));
			
		}
		else {
			erg = Float.parseFloat(sdpqArr[0]);
			System.out.println("Error on getSDPQ");
		}
		return (int)erg;
	}
	
	public int[][] getWertetabelle(int[][] wertetabelle) {
		return wertetabelle;
		
	}

}
