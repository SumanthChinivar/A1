package collection;

import java.util.Map;
import java.util.TreeMap;

public class A19 {
	public static void main(String[] args) {
		TreeMap<Integer,String> t1=new TreeMap();
		t1.put(1, "Kittu");
		t1.put(2,"Bittu");
		t1.put(3, "Harry");
		t1.put(4, "Puttu");
		
		for(Map.Entry<Integer,String> hs:t1.entrySet())
		{
			System.out.println(hs.getValue());
			System.out.println(hs.getKey());
		}
	}
}
