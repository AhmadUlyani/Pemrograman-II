package Praktikum4.Soal2;

public class Cat extends Pet{
    private String furColor;

    public Cat(String n, String r, String c){
        super(n,r);
        this.furColor = c;
    }

    public void displayCatDetail(){
        super.display();
        System.out.println("Memiliki warna bulu: " + this.furColor);
    }
}
