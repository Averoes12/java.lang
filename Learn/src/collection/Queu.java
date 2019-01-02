package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queu {
	 
	public static void main(String[] args) {
		
		PriorityQueue<String> warna = new PriorityQueue<String>();
		
		warna.add("coral blue");
		warna.add("gold sand");
		warna.add("Rose gold");
		warna.add("Navy Blue");
		
		System.out.println("peek " + warna.peek());//peek mengambil data yang pertama kali dioutpun kan
		//System.out.println("Pooling " + warna.poll());
		//kita tampilkan menggunakan iterator
		
		if(warna.contains("coral blue")) {
			System.out.println("coral blue " + "Warna Tersedia");// digunakan untuk mengecek data 
		}
		Iterator<String> it = warna.iterator();
		
		System.out.println("Choose your color :");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
