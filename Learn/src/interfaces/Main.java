package interfaces;

import interfaces.Learn;

public class Main implements Learn {

	@Override
	public String id() {//Methode ini adalah contoh method overriding biasanya ditandai dengan @Override
		String name = "Daff";
		int code = 1705;
		System.out.print(name + " your code is "+ code);
		return "";
	}
		
		
		public static void main(String[] args) {
			
			Main Learn = new Main();
			
			System.out.print(Learn.id());
		}
}

