package ObjectClass;

public class Driver6 {
public static void main(String[] args) {
	Mango1 m1=new Mango1(100);
	Mango1 m2=m1;
	
	System.out.println(m1==m2);
	System.out.println(m1.equals(m2));
}
}
