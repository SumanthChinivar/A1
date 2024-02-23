package ObjectClass;

public class Pen {
	double price;
	double length;

	Pen(double price,double length)
	{
		this.length=length;
		this.price=price;
	}
	
	public String toString()
	{
		return "Price:"+price+",Length:"+length;
	}
	
	public boolean equals(Object o)
	{
		Pen p=(Pen)o;
		if(this.price==p.price && this.length==p.length)
		{
			return true;
		}
		return false;
	}
}
