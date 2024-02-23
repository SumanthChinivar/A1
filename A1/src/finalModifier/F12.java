package finalModifier;

public class F12 {
final static void demo()
{
	System.out.println("Demo static method");
}
}

class F13 extends F12
{
	public static void main(String[] args) {
		demo();
	}
}