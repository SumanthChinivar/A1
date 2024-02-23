package array;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int key=sc.nextInt();
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				System.out.println("Element found");
				break;
			}	
		}
		if(flag==0)
		{
			System.out.println("Element is not present");
		}
	}
}
