
/**
 * File      : MLingkaran.java		25/03/23
 * Penulis   : Adira Rahmana Akbar
 * Deskripsi : Implementasi cara menghtiung luas lingkaran
 * 
 */
import java.util.Scanner;

public class MLingkaran {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan jejari lingkaran: ");
		double jejari = scan.nextDouble();
		scan.close();

		Lingkaran l = new Lingkaran(jejari);
		System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
	}
}
