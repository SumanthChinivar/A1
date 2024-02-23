package exception;

public class E11 {
	int a = 10;

	public static void main(String[] args) {
		E11 e=null;
		try
		{
			System.out.println(e.a);
		}
		catch(NullPointerException n)
		{
			System.out.println("Create an object to access the value");
		}
	}
}
