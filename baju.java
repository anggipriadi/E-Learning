import java.util.Scanner;
public class baju extends barang {
public void tampilkan(){
 
 String namabj;
 String warna;
 String ukuran;
 String user;
 

 Scanner keyboard = new Scanner(System.in);

System.out.println("Nama anda= ");
user = keyboard.next(); 

System.out.println("Nama Baju= ");
namabj = keyboard.next(); 
 
System.out.println("Warna Baju= ");
warna = keyboard.next();

System.out.println("Ukuran Baju= ");
ukuran = keyboard.next();

 barang m = new barang();

 m.inputData(namabj, warna, ukuran, user );
 m.tampilkandata();

   
}    
}