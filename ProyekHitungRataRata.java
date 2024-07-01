import java.util.Scanner;
public class ProyekHitungRataRata {
    public static double hitungRataRata(int[] x) {
        int jumlah = hitungJumlah(x);
        double rataRata = (double) jumlah / x.length;
        return rataRata;
    }
    public static int hitungJumlah(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Masukkan jumlah data (n): ");
        n = scan.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data ke-" + (i + 1) + ":");
            data[i] = scan.nextInt();
        }
        double rataRata = hitungRataRata(data);
        System.out.println("Rata-rata data = " + rataRata);
    }
}
