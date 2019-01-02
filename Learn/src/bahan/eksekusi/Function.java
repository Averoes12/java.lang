package bahan.eksekusi;

import java.util.Scanner;

public class Function {
	//function adalah serangkaian program yang dibuat dalam suatu blok dna dapat dipanggil.
	
	public static void Function(){
		//luasKubus();//kita bisa memanggil function yang telah kita buat
		
		System.out.print("Hasil luas persegi panjang adalah " + luasPersegiPanjang(18, 22));
		
	}
	
	//function adalah serangkaian program yang dibuat dalam suatu blok dna dapat dipanggil.
	//sebuah function yang tidak memiliki nilai balik (void) disebut dengan procedural
	

	 static void luasKubus() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Masukkan nilai");
		
		int luasKubus = s.nextInt();
		
		int total = 6 * luasKubus * luasKubus;
		System.out.print(total);
	}
	 //Sebuah function harus memiliki sebuah nilai balik
	 
	 static int luasPersegiPanjang(int panjang,int lebar) {//ini adalah contoh function dengan menggunakan parameter
		 
		 int total = panjang * lebar; 
		 
		 return total;
	 }
}
