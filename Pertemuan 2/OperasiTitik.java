/**
 * File : OperasiTitik.java 01/03/23
 * Penulis : Adira Rahmana Akbar
 * Deskripsi : Kelas yang berisi program untuk mengeksekusi/menampilkan file
 * Titik.java
 *
 */



class OperasiTitik {
    private void refleksiSumbuX(Titik titik) {
        double y;
	   y = titik.getOrdinat();
	   y *= -1;
	   titik.setOrdinat(y);
    }

    private void refleksiSumbuY(Titik titik) {
        double x;
	   x = titik.getAbsis();
	   x *= -1;
	   titik.setAbsis(x);
    }
    public Titik refleksiX(Titik titik) {
	   refleksiSumbuX(titik);
	   return titik;
    }

    public Titik refleksiY(Titik titik) {
	   refleksiSumbuY(titik);
	   return titik;
    }
}
