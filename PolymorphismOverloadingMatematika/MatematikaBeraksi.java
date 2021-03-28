package PolymorphismOverloadingMatematika;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // inisialisasi Pemanggilan Method
        Matematika call = new Matematika();

        // Pemanggilan Method Dengan 2 Parameter
        call.pertambahan(20,20);
        call.pengurangan(10,5);
        call.perkalian(10,20);
        call.pembagian(21, 2);
        call.modulus(9,2);

        // Pemanggilan Method pada Class Matematika dengan 3 parameter
        System.out.println("\nPemanggilan Method Class Matematika dengan 3 Parameter");
        call.pertambahan(12.5, 28.7, 14.2);
        call.pengurangan(12.5, 28.7, 14.2);
        call.perkalian(12.5, 28.7, 14.2);
        call.pembagian(12.5, 28.7, 14.2);
        call.modulus(12.5, 28.7, 14.2);




    }
}
