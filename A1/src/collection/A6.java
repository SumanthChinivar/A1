package collection;

import java.util.ArrayList;

/*
 *Create an arraylist of bikes
 *create an arraylist of cars
 *add bikes to cars
 *then remove bike from cars 
 */


public class A6 {
	public static void main(String[] args) {
		ArrayList bikes=new ArrayList();
		bikes.add("Pulsar");
		bikes.add("Splendor");
		bikes.add("RX100");
		bikes.add("Karizma");
		bikes.add("bmw");
		
		ArrayList cars=new ArrayList();
		cars.add("Thar");
		cars.add("Audi");
		cars.add("Range Rover");
		cars.add("Benz");
		cars.add("bmw");
		
		cars.addAll(bikes);
		System.out.println(cars);
//		cars.removeAll(bikes);
//		System.out.println(cars);
		
		cars.retainAll(bikes);
		System.out.println(cars);
	}
}
