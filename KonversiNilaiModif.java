import java.util.Scanner;
public class KonversiNilaiModif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] data = new double[10];
        char[] keluar = new char[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("data ke-" + (i + 1) + ":");
            data[i] = scan.nextDouble();
        }

        System.out.println("=====================");
        System.out.println("|   Hasil Konversi  |");
        System.out.println("=====================");

        keluar = konversiNilai(data);

        for (int i = 0; i < 10; i++) {
            System.out.println(data[i] + "  " + keluar[i]);
        }
    }

    public static char[] konversiNilai(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];

        for (int i = 0; i < n; i++) {
            switch ((int) Math.round(x[i])) {
                case 100:
                case 99:
                case 98:
                case 97:
                    hasil[i] = 'A';
                    break;
                case 96:
                case 95:
                case 94:
                case 93:
                    hasil[i] = 'B';
                    break;
                case 92:
                case 91:
                case 90:
                case 89:
                    hasil[i] = 'C';
                    break;
                case 88:
                case 87:
                case 86:
                case 85:
                    hasil[i] = 'D';
                    break;
                case 84:
                case 83:
                case 82:
                case 81:
                    hasil[i] = 'E';
                    break;
                default:
                    hasil[i] = 'F';
                    break;
            }
        }

        return hasil;
    }
}