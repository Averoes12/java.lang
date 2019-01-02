package bahan.eksekusi;
//kita harus memasukkan class scanner agar bisa menjalankan
import java.util.Scanner;

public class userinput {
	
	public userinput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Whats your code ?");
		
		int code = scan.nextInt();
		
		System.out.print("Welcome");
	}
}
