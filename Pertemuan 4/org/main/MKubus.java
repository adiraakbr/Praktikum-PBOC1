/**
 * File : MKubus.java 15/03/23
 * Penulis : Adira Rahmana Akbar
 * Deskripsi : Driver class untuk BujurSangkar dan Kubus
 *
 */

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas alas kubus: " + kubus.hitungLuasAlas());
        System.out.println("Volume kubus: " + kubus.hitungVolume());
    }
}