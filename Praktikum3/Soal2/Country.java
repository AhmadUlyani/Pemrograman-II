package Praktikum3.Soal2;
import java.util.HashMap;

public class Country {
    private String name;
    private String leadershipType;
    private String leaderName;
    private int independenceDay;
    private int independenceMonth;
    private int independenceYear;
    private boolean isMonarchy;

    public Country(String name, String leadershipType, String leaderName, int day, int month, int year) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.independenceDay = day;
        this.independenceMonth = month;
        this.independenceYear = year;
        this.isMonarchy = false;
    }

    public Country(String name, String leadershipType, String leaderName) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.isMonarchy = true;
    }

    public void displayInfo(HashMap<Integer, String> monthMap) {
        String title = "";
        if (this.leadershipType.equalsIgnoreCase("monarki")) {
            title = "Raja";
        } else if (this.leadershipType.equalsIgnoreCase("presiden")) {
            title = "Presiden";
        } else if (this.leadershipType.equalsIgnoreCase("perdana menteri")) {
            title = "Perdana Menteri";
        } else {
            title = this.leadershipType;
        }

        System.out.println("Negara " + this.name + " mempunyai " + title + " bernama " + this.leaderName);

        if (!this.isMonarchy) {
            String monthName = monthMap.get(this.independenceMonth);
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + this.independenceDay + " " + monthName + " " + this.independenceYear);
        }
    }
}