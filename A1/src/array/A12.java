package array;

import java.util.Arrays;

public class A12 {
public static void main(String[] args) {
	int[] a= {2,3,21,34,11,15,26,32,43,67,12};
	//a={2,3,11,12,15,21,26,32,34,43,67};
	Arrays.sort(a);
	System.out.println("It is 4th smallest element:"+a[3]);
	System.out.println("Largest element:"+a[a.length-1]);
	System.out.println("3rd largest element:"+a[a.length-3]);
}
}