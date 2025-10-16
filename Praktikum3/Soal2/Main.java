package Praktikum3.Soal2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis hewan yang ingin diinputkan: ");
        System.out.println("1. Kucing");
        System.out.println("2. Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = input.nextInt();
        input.nextLine();

        if (choice == 1){
            System.out.print("Nama hewan peliharaan: ");
            String name = input.nextLine();
            System.out.print("Ras: ");
            String race = input.nextLine();
            System.out.print("Warna bulu: ");
            String furColor = input.nextLine();
            Cat cat = new Cat(name, race, furColor);
            cat.displayCatDetail();

        } else if (choice == 2){
            System.out.print("Nama hewan peliharaan: ");
            String name = input.nextLine();
            System.out.print("Ras: ");
            String race = input.nextLine();
            System.out.print("Warna bulu: ");
            String furColor = input.nextLine();
            System.out.print("Kemampuan: ");
            String ability = input.nextLine();
            Dog dog = new Dog(name, race, furColor, ability);
            dog.displayDogDetail();

        } else {
            System.out.println("Pilihan tidak valid");
        }
        input.close();
    }
}