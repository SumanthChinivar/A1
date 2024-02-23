package practicePrograms;

import java.util.Scanner;

public class SumOfFactorialOfDigitsInNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to digital sum");
		int num=sc.nextInt();
		int sum=0;
		do
		{
			int rem=num%10;
			sum+=factorial(rem);
			num=num/10;
		}
		while(num>0);
		System.out.println(sum);
	}
	
	public static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
