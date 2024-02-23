package collection;

import java.util.Map;
import java.util.TreeMap;

/*
 * Store Laptop names and its comapnies in a map
 * and retrieve the values
 */
public class A20 {
	public static void main(String[] args) {
		TreeMap<String,String> t1=new TreeMap();
		t1.put("HP", "Pavillion");
		t1.put("Dell", "Inspiron");
		
		for(Map.Entry<String,String> hs:t1.entrySet())
		{
			System.out.println(hs.getKey());
			System.out.println(hs.getValue());
		}
	}
}
