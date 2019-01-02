package bahan.eksekusi;

public class Hiu {
	
	String jenis;
	String warna;
	int berat;
// baris di bawah ini adalah sebuah contoh constructor ia adalah method pertama kali dalam sebuah class
	public Hiu(String jenishiu) {
		jenis = jenishiu;
		
	}

	public void warnahiu(String warnahiu) {
		
		warna = warnahiu;
	}
	
	public void berathiu(int berathiu) {
		
		berat = berathiu;
	}
		public void cetakhiu() {
			System.out.println("Jenis Hiu: " + jenis);
			System.out.println("Warna : " + warna);
			System.out.print("Berat : " + berat + " Kg");
		}
}//semua baris yang ada di dalam ini adalah sebuah instance atau objek spesifik.

