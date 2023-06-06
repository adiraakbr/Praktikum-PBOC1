
/**
 * File      : LambdaMap.java		31/05/23
 * Penulis   : Adira Rahmana Akbar - 24060121140114
 * Deskripsi : Ekspresi lambda pada hashmap, digunakan untuk parameter pada method.
 *
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121130013", "Icha");
        mahasiswaMap.put("24060121140512", "Kumala");
        mahasiswaMap.put("24060121141221", "Dewi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + ": " + nama));
    }
}