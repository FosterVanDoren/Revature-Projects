package main;

public class FeetToMeters {
	public double newQty;
	
	public double convertToMeters(double qty) {
		newQty = (qty / 3.281);
		return newQty;
	}
}
