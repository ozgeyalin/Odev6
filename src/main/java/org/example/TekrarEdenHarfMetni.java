package org.example;

import java.util.HashSet;
import java.util.Set;

public class TekrarEdenHarfMetni {

    public static void main(String[] args) {
        String kelime1 = "merhaba";
        String kelime2 = "harabe";

        String yeniMetin = tekrarEdenHarfMetniOlustur(kelime1, kelime2);

        System.out.println("Yeni Metin: " + yeniMetin);
    }

    public static String tekrarEdenHarfMetniOlustur(String kelime1, String kelime2) {
        Set<Character> tekrarEdenHarfler = new HashSet<>();

        // İlk kelimenin harflerini kontrol et ve tekrar eden harfleri Set'e ekle
        for (char karakter : kelime1.toCharArray()) {
            if (kelime2.indexOf(karakter) != -1) {
                tekrarEdenHarfler.add(karakter);
            }
        }

        // Ayı şekilde İkinciyi kontrol eder
        for (char karakter : kelime2.toCharArray()) {
            if (kelime1.indexOf(karakter) != -1) {
                tekrarEdenHarfler.add(karakter);
            }
        }

        // Set'teki harfleri birleştirerek yeni bir metin oluşturur
        StringBuilder yeniMetinBuilder = new StringBuilder();
        for (char karakter : tekrarEdenHarfler) {
            yeniMetinBuilder.append(karakter);
        }

        return yeniMetinBuilder.toString();
    }
}