package ObjectClass;

public class Driver5 {
	public static void main(String[] args) {
		Mango1 m1=new Mango1(100);
		Mango1 m2=new Mango1(100);
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		
		Mango1 m3=new Mango1(200);
		Mango1 m4=new Mango1(100);
		
		System.out.println(m3==m4);
		System.out.println(m3.equals(m4));
	}
}
