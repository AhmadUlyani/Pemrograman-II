package Praktikum4.Soal2;

public class Pet {
    private String name;
    private String race;

    public Pet(String name, String race){
        this.name = name;
        this.race = race;
    }

    public void display(){
        System.out.println();
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah: " + this.name);
        System.out.println("Dengan ras: " + this.race);
    }
}