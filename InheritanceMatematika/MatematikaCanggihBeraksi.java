/* Nama : Azka Septia Rahman
   NIM  : 11200930000013
   Waktu Penyelesaian : 29/03/2021
   Tool : IntelliJ IDEA
*/
package InheritanceMatematika;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        Matematika getNilai = new Matematika();
        MatematikaCanggih getNilai1 = new MatematikaCanggih();

        getNilai.pertambahan(20,20);

        getNilai.perkalian(10,20);

        getNilai1.modulus(9,2);
    }
}
