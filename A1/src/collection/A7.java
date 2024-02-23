package collection;

import java.util.ArrayList;

/*
 *Add names of 5 sweets into an arraylist
 * convert arraylist into an array 
 */

public class A7 {
	public static void main(String[] args) {
		ArrayList sweets=new ArrayList();
		sweets.add("Rasamalai");
		sweets.add("Laddu");
		sweets.add("Jamun");
		sweets.add("Kaju katli");
		sweets.add("Mysore pak");
		
		System.out.println(sweets);
		
		Object[] sweetArray=sweets.toArray();
		for(Object o:sweetArray)
		{
			System.out.println(o);
		}
	}
}
