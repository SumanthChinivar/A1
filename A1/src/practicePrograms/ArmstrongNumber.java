package practicePrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		int temp=num;
		int numberOfDigits=count(num);
		int sum=0;
		do
		{
			int rem=num%10;
			sum=sum+power(rem, numberOfDigits);
			num=num/10;
		}while(num>0);
		if(sum==temp)
		{
			System.out.println(temp+" is an armstrong number");
		}
		else
			System.out.println(temp+" is not an armstrong number");
	}
	
	public static int count(int num)
	{
		int count=0;
		do
		{
			num=num/10;
			count++;
		}while(num>0);
		return count;
	}
	
	public static int power(int base,int power)
	{
		int product=1;
		for(int i=1;i<=power;i++)
		{
			product=product*base;
		}
		return product;
	}
}
