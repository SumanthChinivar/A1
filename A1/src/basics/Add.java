package basics;

import java.util.Scanner;
import java.io.FileOutputStream;

public class Add {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(a+b);
}
}
