package exception;

public class E10 {
	public static void main(String[] args) {
		try
		{
			int res=1/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("We cannot divide a number by 0");
		}
	}
}
