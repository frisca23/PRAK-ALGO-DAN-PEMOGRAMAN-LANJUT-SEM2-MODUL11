import java.util.Scanner;
public class ProyekIterasiFungsiModif {
    public static void cetakUlang(String kalimat, int nUlang) {
        for (int i = 0; i < nUlang; i++) {
            System.out.println(kalimat);
        }
    }
    public static void main(String[] args) {
        int nUlang;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kalimat yang ingin dicetak: ");
        String kalimat = scan.nextLine();

        System.out.print("Akan dicetak berapa kali: ");
        nUlang = scan.nextInt();

        cetakUlang(kalimat, nUlang);
    }
}