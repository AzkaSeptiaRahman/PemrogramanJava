package KonstruktorBank;

public class BankBeraksi {
    public static void main(String[] args) {
        Bank Fukuoka = new Bank(100000);
        Fukuoka.saldo();
        Fukuoka.simpanUang(500000);
        Fukuoka.ambilUang(150000);

    }
}
