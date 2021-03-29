/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 29/03/2021
   Tool : IntelliJ IDEA
*/
package InheritanceMatematika;

public class Matematika {
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

    // Method Integer Dengan 3 Parameter
    void pertambahan(int a, int b,int c) {
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

    int getOperasi() {
        return operasi;
    }

    // Method Double Dengan 2 Parameter
    void pertambahan(double a, double b) {
        Hitung = a + b;
        System.out.println("Hasil Penjumlahan = " + getHitung());
    }

    void pengurangan(double a, double b) {
        Hitung = a - b;
        System.out.println("Hasil Pengurangan = " + getHitung());
    }

    void perkalian(double a, double b) {
        Hitung = a * b;
        System.out.println("Hasil Perkalian = " + getHitung());
    }

    void pembagian(double a, double b) {
        Hitung = a / b;
        System.out.println("Hasil Pembagian = " + getHitung());
    }

    // Method Double Dengan 3 Parameter
    void pertambahan(double a, double b, double c) {
        Hitung = a + b + c;
        System.out.println("Hasil Penjumlahan = " + getHitung());
    }

    void pengurangan(double a, double b, double c) {
        Hitung = a - b - c;
        System.out.println("Hasil Pengurangan = " + getHitung());
    }

    void perkalian(double a, double b, double c) {
        Hitung = a * b * c;
        System.out.println("Hasil Perkalian = " + getHitung());
    }

    void pembagian(double a, double b, double c) {
        Hitung = a / b / c;
        System.out.println("Hasil Pembagian = " + getHitung());
    }
    double getHitung() {
        return Hitung;
    }
}



