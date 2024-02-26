package javapractice;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		float temperature;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit:");
		temperature = sc.nextFloat();
		
		temperature =((temperature-32)*5/9);
		
		System.out.println("Temperature in Celsius = "+temperature);

	}

}
