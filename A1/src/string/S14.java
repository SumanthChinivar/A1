package string;

public class S14 {
	public static void main(String[] args) {
		String s1="Good Day";
		byte[] b1=s1.getBytes();
		for(int i=0;i<b1.length;i++)
		{
			System.out.println(b1[i]);
		}
	}
}
