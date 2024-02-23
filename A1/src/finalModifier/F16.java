package finalModifier;

public class F16 {
final void demo()
{
	System.out.println("Non-static demo method");
}
}

class F17 extends F16
{
	void demo()
	{
		System.out.println("Overriding method");
	}
}
