package practicePrograms;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to digital sum");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		do
		{
			int rem=num%10;
			sum+=factorial(rem);
			num=num/10;
		}
		while(num>0);
		if(sum==temp)
		{
			System.out.println(temp+" is a strong number");
		}else
			System.out.println(temp+" is not a strong number");
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
