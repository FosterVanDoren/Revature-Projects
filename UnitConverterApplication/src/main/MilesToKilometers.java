package main;

public class MilesToKilometers {
	public double newQty;
	
	public double convertToKilometers(double qty) {
		newQty = (qty * 1.609);
		return newQty;
	}
	
}
