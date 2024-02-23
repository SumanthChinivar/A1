package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class A17 {
	public static void main(String[] args) {
		ArrayList<Bike> bikes=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter bike name");
			String name=sc.next();
			System.out.println("Enter price");
			double price=sc.nextDouble();
			System.out.println("Enter milage");
			double milage=sc.nextDouble();
			bikes.add(new Bike(name,price,milage));
		}
		System.out.println(bikes);
	}
}

class Bike {
	String name;
	double price;
	double milage;

	Bike(String name, double price, double milage) {
		this.name = name;
		this.price = price;
		this.milage = milage;
	}

	public String toString() {
		return "Name:" + name + ", Price:" + price + ", milage:" + milage;
	}
}