/*
 * File : MapTest.java
 * Penulis : Adira Rahmana Akbar - 24060121140114 17/05/2023
 * Deskripsi : Program penggunaan objek ArrayList sebagai collection class
 */

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();
        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
    }
}