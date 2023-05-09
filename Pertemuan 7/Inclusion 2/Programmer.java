/**
 * File      : Programmer.java		03/05/23
 * Penulis   : Adira Rahmana Akbar - 24060121140114
 * Deskripsi : Programmer.java adalah kelas yang berisi metode untuk mencetak nama dan gaji pegawai
 * 
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        super.setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}