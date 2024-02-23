package finalModifier;

public class F9 {
	final int a;
	
	F9()
	{
		a=10;
	}
	
	public static void main(String[] args) {
		F9 f1=new F9();
		System.out.println(f1.a);
	}
}
