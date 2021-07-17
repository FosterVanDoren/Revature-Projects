package main;

import java.util.Scanner;


public class Converter {
	
	public static void main(String[] args) {
		
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Please select an option");
		System.out.println("1. Volume Conversions");
		System.out.println("2. Distance Conversions");
		System.out.println("3. Temperature Conversions");
		System.out.println("4. Quit");
		
		int menuSelection = scanner.nextInt();
		int previousSelection = 0;
		while(menuSelection != previousSelection ) {
		
			switch (menuSelection) {
			
			case 1:
				System.out.println("Please select an option");
				System.out.println("5. Teaspoons to Tablespoons");
				System.out.println("6. Teaspoons to Cups");
				System.out.println("7. Gallons to Cubic Feet");
				System.out.println("8. Quit");
				
				menuSelection = scanner.nextInt();
				
				switch (menuSelection) {
				
				case 5:
					System.out.println("Please enter a quantity");
					TeaspoonsToTablespoons tablespoonConversion = new TeaspoonsToTablespoons();
					
					menuSelection = scanner.nextInt();
					tablespoonConversion.convertToTablespoons(menuSelection);	

					
					System.out.println("You have converted " + (double)menuSelection +" Teaspoons to: " + tablespoonConversion.newQty + " Tablespoons.");
					break;
				case 6:
					System.out.println("Please enter a quantity");
					TeaspoonsToCups cupConversion = new TeaspoonsToCups();
					
					menuSelection = scanner.nextInt();
					cupConversion.convertToCups(menuSelection);
					
					System.out.println("You have converted " + (double)menuSelection + "Teaspoons to: " + cupConversion.newQty + " Cups.");
					break;
				case 7:
					System.out.println("Please enter a quantity");
					
					GallonsToCubicFeet cubicFeetConversion = new GallonsToCubicFeet();

					menuSelection = scanner.nextInt();
					cubicFeetConversion.convertToCubicFeet(menuSelection);
					
					System.out.println("You have converted " + (double)menuSelection + " Gallons to: " + cubicFeetConversion.newQty + " Cubic Feet.");
					break;
				case 8:
					System.out.println("Program Terminated.");
					break;
				default:
					System.out.println("Option unavailable. Please select an available option.");
					System.out.println("5. Teaspoons to Tablespoons");
					System.out.println("6. Teaspoons to Cups");
					System.out.println("7. Gallons to Cubic Feet");
					System.out.println("8. Quit");
				}
				
				break;
			case 2:
				System.out.println("Please select an option");
				System.out.println("5. Feet to Meters");
				System.out.println("6. Miles to Kilometers");
				System.out.println("7. Yard to Nautical Mile");
				System.out.println("8. Quit");
				
				menuSelection = scanner.nextInt();
				
				switch (menuSelection) {
				
				case 5:
					System.out.println("Please enter a quantity");
					FeetToMeters meterConversion = new FeetToMeters();
					
					menuSelection = scanner.nextInt();
					meterConversion.convertToMeters(menuSelection);
					
					System.out.println("You have converted " + (double)menuSelection + "Feet to: " + meterConversion.newQty + " Meters.");
					break;
				case 6:
					System.out.println("Please enter a quantity");
					MilesToKilometers kilometerConversion = new MilesToKilometers();
					
					menuSelection = scanner.nextInt();
					kilometerConversion.convertToKilometers(menuSelection);
					
					System.out.println("You have converted " + (double)menuSelection + " Miles to: " + kilometerConversion.newQty+ " Kilometers.");
					break;
				case 7:
					System.out.println("Please enter a quantity");
					YardToNauticalMile nmConverter = new YardToNauticalMile();
					
					menuSelection = scanner.nextInt();
					nmConverter.convertToNauticalMile(menuSelection);
					
					System.out.println("You have converted " + (double)menuSelection + " Yards to: " + nmConverter.newQty + " Nautical Miles.");
					break;
				case 8:
					System.out.println("Program Terminated.");
					break;
				default:
					System.out.println("Option unavailable. Please select an available option.");
					System.out.println("5. Feet to Meters");
					System.out.println("6. Miles to Kilometers");
					System.out.println("7. Yard to Nautical Mile");
					System.out.println("8. Quit");
				}
				
				break;
			case 3:
				System.out.println("Please select an option");
				System.out.println("5. Fahrenheit to Celsius");
				System.out.println("6. Fahrenheit to Kelvin");
				System.out.println("7. Celsius to Fahrenheit");
				System.out.println("8. Quit");
				
				menuSelection = scanner.nextInt();
				
				switch (menuSelection) {
				
				case 5:
					System.out.println("Please enter a quantity");
					FahrenheitToCelsius celsiusConversion = new FahrenheitToCelsius();
					
					menuSelection = scanner.nextInt();
					celsiusConversion.convertToCelsius(menuSelection);

					
					System.out.println("You have converted " + (double)menuSelection + " degrees Fahrenheit to: " + celsiusConversion.newQty + " degrees Celsius.");
					break;
				case 6:
					System.out.println("Please enter a quantity");
					FahrenheitToKelvin kelvinConversion = new FahrenheitToKelvin();
					
					menuSelection = scanner.nextInt();
					kelvinConversion.convertToKelvin(menuSelection);
					
					System.out.println("You have converted " + (double)menuSelection + " degrees Fahrenheit to: " + kelvinConversion.newQty + " degrees Kelvin.");
					break;
				case 7:
					System.out.println("Please enter a quantity");
					CelsiusToFahrenheit fahrenheitConversion = new CelsiusToFahrenheit();
					
					menuSelection = scanner.nextInt();
					fahrenheitConversion.convertToFahrenheit(menuSelection);
					
					System.out.println("You have converted " + (double)menuSelection + " degrees Celsius to: " + fahrenheitConversion.newQty + " degrees Fahrenheit.");
					break;
				case 8:
					System.out.println("Program Terminated.");
					break;
				default:
					System.out.println("Option unavailable. Please select an available option.");
					System.out.println("5. Fahrenheit to Celsius");
					System.out.println("6. Fahrenheit to Kelvin");
					System.out.println("7. Celsius to Fahrenheit");
					System.out.println("8. Quit");
				
				}
				
				break;
			case 4:
				System.out.println("Program Terminated.");
				break;
			default:
				System.out.println("Option unavailable. Please select an available option.");
				System.out.println("1. Volume Conversions");
				System.out.println("2. Distance Conversions");
				System.out.println("3. Temperature Conversions");
				System.out.println("4. Quit");
				

				
				previousSelection = menuSelection;
				menuSelection = scanner.nextInt();
			
		}
			
				
	}
	
	
	}
	
	
	
}
