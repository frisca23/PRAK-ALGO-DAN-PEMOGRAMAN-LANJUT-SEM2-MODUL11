import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        double angkaPertama = input.nextDouble();

        System.out.println("Masukkan angka kedua: ");
        double angkaKedua = input.nextDouble();

        System.out.println("Pilih operator (+, -, *, /, %):");
        char operator = input.next().charAt(0);

        double hasil; // hasil = hasil

        switch (operator) {
            case '+':
                hasil = angkaPertama + angkaKedua;
                System.out.println("Jumlahnya adalah = " + hasil);
                break;
            case '-':
                hasil = angkaPertama - angkaKedua;
                System.out.println("Selisihnya adalah = " + hasil);
                break;
            case '*':
                hasil = angkaPertama * angkaKedua;
                System.out.println("Hasil perkaliannya adalah = " + hasil);
                break;
            case '/':
                hasil = angkaPertama / angkaKedua;
                System.out.println("Hasil baginya adalah = " + hasil);
                break;
            case '%':
                hasil = angkaPertama % angkaKedua;
                System.out.println("Sisa pembagiannya adalah = " + hasil);
                break;
            default:
                System.out.println("Kesalahan! Operator tidak dikenali");
                break;
        }
    }
}
