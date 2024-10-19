public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        // Menghitung jumlah cat yang dibutuhkan: luas bentuk / cakupan cat
        return s.area() / coverage;
    }
}
