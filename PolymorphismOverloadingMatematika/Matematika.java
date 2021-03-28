/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 27/03/2021
   Tool : IntelliJ IDEA
*/
package PolymorphismOverloadingMatematika;

public class Matematika {
    int operasi;
    double Hitung;

    // Method Operasi Matematika
    void pertambahan (int a, int b){
        operasi = a + b;
        System.out.println("Hasil Penjumlahan = "+ getOperasi());
    }
    void pengurangan (int a, int b){
        operasi = a - b;
        System.out.println("Hasil Pengurangan = "+ getOperasi());
    }
    void perkalian (int a, int b){
        operasi = a * b;
        System.out.println("Hasil Perkalian = "+ getOperasi());
    }
    void pembagian (int a, int b){
        operasi = a / b ;
        System.out.println("Hasil Pembagian = "+ getOperasi());
    }
    void modulus (int a, int b) {
        operasi = a % b;
        System.out.println("Hasil Modulus = " + getOperasi());
    }

        int getOperasi(){
        return operasi;
    }

    // Method Overloading Dengan 3 Parameter
    void pertambahan (double a, double b, double c){
        Hitung = a + b + c;
        System.out.println("Hasil Penjumlahan = "+ getHitung());
    }
    void pengurangan (double a, double b, double c){
        Hitung = a - b - c;
        System.out.println("Hasil Pengurangan = "+ getHitung());
    }
    void perkalian (double a, double b, double c){
        Hitung = a * b * c;
        System.out.println("Hasil Perkalian = "+ getHitung());
    }
    void pembagian (double a, double b, double c){
        Hitung = a / b / c;
        System.out.println("Hasil Pembagian = "+ getHitung());
    }
    void modulus (double a, double b, double c) {
        Hitung = a % b % c;
        System.out.println("Hasil Modulus = " + getHitung());
    }

    double getHitung(){
        return Hitung;
    }

}



