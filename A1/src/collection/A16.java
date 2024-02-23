package collection;

import java.util.ArrayList;

public class A16 {
	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList();
		students.add(new Student(1,"Smith"));
		students.add(new Student(2, "Jack"));
		students.add(new Student(3, "Tony"));
		students.add(new Student(4,"Peter"));
		
//		System.out.println(students);
		
//		for(Object o:students)
//		{
//			Student s=(Student)o;
//			System.out.println("ID:"+s.id);
//			System.out.println("Name:"+s.name);
//		}
		
		for(Student s:students)
		{
			System.out.println(s.name);
			System.out.println(s.id);
		}
	}
}


class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return "Name:"+name+" ID:"+id;
	}
}