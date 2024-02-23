package array;

import java.util.Scanner;

/*
 * read integer data from the user and
 * print the elements
 */
public class A8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements to the array");
		String[] a=new String[4];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.next();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
