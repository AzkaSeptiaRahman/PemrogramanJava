package Matematika_Parameter;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika getNilai = new Matematika();

        getNilai.pertambahan(20,20);
        System.out.println("Pertambahan: 20 + 20 = " + getNilai.getOperasi());

        getNilai.pengurangan(10,5);
        System.out.println("Pengurangan: 10 - 5 = " + getNilai.getOperasi());

        getNilai.perkalian(10,20);
        System.out.println("Perkalian: 10*20 = " + getNilai.getOperasi());

        getNilai.pembagian(21,2);
        System.out.println("Pembagian: 21/2 = " + getNilai.getOperasi());

    }
}
