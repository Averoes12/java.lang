package executor;
import bahan.eksekusi.Encapsulation;

public class executor{
 
	public static void main(String [] args) {
		
		Encapsulation id = new Encapsulation();
		
		id.setNama();
		id.setCode();
		
		System.out.print("Your id is " + id.getNama()+ " " + id.getCode());
	}
	
}
	
		


	


	
	 /*public void tampilWeb(){
	        System.out.println("Tampil di Monitor");
	    }
	    public void tampilMobile(){
	        System.out.println("Tampil di Handphone");
	    }
	    
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        executor lt = new executor();
	       
	        lt.tampilMobile();
	        lt.tampilWeb();
	    }*/










