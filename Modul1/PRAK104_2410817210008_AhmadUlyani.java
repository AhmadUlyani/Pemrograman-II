package Modul1;
import java.util.Scanner;

public class PRAK104_2410817210008_AhmadUlyani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] abuHands = input.nextLine().split(" ");

        System.out.print("Tangan Bagas: ");
        String[] bagasHands = input.nextLine().split(" ");

        int skorAbu = 0;
        int skorBagas = 0;

        for (int i = 0; i < 3; i++){
            String abuChoose = abuHands[i];
            String bagasChoose = bagasHands[i];

            if ((abuChoose.equals("B") && bagasChoose.equals("G")) ||
                    (abuChoose.equals("G") && bagasChoose.equals("K")) ||
                    (abuChoose.equals("K") && bagasChoose.equals("B"))) {
                skorAbu++;
            }
            else if ((bagasChoose.equals("B") && abuChoose.equals("G")) ||
                    (bagasChoose.equals("G") && abuChoose.equals("K")) ||
                    (bagasChoose.equals("K") && abuChoose.equals("B"))) {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.print("\nAbu");
        } else if (skorBagas > skorAbu) {
            System.out.print("\nBagas");
        } else {
            System.out.print("\nSeri");
        }

        input.close();
    }
}