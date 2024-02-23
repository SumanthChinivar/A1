package practicePrograms;

import java.util.Scanner;

public class DigitalSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to digital sum");
		int num=sc.nextInt();
		int sum=0;
		do
		{
			int rem=num%10;
			sum+=rem;
			num=num/10;
		}
		while(num>0);
		System.out.println(sum);
	}
}
