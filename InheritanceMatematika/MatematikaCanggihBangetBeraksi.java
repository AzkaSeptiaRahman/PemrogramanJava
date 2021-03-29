/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 29/03/2021
   Tool : IntelliJ IDEA
*/
package InheritanceMatematika;

public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        Matematika getHasil = new Matematika();
        MatematikaCanggih getHasil1 = new MatematikaCanggih();
        MatematikaCanggihBanget getHasil2 = new MatematikaCanggihBanget();

        getHasil.pertambahan(20,20);
        getHasil.perkalian(20,10);
        getHasil1.modulus(9,2);
        getHasil2.PertambahanTiga(10,20,30);
    }
}
