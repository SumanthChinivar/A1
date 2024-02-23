package ObjectClass;

public class Driver7 {
public static void main(String[] args) {
	Pen p1=new Pen(10,12);
	Pen p2=new Pen(10,12);
	
	System.out.println(p1.equals(p2));
	
	Pen p3=new Pen(10,10);
	Pen p4=new Pen(10,5);
	
	System.out.println(p3.equals(p4));
	
	Pen p5=new Pen(10,10);
	Pen p6=new Pen(5,5);
	
	System.out.println(p5.equals(p6));
	
	Pen p7=new Pen(10,10);
	Pen p8=p7;
	
	System.out.println(p7.equals(p8));
}
}
