package collection;

import java.util.ArrayList;

/*
 * WAJP to add first five even numbers to an arraylist
 * and then divide each number by 2 and print the answer
 */
public class A15 {
	public static void main(String[] args) {
		ArrayList<Integer> even=new ArrayList();
		int count=0;
		for(int i=0;count<5;i++)
		{
			if(i%2==0)
			{
				even.add(i);
				count++;
			}
		}
		
		for(Integer i:even)
		{
			System.out.println(i/2);
		}
	}
}
