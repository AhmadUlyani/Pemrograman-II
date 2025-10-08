package Praktikum2.PRAK201_2410817210008_AhmadUlyani;

public class Soal1Main {
    public static void main(String[] args) {
        fruit apel = new fruit();
        apel.setName("Apel");
        apel.setWeight(0.4);
        apel.setPrice(7000);
        apel.setPurchaseAmount(40.0);
        apel.info();

        fruit mangga = new fruit();
        mangga.setName("Mangga");
        mangga.setWeight(0.2);
        mangga.setPrice(3500);
        mangga.setPurchaseAmount(15.0);
        mangga.info();

        fruit alpukat = new fruit();
        alpukat.setName("Alpukat");
        alpukat.setWeight(0.25);
        alpukat.setPrice(10000);
        alpukat.setPurchaseAmount(12.0);
        alpukat.info();
    }
}