package collection;

import java.util.*;
import java.util.Map.Entry;

public class Map {
	
	public static void main(String [] args) {
		//Map punya 3 class ==> HashMap LinkedHashMap TreeMap
		
		
		TreeMap<String, String> produksi = new TreeMap<String, String>();
		
		//untuk memasukkan datanya kita butuh method put
		
		produksi.put("bc001" , "Brownies Coklat");
		produksi.put("bm001", "Brownies Matcha");
		produksi.put("bk001", "Brownies Keju");
		
		//kita akan menampilkannya dengan for
		
		//kita perlu menggunakan rumus
		//tipeData namaBaru : namaMap.entrySet()
		
		for(Entry<String, String> brownies : produksi.entrySet()) {//tipe data datanya adalah entry lalu entrySet digunakan untuk mengambil data 
			
			System.out.println("Kode Produksi : " + brownies.getKey() +" Nama Barang : " + brownies.getValue());
			
			
		}
		
		
	}
}
