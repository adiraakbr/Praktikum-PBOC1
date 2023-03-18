/**
 * File : Poligon.java 15/03/23
 * Penulis : Adira Rahmana Akbar
 * Deskripsi : Representasi dasar dari objek poligon 
 *
 */

package org.poligon;

public class Poligon {
	protected int jumlahSisi;

	public Poligon() {
		this.jumlahSisi = 0;
	}

	public void setJumlahSisi(int jumlahSisi) {
		this.jumlahSisi = jumlahSisi;
	}

	public int getJumlahSisis() {
		return this.jumlahSisi;
	}
}