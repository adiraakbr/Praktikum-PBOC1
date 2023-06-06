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