/**
 * File : DiskonLambda.java 31/05/23
 * Penulis : Adira Rahmana Akbar - 24060121140114
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk mengitung diskon.
 *
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // dengan lambda dengan blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: " + diskonMerdeka.hitungDiskon(50000));
        System.out.println("Diskon Lebaran: " + diskonLebaran.hitungDiskon(35000));
        System.out.println("Diskon Biasa: " + diskonBiasa.hitungDiskon(25000));
    }
}

/* Pada implementasi diskon lebaran, (harga) -> harga - (harga * 0.4) adalah ekspresi lambda 
* yang menerima argumen harga dan mengembalikan hasil dari pengurangan diskon 40% dari harga.
* Pada implementasi diskon biasa, (harga) -> { return harga - (harga * 0.1); } adalah ekspresi 
* lambda yang juga menerima argumen harga, tetapi memiliki blok pernyataan yang lebih kompleks. 
* Blok pernyataan ini digunakan untuk menghitung diskon 10% dari harga dan mengembalikan hasilnya.
* Perbedaan antara keduanya terletak pada cara penulisannya. DiskonLebaran menggunakan ekspresi 
* lambda tunggal tanpa blok pernyataan, sedangkan DiskonBiasa menggunakan ekspresi lambda dengan blok pernyataan.
*/
