/**
  * File		: Titik.java  	22/02/23
  * Penulis		: Adira Rahmana Akbar
  * Deskripsi 	: Kelas yang berisi implementasi titik absis dan ordinat
  *
  */


class Titik{
		double absis;
		double ordinat;
		static int counterTitik; //untuk menghitung objek titik yang sudah ada
		Titik(double a, double o){
				counterTitik++;
				absis = a;
				ordinat = o;
		}
		Titik(){
			counterTitik++;
			absis = 0;
			ordinat = 0;
		}
		void setAbsis(double a){
				absis = a;
		}
		void setOrdinat(double o){
				ordinat = o;
		}
		double getAbsis(){
				return absis;
		}
		double getOrdinat(){
				return ordinat;
		}
		int getCounterTitik(){
				return counterTitik;
		}
}