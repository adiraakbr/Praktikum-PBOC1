/**
 * File : MOperasiTitik.java 01/03/23
 * Penulis : Adira Rahmana Akbar
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 * Titik.java
 *
 */


public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4,0);
		OperasiTitik o = new OperasiTitik();
		
		System.out.println("Titik: ("+t.getAbsis()+","+t.getOrdinat()+")");
		
		o.refleksiX(t);
		System.out.println("Titik: ("+t.getAbsis()+","+t.getOrdinat()+")");
		
		o.refleksiY(t); 
		System.out.println("Titik: ("+t.getAbsis()+","+t.getOrdinat()+")");
	}

}
