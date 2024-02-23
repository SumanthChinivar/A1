package collection;

import java.util.ArrayList;

public class A11 {
	public static void main(String[] args) {
		ArrayList num=new ArrayList();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		int sum=0;
		for(int i=0;i<num.size();i++)
		{
//			Object val=num.get(i);
//			Integer j=(Integer)val;
//			int k=j;
			int val=(Integer)num.get(i);
			sum=sum+val;
		}
		System.out.println(sum);
	}
}
