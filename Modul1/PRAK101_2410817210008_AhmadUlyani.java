package Modul1;
import java.util.Scanner;

public class PRAK101_2410817210008_AhmadUlyani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        String name = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthPlace = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int birthDate = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int month = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int birthYear = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int height = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight = input.nextDouble();

        String monthName = "";
        switch (month) {
        case 1: monthName = "Januari"; break;
        case 2: monthName = "Februari"; break;
        case 3: monthName = "Maret"; break;
        case 4: monthName = "April"; break;
        case 5: monthName = "Mei"; break;
        case 6: monthName = "Juni"; break;
        case 7: monthName = "Juli"; break;
        case 8: monthName = "Agustus"; break;
        case 9: monthName = "September"; break;
        case 10: monthName = "Oktober"; break;
        case 11: monthName = "November"; break;
        case 12: monthName = "Desember"; break;
        default: monthName = "Bulan tidak valid";
        }

        System.out.print("Nama Lengkap " + name + ", Lahir di " + birthPlace +
                " pada Tanggal " + birthDate + " " + monthName + " " + birthYear +
                " Tinggi Badan " + height + " cm dan Berat Badan " + weight + " kilogram");

        input.close();
    }
}