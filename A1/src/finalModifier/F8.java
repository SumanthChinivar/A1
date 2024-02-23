package finalModifier;

public class F8 {
	final int a;
	
	{
		a=10;
	}
	
	public static void main(String[] args) {
		F8 f1=new F8();
		System.out.println(f1.a);
	}
}
