package Praktikum4.Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama hewan peliharaan: ");
        String nama = input.nextLine();
        System.out.print("Ras: ");
        String race = input.nextLine();

        Pet myPet = new Pet(nama, race);
        myPet.display();
    }
}