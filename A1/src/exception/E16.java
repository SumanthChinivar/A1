package exception;

public class E16 {
public static void main(String[] args) throws InterruptedException{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		Thread.sleep(3000);
	}
}
}
