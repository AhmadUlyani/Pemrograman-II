package Modul1;
import java.util.Scanner;

public class PRAK103_2410817210008_AhmadUlyani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan input: ");
        int n = input.nextInt();
        int start = input.nextInt();

        int count = 0;
        do {
            if(start % 2 != 0){
                if (count > 0){
                    System.out.print(", ");
                }
                System.out.print(start);
                count++;
            }
            start++;
        } while (count < n);

        input.close();
    }
}