/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 27/03/2021
   Tool : IntelliJ IDEA
*/
package InheritanceMatematika;

public class MatematikaCanggih extends Matematika {
    // Method Integer Dengan 2 Parameter
    void modulus (int a, int b){
        operasi = a % b;
        System.out.println("Hasil Modulus = "+ getOperasi());
    }
    // Method Double Dengan 3 Parameter
    void modulus (double a, double b, double c) {
        Hitung = a % b % c;
        System.out.println("Hasil Modulus = " + getHitung());
    }


}
