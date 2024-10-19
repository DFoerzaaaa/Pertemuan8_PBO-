public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Metode abstrak untuk menghitung luas
    public abstract double area();

    // Mengembalikan nama bentuk
    @Override
    public String toString() {
        return shapeName;
    }
}
