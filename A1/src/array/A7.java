package array;

import java.util.Scanner;

public class A7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a=new int[5];
		System.out.println("Entrer the elements of the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
