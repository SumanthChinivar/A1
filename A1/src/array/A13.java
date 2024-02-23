package array;

public class A13 {
	public static void main(String[] args) {
		Car[] cars=new Car[3];
		cars[0]=new Car(100000,"Benz");
		cars[1]=new Car(200000,"BMW");
		cars[2]=new Car(300000,"RollsRoyce");
		
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
	}
}

class Car
{
	double price;
	String company;
	
	Car(double price,String company)
	{
		this.price=price;
		this.company=company;
	}
	
	public String toString()
	{
		return "Company:"+company+",Price:"+price;
	}
}