package collection;

import java.util.ArrayList;

/*
 * Create an arraylist and store names of 
 * 5 programming languages
 * 
 * Create a arraylist to store names of
 * 5 application
 * 
 * and merge the two arraylist
 */

public class A3 {
	public static void main(String[] args) {
		ArrayList prog=new ArrayList();
		prog.add("Java");
		prog.add("Python");
		prog.add("C++");
		prog.add("C#");
		prog.add("JS");
		
		System.out.println("Prog list"+prog);
		
		ArrayList appli=new ArrayList();
		appli.add("X");
		appli.add("FB");
		appli.add("Whatsapp");
		appli.add("SnapChat");
		appli.add("Insta");
		
		System.out.println("Appli list"+appli);
		
		ArrayList both=new ArrayList();
		both.addAll(prog);
		both.addAll(appli);
		
		System.out.println("Both list:"+both);
		
		prog.addAll(appli);
		System.out.println("prog:"+prog);
		
		prog.clear();
		System.out.println("prog:"+prog);
		
		System.out.println(appli.contains("X"));;
		
		System.out.println(both.containsAll(prog));
		
	}
}
