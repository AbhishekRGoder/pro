package ex;
import java.util.Scanner;

public class Planet {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius=scan.nextDouble();
		PlanetExplorer explorer=new PlanetExplorer();
		double res=explorer.calculateSurfaceArea(radius);
		System.out.println(res);
		
	}

}
