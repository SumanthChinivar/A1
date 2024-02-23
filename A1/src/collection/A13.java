package collection;

import java.util.ArrayList;

public class A13 {
	public static void main(String[] args) {
		ArrayList greetings=new ArrayList();
		greetings.add("Hello");
		greetings.add("Hai");
		greetings.add("How are you");
		greetings.add("I am fyn");
		greetings.add("Good morning");
		
		int i=1;
		for(Object o:greetings)
		{
			String s=(String)o;
			s="String "+i+": "+s;
			System.out.println(s);
			i++;
		}
	}
}
