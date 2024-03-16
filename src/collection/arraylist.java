package collection;

import java.util.ArrayList;

public class arraylist
{
	public static void main(String[] args) 
	{
		ArrayList<Object> a = new ArrayList<Object>();
		//add the objects:
		a.add(9);
		a.add(true);
		a.add(null);
		a.add("LapTop");
		a.add('H');
		a.add('I');
		a.add('M');
		a.add('A');
		a.add(49.4);
		a.add('T');
		a.add(null);
		//checking particular object is present or not:
		System.out.println(a.contains(null));
		//Returning/retrieving/getting particular object on index position:
		System.out.println(a.get(5));
		//replacing/updating/modifying particular object on index position:
		System.out.println(a.set(0,"Teja"));
		System.out.println(a);
		//counting the length of collection:
		System.out.println(a.size());
		//checking whether the collection is empty or not:
		System.out.println(a.isEmpty());
		//remove/deleting/drop the particular object based on index position:
		System.out.println(a.remove(3));
		System.out.println(a);
		//adding the particular object based index position:
		a.add(0,"Marker");
		System.out.println(a);
		//clearing the objects from collection:
		a.clear();
		System.out.println(a);
	}
}
		
		
	
