package collection;

import java.util.ArrayDeque;
import java.util.Iterator;


public class Dequeue {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> warna = new ArrayDeque<String>(); 
		
		warna.addLast("Torquise");
		warna.push("Coral");
		warna.add("Silver");
		warna.addFirst("Cyan");
	
		
		Iterator<String> it = warna.iterator();
		
		System.out.println("Pick Color :");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
