package collection;

import java.util.ArrayList;

public class A14 {
public static void main(String[] args) {
	ArrayList<Integer> generic=new ArrayList();
	generic.add(1);
	generic.add(2);
	generic.add(3);
	generic.add(4);
	generic.add(5);
	
	for(Integer i:generic)
	{
		System.out.println(i);
	}
}
}
