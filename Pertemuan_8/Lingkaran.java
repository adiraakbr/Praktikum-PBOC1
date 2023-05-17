/*
 * File : Lingkaran.java
 * Penulis : Adira Rahmana Akbar - 24060121140114 17/05/2023
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}