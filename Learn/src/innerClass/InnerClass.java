package innerClass;



	class outer {
		
		private String brand = "SevenCloth";
	
	class inner {
			
			void brand() {
				System.out.println("Brand Baju : " + brand);
			}
		}
		
	void show() {
		inner show = new inner();
		show.brand();
		//kita membuat objek punya class inner  di class outer agar class inner bisa di akses di main class
	}
}
	public class InnerClass {
		
		public static void main(String[] args) {//dan sekarang kita bisa mengakses class inner di class main
			
			outer show = new outer();
			
			show.show();
	}
}
	


