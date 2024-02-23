package ObjectClass;

public class Mango1 {
	double price;

	Mango1(double price)
	{
		this.price=price;
	}
	
	public String toString()
	{
		return "Price:"+price;
	}
	
	public boolean equals(Object o)
	{
		Mango1 m=(Mango1)o;
		if(this.price==m.price)
		{
			return true;
		}
		return false;
	}
}
