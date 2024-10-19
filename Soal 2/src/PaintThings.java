import java.text.DecimalFormat;

public class PaintThings {
    public static void main(String[] args) {
        final double COVERAGE = 350; // Cakupan cat per unit luas
        Paint paint = new Paint(COVERAGE);

        // Membuat objek bentuk
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        // Menghitung jumlah cat yang dibutuhkan
        double deckAmt = paint.amount(deck);    // Menghitung jumlah cat untuk deck
        double ballAmt = paint.amount(bigBall);  // Menghitung jumlah cat untuk bigBall
        double tankAmt = paint.amount(tank);     // Menghitung jumlah cat untuk tank

        // Format hasil menjadi 1 desimal
        DecimalFormat fmt = new DecimalFormat("0.#");

        // Menampilkan hasil
        System.out.println("\nNumber of gallons of paint needed ....");
        System.out.println("Deck: " + fmt.format(deckAmt));
        System.out.println("Big Ball: " + fmt.format(ballAmt));
        System.out.println("Tank: " + fmt.format(tankAmt));
    }
}
