package exception;

public class E19 {
	public static void main(String[] args) {
		try
		{
			demo();
		}
		catch(ArithmeticException a)
		{
			System.out.println("Cannot divide by 0");
		}
	}

	public static void demo() {
		int a=10/0;
	}
}
