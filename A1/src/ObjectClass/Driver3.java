package ObjectClass;

public class Driver3 {
	public static void main(String[] args) {
		Mango m1=new Mango(120);
		Mango m2=new Mango(150);
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
	}
}
