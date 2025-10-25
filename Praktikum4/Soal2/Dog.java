package Praktikum4.Soal2;

public class Dog extends Pet{
    private String furColor;
    private String ability;

    public Dog(String n, String r, String c, String a){
        super(n, r);
        this.furColor = c;
        this.ability = a;
    }

    public void displayDogDetail(){
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);
        System.out.println("Memiliki kemampuan: " + this.ability);
    }
}