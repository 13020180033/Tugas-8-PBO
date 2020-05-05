package no1;

public class mahasiswa {
 String nama;
 String alamat;
 public mahasiswa(String nama,String alamat){
  this.nama=nama;
  this.alamat=alamat;
  System.out.println("Nama  : "+nama);
  System.out.println("Alamat: "+alamat);
 }
 
 public static void main(String[] args) {
  mahasiswa mhs=new mahasiswa("Azhar","Makassar");
 }
}