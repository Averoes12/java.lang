package bahan.eksekusi;

public class Encapsulation {

		//kita akan membuat sebuah class encapsulation dimana class tersebut hanya bisa diakses tanpa dirubah
		//pertama kita buat private objek
    private String name = "Daff";
    private int code = 1705;

    //lalu kita buat public method

    public String getNama(){//


        return name;
    }

    public int getCode() {

        return code;
    }

    public  void setNama() {

        this.name = name;
    }

    public void	 setCode() {

        this.code =code;
    }
}

