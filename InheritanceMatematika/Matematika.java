/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 27/03/2021
   Tool : IntelliJ IDEA
*/
package InheritanceMatematika;

public class Matematika {
    int operasi;

    // Method Pertambahan
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

    int getOperasi(){
        return operasi;
    }
}



