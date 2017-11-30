import java.util.Scanner;
public class kerudung extends barang {
public void tampilkan(){

 String namabj;
 String warna;
 String ukuran;
 String user;
 String pass;
 

 Scanner key = new Scanner(System.in);

System.out.print("Enter Username : ");
	user = key.next();
	
	System.out.print("Enter Password : ");
	pass = key.next();
	
	if(user.equals("Shifa") && (pass.equals("12345"))){
	System.out.println("welcome ");
	Scanner keyboard = new Scanner(System.in);
System.out.println("Nama kerudung : ");
namabj = keyboard.next(); 
 
System.out.println("Warna Kerudung : ");
warna = keyboard.next();

System.out.println("Ukuran Kerudung : ");
ukuran = keyboard.next();

 barang m = new barang();

 m.inputData(namabj, warna, ukuran, user );
 m.tampilkandata();
	}else{
	System.out.println("Password atau Username salah ");
	System.exit(0);
	}





   
}
}