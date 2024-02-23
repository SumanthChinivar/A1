package finalModifier;

public class F5 {
	final static int a;
	
	static
	{
		a=10;
	}
	
	public static void main(String[] args) {
		System.out.println(a);
	}
}
