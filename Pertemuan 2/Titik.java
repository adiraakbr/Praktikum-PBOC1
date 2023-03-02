/**
 * File : Titik.java 22/02/23
 * Penulis : Adira Rahmana Akbar
 * Deskripsi : Kelas yang berisi implementasi titik absis dan ordinat
 *
 */

class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik; // untuk menghitung objek titik yang sudah ada

	public Titik(double a, double o) {
		counterTitik++;
		absis = a;
		ordinat = o;
	}

	public Titik() {
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}

	public void setAbsis(double a) {
		absis = a;
	}

	public void setOrdinat(double o) {
		ordinat = o;
	}

	public double getAbsis() {
		return absis;
	}

	public double getOrdinat() {
		return ordinat;
	}

	public int getCounterTitik() {
		return counterTitik;
	}
}