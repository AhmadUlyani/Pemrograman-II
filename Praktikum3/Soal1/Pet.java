package Praktikum3.Soal1;

public class Pet {
    private String name;
    private String race;

    public Pet(String n, String r) {
        this.name = n;
        this.race = r;
    }

    public void display() {
        System.out.println();
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + this.name);
        System.out.println("Dengan ras: " + this.race);
    }
}