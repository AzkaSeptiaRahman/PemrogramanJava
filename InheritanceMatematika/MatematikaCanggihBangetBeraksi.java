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
