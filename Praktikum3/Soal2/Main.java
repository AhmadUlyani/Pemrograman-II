package Praktikum3.Soal2;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "Januari");
        monthMap.put(2, "Februari");
        monthMap.put(3, "Maret");
        monthMap.put(4, "April");
        monthMap.put(5, "Mei");
        monthMap.put(6, "Juni");
        monthMap.put(7, "Juli");
        monthMap.put(8, "Agustus");
        monthMap.put(9, "September");
        monthMap.put(10, "Oktober");
        monthMap.put(11, "November");
        monthMap.put(12, "Desember");

        LinkedList<Country> countryList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfCountries = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCountries; i++) {
            String name = scanner.nextLine();
            String leadershipType = scanner.nextLine();
            String leaderName = scanner.nextLine();
            Country newCountry;

            if (leadershipType.equalsIgnoreCase("monarki")) {
                newCountry = new Country(name, leadershipType, leaderName);
            } else {
                int day = Integer.parseInt(scanner.nextLine());
                int month = Integer.parseInt(scanner.nextLine());
                int year = Integer.parseInt(scanner.nextLine());
                newCountry = new Country(name, leadershipType, leaderName, day, month, year);
            }
            countryList.add(newCountry);
        }

        System.out.println();
        for (int i = 0; i < countryList.size(); i++) {
            Country country = countryList.get(i);
            country.displayInfo(monthMap);
            if (i < countryList.size() - 1) {
                System.out.println();
            }
        }

        scanner.close();
    }
}