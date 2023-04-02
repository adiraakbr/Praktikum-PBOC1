/**
 * File : BangunDatar.java 25/03/23
 * Penulis : Adira Rahmana Akbar
 * Deskripsi : Kelas abstrak, berisi abstraksi bangun datar
 *  * 
 *  
 */

public abstract class BangunDatar {
	protected double luas;

	public abstract double hitungLuas(double sisi); // pada interface hanya bisa seperti ini

	public void setLuas(double luas) { // tidak bisa pada diinterface karena implementasi
		this.luas = luas;
	}

	public double getLuas() { // tidak bisa pada diinterface karena implementasi
		return luas;
	}
}