import java.util.Scanner;
public class ModifTugas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] data = new double[10];
        char[] keluar = new char[10];
        int i = 0;

        while (i < 10) {
            System.out.print("data ke-" + (i + 1) + ":");
            data[i] = scan.nextDouble();
            i++;
        }

        System.out.println("=====================");
        System.out.println("|  Hasil Konversi |");
        System.out.println("=====================");

        keluar = konversiNilai(data);

        // Display results
        for (i = 0; i < 10; i++) {
            System.out.println(data[i] + " " + keluar[i]);
        }
    }

    public static char[] ModifTugas(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];
        int i = 0;

        while (i < n) {
            switch (int score = (int) x[i]) {
                case int score when (score > 80 && score <= 100):
                    hasil[i] = 'A';
                    break;
                case int score when (score > 60 && score <= 80):
                    hasil[i] = 'B';
                    break;
                case int score when (score > 40 && score <= 60):
                    hasil[i] = 'C';
                    break;
                case int score when (score > 20 && score <= 40):
                    hasil[i] = 'D';
                    break;
                case int score when (score <= 20):
                    hasil[i] = 'E';
                    break;
                default:
                    System.out.println("Warning: Invalid score entered for data " + (i + 1));
            }
            i++;
        }
        return hasil;
    }
}
