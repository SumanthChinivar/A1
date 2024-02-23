package string;

public class S21 {
public static void main(String[] args) {
	String s1="Sunday tho funday hey";
	String[] s2 = s1.split(" ");
	for(int i=0;i<s2.length;i++)
	{
		System.out.println(s2[i]);
	}
	
	String s3="ababab";
	String[] s4 = s3.split("a");
	for(int i=0;i<s4.length;i++)
	{
		System.out.println(s4[i]);
	}
	
	String s5="ababab";
	String[] s6=s5.split("b");
	for(int i=0;i<s6.length;i++)
	{
		System.out.println(s6[i]);
	}
}
}
