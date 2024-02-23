package string;

public class S16 {
	public static void main(String[] args) {
		String s1="Monday";
		System.out.println(s1.indexOf('M'));
		System.out.println(s1.indexOf('m'));
		
		System.out.println(s1.indexOf("Mon"));
		System.out.println(s1.indexOf("day"));
		System.out.println(s1.indexOf("Monday"));
		System.out.println(s1.indexOf("Sun"));
		
		System.out.println(s1.indexOf("Mon",1));
		System.out.println(s1.indexOf("day",3));
		
	}
}
