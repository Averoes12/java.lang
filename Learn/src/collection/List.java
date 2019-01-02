package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class List {
	
	  public static void main(String[] args) {
	        //kita akan membuat arraylist

		  	ArrayList<String> warna = new ArrayList<String>();

	        /*warna.add("merah");
	        warna.add("putih");
	        warna.add("briu");
	        warna.add("Kuning");*/
	        
	        //meamsukkan semua data sekaligus
	        warna.addAll(Arrays.asList("merah","Putih", "biru","kuning"));


	        //kita panggil arraylist yang telah kita buat

	        //for (int i = 0; i < warna.size(); i++) {

	            //System.out.println("Kita Punya Warna " + warna.get(i));
	            
	            //kita bisa menggunakan iterator
	            
	            
	            //Iterator<String> it = warna.iterator();
	            
	            //while (it.hasNext()) {
	            	//System.out.println(it.next());
	        //kita juga menampilkan dengan seperti ini
	        for(Object color : warna){

	        	System.out.println(color);
	        }	

	            }
	            
	        }
	        
	 // }
	  
//}
