package main;

public class FahrenheitToKelvin {
	public double newQty;
	
	 public double convertToKelvin(double qty) {
		 newQty = (qty - 32) * 5 / 9 + 273.13;
		 return newQty;
	 }
}
