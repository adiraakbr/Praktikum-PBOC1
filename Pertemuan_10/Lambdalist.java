
/**
 * File      : Lambdalist.java		31/05/23
 * Penulis   : Adira Rahmana Akbar - 24060121140114
 * Deskripsi : Implementasi lambda pada list, digunakan sebagai parameter pada method.
 *
 */

import java.util.ArrayList;

public class Lambdalist {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Yoru");
        mahasiswaList.add("Icha");
        mahasiswaList.add("Mansur");
        mahasiswaList.add("Cecep");

        // lambda digunakan sebagai parameter pada method
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}