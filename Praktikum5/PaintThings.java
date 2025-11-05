package Praktikum5;
import java.util.Locale;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;

        double deckAmt, ballAmt, tankAmt;
        deck = new Rectangle(20.0, 30.0);
        bigBall = new Sphere(15.0);
        tank = new Cylinder(10.0, 30.0);

        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        System.out.println("\nNumber of gallons of paint needed...");
        System.out.printf(Locale.US,"Deck %.1f%n", deckAmt);
        System.out.printf(Locale.US,"Big Ball %.1f%n", ballAmt);
        System.out.printf(Locale.US, "Tank %.1f%n", tankAmt);
    }
}
