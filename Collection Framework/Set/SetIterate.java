package CollectionFramework.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetIterate {

	public static void main(String[] args) {
	
		HashSet<String> s = new HashSet<String>();

		s.add("mango");
		s.add("apple");
		s.add("papaya");
		s.add("orange");
		
		System.out.println(s);
		
//		For EachLoop
//		for (Object item : s) {
//			System.out.println(item);
//		}
		
//		Using Iterator
//		Iterator<String> it=s.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

}
