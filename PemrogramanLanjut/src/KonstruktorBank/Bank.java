/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
*/


package KonstruktorBank;

public class Bank {
    int saldo,simpanUang,ambilUang;
   public Bank(int saldo){
       this.saldo = 100000;
   }
   void saldo (){
       System.out.println("Selamat Datang Di Bank Fukuoka");
       System.out.println("Saldo Anda Saat Ini : " + saldo);
       System.out.println("================================");
   }
   void simpanUang(int simpanUang){
       saldo = saldo + simpanUang;
       System.out.println("Simpan Uang : " + simpanUang);
       System.out.println("Saldo Anda Saat Ini : " + saldo);
       System.out.println("================================");
   }
   void ambilUang(int ambilUang){
       saldo = saldo - ambilUang;
       System.out.println("Ambil Uang : " + ambilUang);
       System.out.println("Saldo Anda Saat Ini : " + saldo);
       System.out.println("================================");
   }
   int getsaldo(){
       return saldo;
   }

}
