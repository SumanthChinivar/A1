package exception;

public class E15 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				System.out.println("Some error occured");
			}
		}
	}
}
