package arithematic;
import java.util.Scanner;

public class Math {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("The result of subtracting num2 from num1 is :"+subtractNumbers(num1,num2));
		System.out.println("Enter 2 numbers:");
		int num3=scan.nextInt();
		int num24=scan.nextInt();
		System.out.println("The result of multiplying num1 and num2 is :"+multiplyNumbers(num1,num2));
		System.out.println("Enter 2 numbers:");
		int num5=scan.nextInt();
		int num6=scan.nextInt();
		System.out.println("The result of dividing num1 by  num2 is :"+divideNumbers(num1,num2));
		System.out.println("The remainder when num1 is divided by num2 is :"+findRemainder(num1,num2));
		
		
		
	}
	public static int subtractNumbers(int num1,int num2) {
		return num2-num1;
	}
	public static int multiplyNumbers(int num1,int num2) 
	{
		return num2*num1;
	}
	public static double divideNumbers(int num1,int num2) 
	{
		return num1/num2;
	}
	public static int findRemainder(int num1,int num2) 
	{
		return num1%num2;
	}


}
