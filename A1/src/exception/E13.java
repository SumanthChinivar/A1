package exception;

import java.util.Scanner;

public class E13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try
	{
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
	}
	catch (ArithmeticException a)
	{
		System.out.println("Cannot divide by 0");
	}
	catch(Exception e)
	{
		 System.out.println("Some error occured");
	}
	catch(Throwable t)
	{
		System.out.println("Some error occured");
	} 
}
}
