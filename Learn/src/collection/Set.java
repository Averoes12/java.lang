package collection;
import java.util.Iterator;
import java.util.TreeSet;



public class Set {
	//Set punya tiga class ==> HashSet LinkedHashSet TreeSet
	
	public static void main(String[] daff) {
		//Set sama dengan List, Set tidak urut dalam menyimpan data
		//kita buat objek dari Set
		
		TreeSet <String> warna = new TreeSet<String>();
		
		warna.add("tosqa");
		warna.add("aquablue");
		warna.add("blueSaphire");
		
		
		//kita tampilkan dengan iterator
		
		Iterator<String> it = warna.iterator();
		
		System.out.print("Pilihan warna : \n");
		
		while (it.hasNext()) {
			
			
			System.out.println(it.next());
		}

	}
}