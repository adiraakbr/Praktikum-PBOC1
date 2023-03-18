/**
 * File : BujurSangkar.java 15/03/2023
 * Penulis : Adira Rahmana Akbar
 * Deskripsi : representasi dari objek bujur sangkar
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
    private double panjangSisi;

    public BujurSangkar(double panjangSisi) {
        this.panjangSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() {
        return panjangSisi;
    }
}
