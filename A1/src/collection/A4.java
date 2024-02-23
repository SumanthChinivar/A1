package collection;

import java.util.ArrayList;

/*
 * create a list containing 4 Laptop companies
 */
public class A4 {
	public static void main(String[] args) {
		ArrayList laptop=new ArrayList();
		laptop.add("HP");
		laptop.add("Dell");
		laptop.add("Lenovo");
		laptop.add("Mac");
		
		System.out.println(laptop);
		
		laptop.remove("Lenovo");
		System.out.println(laptop);
		
	}
}
