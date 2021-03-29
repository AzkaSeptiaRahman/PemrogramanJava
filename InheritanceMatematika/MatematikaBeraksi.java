/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 29/03/2021
   Tool : IntelliJ IDEA
*/
package InheritanceMatematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // inisialisasi Pemanggilan Method
        MatematikaCanggih call = new MatematikaCanggih();

        System.out.println("Pemanggilan Method Pertambahan");
        call.pertambahan(12.5, 28.7, 14.2);
        call.pertambahan(12, 28, 14);
        call.pertambahan(23, 34);
        call.pertambahan(3.4, 4.9);

        System.out.println("\nPemanggilan Method Pengurangan");
        call.pengurangan(12.5, 28.7, 14.2);
        call.pengurangan(12, 28, 14);
        call.pengurangan(23, 34);
        call.pengurangan(3.4, 4.9);

        System.out.println("\nPemanggilan Method Perkalian");
        call.perkalian(12.5, 28.7, 14.2);
        call.perkalian(12, 28, 14);
        call.perkalian(23, 34);
        call.perkalian(3.4, 4.9);

        System.out.println("\nPemanggilan Method Pembagian");
        call.pembagian(12.5, 28.7, 14.2);
        call.pembagian(12, 28, 14);
        call.pembagian(23, 34);
        call.pembagian(3.4, 4.9);

        System.out.println("\nPemanggilan Method Modulus");
        call.modulus(12.5, 28.7, 14.2);
        call.modulus(12, 28, 14);
        call.modulus(23, 34);
        call.modulus(3.4, 4.9);

    }
}
