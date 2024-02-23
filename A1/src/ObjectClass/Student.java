package ObjectClass;

public class Student {
	String name;
	int id;
	
	Student(String name,int id){
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return "Name:"+name+",ID:"+id;
	}
}
