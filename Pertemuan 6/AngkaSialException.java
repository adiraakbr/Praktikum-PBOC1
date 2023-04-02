/*
 * File : AngkaSialException.java
 * Penulis : Adira Rahmana Akbar 31/03/23
 * Deskripsi : Eksepsi buatan sendiri, menolak angka 4!
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("jangan memasukkan angka 4 karena angka sial!!");
    }
}
