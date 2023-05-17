/*
 * File : MapTest.java
 * Penulis : Adira Rahmana Akbar - 24060121140114 17/05/2023
 * Deskripsi : kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric<T1 extends BangunDatar> {
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T1 get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}

// Jika kita mengganti kemunculan 'T' menjadi karakter lain seperti 'T1', maka
// kita harus secara konsisten mengganti segala kemunculan 'T'. Hal tersebut
// akan mempengaruhi deklarasi kelas, metode, variabel, dan parameter
// yang menggunakan parameter tipe generik. Selain itu, semua penggunaan 'T'
// dalam parameter metode, variabel lokal, dan
// pemanggilan metode juga harus diganti dengan karakter baru seperti 'T1' atau
// lainnya sesuai dengan perubahan yang kita lakukan.
// Pergantian tersebut perlu dilakukan secara konsisten agar tidak terjadi
// kesalahan dalam program.