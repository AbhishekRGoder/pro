package calc;
import java.util.Scanner;
public class CalculatorMethod {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 numbers for arithmatic operation");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Enter the operation");
		char ch=scan.next().charAt(0);
		
		System.out.println(arithmaticOperation(a,b,ch));
		
	}
	public static int arithmaticOperation(int x,int y,char ch) {
		
		switch(ch) {
		case '+':
			return x+y;
		
			
		case '-':
			return x-y;
			
		case '*':
			return x*y;
			
			
		case '/':
			return x/y;
		
			
		case '%':
			return x%y;
			
		default:
			System.out.println("Invalid operation");
		}
		return 0;
	}
	

}
