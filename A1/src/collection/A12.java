package collection;

import java.util.ArrayList;

public class A12 {
	public static void main(String[] args) {
		ArrayList num=new ArrayList();
		num.add(10);
		num.add("Stranger");
		num.add(45);
		num.add(12l);
		
		for(Object o:num)
		{
			System.out.println(o);
		}
	}
}
