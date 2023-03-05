/**
 * File : OperasiTitik.java 01/03/23
 * Penulis : Adira Rahmana Akbar
 * Deskripsi : Kelas yang berisi program untuk mengeksekusi/menampilkan file
 * Titik.java
 *
 */



class OperasiTitik {
    public void refleksiSumbuX(Titik titik) {
        double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
    }

    public void refleksiSumbuY(Titik titik) {
        double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
    }
}