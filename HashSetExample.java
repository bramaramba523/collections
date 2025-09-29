package package1;
import java.util.HashSet;
import java.util.Set;
public class HashSetExample {
//main driver method
	public static void main(String[] args) {
      //creating object of set of type string
		Set<String> h= new HashSet<String>();
		//adding elements into the hashset
		//using add()
		//custom input elements
		h.add("India");
		h.add("Australia");
		h.add("South Africa");
		//adding the duplicate element
		h.add("India");
		//displaying the hashset
		System.out.println("After adding India"+h);
			//removing items from hashset
		//using remove() method
		h.remove("Australia");
		System.out.println("Set after removing"+"Australia"+h);
		//Iterating over hash set items
		System.out.println("Iterating over set");
		
		//Iterating through iterators
		Iterator<String> i= h.iterator();
		//It holds true till there is a single element
		//remaining in the object
		while(i.hashNext())
			
		

	}

}
