/**
 * File      : PegawaiDanGaji.java		03/05/23
 * Penulis   : Adira Rahmana Akbar - 24060121140114
 * Deskripsi : Main class dari untuk mencetak nama dan gaji pegawai
 * 
 */

public class PegawaiDanGaji {
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}