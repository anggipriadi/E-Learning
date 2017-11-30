public class barang 
{
 private String namabj;
 private String warna;
 private String ukuran;
 private String user;
    
	
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
	
	public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
   
    public String getNama() {
        return namabj;
    }

    public void setNama(String namabj) {
        this.namabj = namabj;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
 public void tampilkandata(){
		System.out.println("Nama  :"+getUser());
        System.out.println("Nama Barang :"+getNama());
        System.out.println("warna  :"+getWarna());
        System.out.println("Ukuran  :"+getUkuran());

        
 }
 public void inputData(String m,String w,String j, String n){
     setNama(m);
     setWarna(w);
     setUkuran(j);
	setUser(n);
          
 }
}
