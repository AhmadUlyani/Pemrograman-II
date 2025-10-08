package Praktikum2.PRAK201_2410817210008_AhmadUlyani;

public class fruit {
    private String name;
    private double weight;
    private double price;
    private double purchaseAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public void info() {
        double priceBeforeDiscount = (purchaseAmount / weight) * price;
        double multipleDiscount = Math.floor(purchaseAmount / 4);
        double priceFourKg = (4 / weight) * price;
        double discount = multipleDiscount * 0.02 * priceFourKg * weight;
        double priceAfterDiscount = priceBeforeDiscount - discount;

        System.out.println("Nama Buah: " + getName());
        System.out.println("Berat: " + getWeight());
        System.out.println("Harga: " + getPrice());
        System.out.println("Jumlah Beli: " + getPurchaseAmount() + "kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", priceBeforeDiscount);
        System.out.printf("Total Diskon: Rp%.2f%n", discount);
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", priceAfterDiscount);

        System.out.println();
    }
}