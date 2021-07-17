package main;

public class TeaspoonsToCups {
	public double newQty;
	
	public  double convertToCups(double qty) {
		newQty = (qty / 48.692);
		return newQty;
	}
}
