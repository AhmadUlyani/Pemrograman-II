package Modul1;
import java.util.Scanner;

public class Soal5 {
    public static final double phi = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double volume = phi * jariJari * jariJari * tinggi;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan tinggi %.1f cm adalah %.3f cm3", jariJari, tinggi, volume);

        input.close();
    }
}