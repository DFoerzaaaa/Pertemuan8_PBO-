public class Commission extends Hourly {
    private double totalSales;    // Total penjualan
    private double commissionRate;  // Tingkat komisi (dalam bentuk desimal)

    // Konstruktor yang mengambil 6 parameter
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate); // Panggil konstruktor Hourly
        this.commissionRate = commissionRate;
        totalSales = 0; // Inisialisasi total penjualan dengan 0
    }

    // Metode untuk menambahkan penjualan
    public void addSales(double totalSales) {
        this.totalSales += totalSales;
    }

    // Metode pay yang menghitung gaji berdasarkan jam kerja + komisi penjualan
    public double pay() {
        double payment = super.pay(); // Panggil metode pay dari Hourly (untuk jam kerja)
        payment += totalSales * commissionRate; // Tambahkan komisi penjualan
        totalSales = 0; // Reset total penjualan setelah pembayaran
        return payment;
    }

    // Metode toString untuk menampilkan informasi total penjualan
    public String toString() {
        String result = super.toString(); // Dapatkan string dari superclass (Hourly)
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
