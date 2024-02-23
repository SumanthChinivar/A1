package ObjectClass;

public class Driver4 {
	public static void main(String[] args) {
		Mango m1=new Mango(150);
		Mango m2=m1;
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
	}
}
