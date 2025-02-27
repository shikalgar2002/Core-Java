package CollectionFramework.queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque {

	public static void main(String[] args) {
		ArrayDeque<Object> ad =new ArrayDeque<Object>();
		
		ad.add("salman");
		ad.add("123");
		ad.add(true);
		ad.add(325235235l);
		ad.add(34.65f);
		ad.addFirst("mustak");
		ad.addLast("Shikalgar");
		ad.add(true);
		
		ad.remove("123");
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.removeFirstOccurrence(true);
		System.out.println(ad);
		ad.reversed();
		System.out.println(ad);
		
		Iterator<Object> it=ad.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
