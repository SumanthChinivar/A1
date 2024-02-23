package array;

public class A5 {
	public static void main(String[] args) {
		char ch[]=new char[26];
		char ch1='a';
		
		//storing
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=ch1;
			ch1++;
		}
		
		//print
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
