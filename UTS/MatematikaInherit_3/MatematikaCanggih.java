/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 22/04/2021
   Tool : IntelliJ IDEA
*/
package UTS.MatematikaInherit_3;

public class MatematikaCanggih {
    int operasi;
    double Hitung;

    // Method Integer Dengan 2 Parameter
    void pertambahan(int a, int b) {
        operasi = a + b;
        System.out.println("Hasil Penjumlahan = " + getOperasi());
    }

    void pengurangan(int a, int b) {
        operasi = a - b;
        System.out.println("Hasil Pengurangan = " + getOperasi());
    }

    void perkalian(int a, int b) {
        operasi = a * b;
        System.out.println("Hasil Perkalian = " + getOperasi());
    }

    void pembagian(int a, int b) {
        operasi = a / b;
        System.out.println("Hasil Pembagian = " + getOperasi());
    }

    void modulus(int a, int b) {
        operasi = a % b;
        System.out.println("Hasil Modulus = " + getOperasi());
    }

    // Method Integer Dengan 3 Parameter
    void pertambahan(int a, int b, int c) {
        operasi = a + b + c;
        System.out.println("Hasil Penjumlahan = " + getOperasi());
    }

    void pengurangan(int a, int b, int c) {
        operasi = a - b - c;
        System.out.println("Hasil Pengurangan = " + getOperasi());
    }

    void perkalian(int a, int b, int c) {
        operasi = a * b * c;
        System.out.println("Hasil Perkalian = " + getOperasi());
    }

    void pembagian(int a, int b, int c) {
        operasi = a / b / c;
        System.out.println("Hasil Pembagian = " + getOperasi());
    }

    void modulus(int a, int b, int c) {
        operasi = a % b % c;
        System.out.println("Hasil Modulus = " + getOperasi());
    }

    int getOperasi() {
        return operasi;
    }
}


