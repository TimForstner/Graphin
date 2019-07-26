package kernel;

public class Coordinates {
	
	private int xCor, yCor;
	
	public static int xCorToPixl(double x) {
		x = Math.round(x*20+250-1);
		int xPixel = (int) x;	
	
		return xPixel;
	}
	
	public static int yCorToPixl(double y) {
		y = Math.round(y*(-20)+250-1);
		int yPixel = (int) y;

		return yPixel;
	}

}
