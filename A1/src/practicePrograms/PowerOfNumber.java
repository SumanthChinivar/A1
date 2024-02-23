package practicePrograms;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base and power");
		int base=s.nextInt();
		int power=s.nextInt();
		int product=1;
		for(int i=1;i<=power;i++)
		{
			product*=base;
		}
		System.out.println(product);
	}
}
