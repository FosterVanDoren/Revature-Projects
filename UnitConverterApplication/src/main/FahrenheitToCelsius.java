package main;

public class FahrenheitToCelsius {
	public double newQty;
	
	 public double convertToCelsius(double qty) {
		 newQty = (qty - 32) * .5556;
		 return newQty;
	 }
}
