package temperatureConversion;
import java.util.Scanner;

public class TempConvApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Convert Celsius to Fahreheit");
		System.out.println("2.Convert Fahreheit to Celsius");
		System.err.println("Select one of two conversion ");
		int num=scan.nextInt();
		switch(num)
		{
		
		case 1:
			System.out.println("Enter the temperature in Celsius:");
			double c=scan.nextDouble();
			System.out.println(CelsiusToFahreheit(c));
			
		
		case 2:
		
			System.out.println("Enter the temperature in fahrenheit:");
			double f=scan.nextDouble();
			System.out.println(FahreheitToCelsius(f));
		
		
		}
	}
	public static double CelsiusToFahreheit(double c) 
	{
		double d=(double)(c*9/5)+32;
		return d;
	}
	public static double FahreheitToCelsius(double f) 
	{
		double g=(double)(f-32)*5/9;
		return g;
	}

}
