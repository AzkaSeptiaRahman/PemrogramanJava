/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 22/04/2021
   Tool : IntelliJ IDEA
*/
package UTS.MatematikaInherit_3;

public class MatematikaCanggihBanget extends MatematikaCanggih {
    void Penjumlahan4angka (int a, int b, int c, int d){
        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + (a+b+c+d) );
    }
    void Pengurangan4angka (int a, int b, int c, int d){
        System.out.println(a + " - " + b + " - " + c + " - " + d + " = " + (a-b-c-d) );
    }
    void Perkalian4angka (int a, int b, int c, int d){
        System.out.println(a + " * " + b + " * " + c + " * " + d + " = " + (a*b*c*d) );
    }
    void Pembagian4angka (int a, int b, int c, int d) {
        System.out.println(a + " / " + b + " / " + c + " / " + d + " = " + (a / b / c / d));
    }
    void modulus4angka (int a, int b, int c, int d) {
        System.out.println(a + " % " + b + " % " + c + " % " + d + " = " + (a % b % c % d));
    }

}