package Modul1;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan input: ");
        int start = input.nextInt();

        int count = 0;
        int n = start;

        while (count < 11) {
            int output;
            if (n % 5 == 0) {
                output = (n / 5) - 1;
            } else {
                output = n;
            }
            System.out.print(output);
            if (count < 10) {
                System.out.print(", ");
            }
            n++;
            count++;
        }

        input.close();
    }
}
