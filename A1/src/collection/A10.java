package collection;

import java.util.ArrayList;

public class A10 {
	public static void main(String[] args) {
		ArrayList num=new ArrayList();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		for(int i=0;i<num.size();i++)
		{
			System.out.println(num.get(i));
		}
	}
}
