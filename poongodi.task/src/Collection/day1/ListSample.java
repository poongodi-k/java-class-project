package Collection.day1;

import java.util.ArrayList;
import java.util.List;

public class ListSample{
	public static void main(String args[]) {
		List<String> names = new ArrayList<>();
		names.add("Poongodi");
		names.add("Bala");
		names.add("Sumi");
		names.add("Kavi");
		names.add("Puni");
		System.out.println("List after adding elements:"+ " " + names);
		names.add(2,"Vijay");
		System.out.println("List after insertion:" + " " + names);
		System.out.println("The element at third index is:" + " " + names.get(3) );
		names.set(4, "Mahesh");
		System.out.println("List after modification:" + " " + names);
		names.remove(1);
		System.out.println("List after removal:" + " " + names);
		boolean containsName = names.contains("Sumi");
		System.out.println("List contains 'Sumi':" + " " + containsName);
		System.out.println("Iterating over the list:");
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println("List size:" + " " + names.size());
		names.clear();
		System.out.println("List after clear:" + names);
		boolean isEmpty = names.isEmpty();
		System.out.println("Is list empty:" + " " + isEmpty);
		
		
		
		
		
	}

}
