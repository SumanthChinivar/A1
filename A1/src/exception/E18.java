package exception;

public class E18 {
	public static void main(String[] args) {
		demo();
	}

	public static void demo() {
		try
		{
		int a=10/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Cannot divide by 0");
		}
	}
}
