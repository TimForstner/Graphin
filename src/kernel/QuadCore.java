package kernel;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuadCore {
	
	public static double wertetabelle[][] = new double[11][2];

	
	public void funktion() {
		
//		Quad Core ist die überholte Klasse von Cpu
//		Berechung erfolgt mithilfe von Zerteilung des Strings durch regex
		
		// Einleitung
		//		1,8x+7x-3
		System.out.println("Hallo, dies  ist ein Programm um eine Funktion grafisch in der Konsole abzubilden.");

		Scanner harald = new Scanner(System.in);
		System.out.println("Gib die Funktion ein im Format: ax^n + bx + c\nf(x): y= ");
		String funktion_raw = harald.nextLine();
		
		System.out.println("Welchen Wertebereich(X) willst du abbilden. (Tipp: Der Wertebreich umfasst dann X bis X+zehn Zahlenabstände)\nX:_____");
		double wertebereichAb = harald.nextDouble();
		System.out.println("Und welchen Zahlenabstand möchtest du?\nZahlenabstand:_____");
		double zahlenAbstand = harald.nextDouble();
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
	
//			1,8^2x+7x-3
//	------------------------------ Funktion herrichten
	
	public static String[] getBearbFunktion(int i, String funktion_raw,double[][] wertetabelle2) {
		
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
		
//		1,8x^2+7x-3
		
	}
	

	
//	----------------------------- SDPQ
	
	public static double getSDPQ(String[] sdpqArr) {
		
		double erg = 0;
		
		if(sdpqArr.length==1) {
			erg = Double.parseDouble(sdpqArr[0]);
		}
		else if(sdpqArr[1].equals("+")) {
			erg = (Double.parseDouble(sdpqArr[0]) + Double.parseDouble(sdpqArr[2]));
			
		}
		else if(sdpqArr[1].equals("-")) {
			erg = (Double.parseDouble(sdpqArr[0]) - Double.parseDouble(sdpqArr[2]));
			
		}
		else if(sdpqArr[1].equals("*")) {
			erg = (Double.parseDouble(sdpqArr[0]) * Double.parseDouble(sdpqArr[2]));
			
		}
		else if(sdpqArr[1].equals("/")) {
			erg = (Double.parseDouble(sdpqArr[0]) / Double.parseDouble(sdpqArr[2]));
			
		}
		else {
			erg = Double.parseDouble(sdpqArr[0]);
			System.out.println("Error on getSDPQ");
		}
		System.out.println("Teilergebnis: "+erg);
		return erg;
	}
	
	public static int calculateFunction(String function_raw) {
		
		int erg = 0;
		String[] fSplit = function_raw.split("");
		ArrayList<String> arr = new ArrayList<String>();
		
		
		
		
		return erg;
	}
	
	
	
	public int[][] getWertetabelle(int[][] wertetabelle) {
		return wertetabelle;
		
	}
	
	public double berechneFunktion() {
		
		String str = "1.3*4+3.4-2;"; 
		double erg = 1.3*4+3.4-2;
		System.out.println(erg);
		return erg;
		
	}

}
