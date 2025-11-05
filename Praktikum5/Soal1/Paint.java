package Praktikum5.Soal1;

public class Paint {
    private Double coverage;

    public Paint(Double c){
        this.coverage = c;
    }

    public Double amount(Shape s){
        System.out.println("Computing amount for " + s);
        return s.area() / coverage;
    }
}
