import java.util.Scanner;
public class ProyekCekGanjilGenapArrayModif {
    public static boolean[] cekGanjilGenapArray(int[] x){
        boolean hasil[] = new boolean[10];
        for (int i=0;i<x.length;i++){
            if ((x[i] % 2) == 0){
                hasil[i] = true;
            }else {
                hasil[i] = false;
            }
        }
        return hasil;
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
	   boolean[] hasilCek = cekGanjilGenapArray(data);
	   System.out.println("==========================");
	   System.out.println("==Hasil Pengecekan========");
	   System.out.println("==========================");

	        for (int i = 0; i < n; i++) {
	            System.out.print(" " + data[i]);
	            System.out.print(" ");
	            if (hasilCek[i]) {
	                System.out.println("Genap");
	            } else {
	                System.out.println("Ganjil");
	            }
	        }
	  }
}
