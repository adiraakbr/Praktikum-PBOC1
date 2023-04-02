/**
 * File      : IArea.java		25/03/23
 * Penulis   : Adira Rahmana Akbar 
 * Deskripsi : Kelas implementasi IArea berupada cara menghitung luas lingkaran
 * 
 */

//mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea {
	private double jejari;

	public Lingkaran(double jejari) {
		this.jejari = jejari;
	}

	public double hitungLuas() {
		return PI * jejari * jejari;
	}
}
