package bitwise;
import java.util.Scanner;

public class BitwiseBitCounter {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scan.nextInt();
		int count =countSetBits(a);
		System.out.println(count);
		
	}
	public static int countSetBits(int num) {
		int count=0;
		while(num>0) {
			count+=num&1;
			num>>=1;
			
		}
		return count;
	}

}
