package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class E12 {
	public static void main(String[] args) {
		try
		{
			new FileOutputStream("1243");
			int a=10/0;
		}
		catch(FileNotFoundException f)
		{
			System.out.println("Some error occured");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Cannot divide by 0");
		}
	}
}
