package practicePrograms;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		int num=797980;
		int count=0;
		do
		{
			num=num/10;
			count++;
		}while(num>0);
		System.out.println(count);
	}
}
