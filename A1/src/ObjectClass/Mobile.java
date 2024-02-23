package ObjectClass;

public class Mobile {
String company;
double price;

Mobile(String company,double price)
{
	this.company=company;
	this.price=price;
}

public String toString()
{
	return "Company:"+company+", Price:"+price;
}
}
