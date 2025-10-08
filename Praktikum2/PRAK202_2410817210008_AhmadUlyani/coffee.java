package Praktikum2.PRAK202_2410817210008_AhmadUlyani;

public class coffee {
    private String coffeeName;
    private String size;
    private double price;
    private String buyer;

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public double getTax() {
        return price * 0.11;
    }

    public void info() {
        System.out.println("Nama Kopi: " + getCoffeeName());
        System.out.println("Ukuran: " + getSize());
        System.out.println("Harga: Rp. " + getPrice());
        System.out.println("Pembeli Kopi: " + getBuyer());
        System.out.printf("Pajak Kopi: Rp. %.1f%n", getTax());
        System.out.println();
    }
}