package inheritance;

class ParentClass {

	String ayah() {
		System.out.println("Ayah");
		return "";
	}
	
	 String ibu() {
		System.out.println("Ibu");
		
		return "";
	}
	
	void nama() {
		
	}
}

	public class ChildClass extends ParentClass  {
		
		@Override
		public String ayah() {
			System.out.println("Ayah : 'I'm in Child Class'");
			
			return "";
		}
		
		public String ibu() {
			
			System.out.print("Ibu : 'i'm in Child Class'");
			
			return "";
		}
		
	
		public static void main(String[] args) {
				
				ParentClass ayah = new ParentClass();
				ParentClass ibu = new ChildClass();// ini adalah contoh polimorphism (perubahan bentuk )
				
				ayah.ayah();
				ibu.ibu();			}
				
		}

/*Kita tidak bisa meng over pada method yang acces modifier nya static,kita bisa menambahkan acces modifier private pada method.
 */

