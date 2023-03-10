/**
  * File		: MTitik.java  	22/02/23
  * Penulis		: Adira Rahmana Akbar
  * Deskripsi 	: Kelas yang berisi program untuk mengeksekusi/menampilkan file Titik.java
  *
  */


class MTitik{
	public static void main(String[] args){
		Titik t1;
		Titik t2;
		Titik t3;
		
		t1 = new Titik();
		t1.setAbsis(1);
		t1.setOrdinat(2);
		
		t3 = new Titik(5,6);
		
		System.out.println("Absis dari t1 adalah "+ t1.getAbsis());
		System.out.println("Ordinat dari t1 adalah "+ t1.getOrdinat());
		System.out.println("Jumlah objek titik adalah "+ t1.getCounterTitik());
		System.out.println("Absis dari t3 adalah "+ t3.getAbsis() + " Ordinat dari t3 adalah "+ t3.getOrdinat());
	}
}