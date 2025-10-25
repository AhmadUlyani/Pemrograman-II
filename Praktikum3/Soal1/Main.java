package Praktikum3.Soal1;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dice> diceList = new LinkedList<>();
        int count = input.nextInt();
        System.out.println();

        for (int i = 0; i < count; i++) {
            Dice dice = new Dice();
            diceList.add(dice);
        }

        int total = 0;
        for (int i = 0; i < diceList.size(); i++) {
            int value = diceList.get(i).getValue();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + value);
            total += value;
        }

        System.out.println("Total nilai dadu keseluruhan: " + total);
    }
}