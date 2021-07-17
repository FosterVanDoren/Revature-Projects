package main;

public class GallonsToCubicFeet {
	public double newQty;
	
	public double convertToCubicFeet(double qty) {
		newQty = (qty / 7.481);
		return newQty;
	}
}
