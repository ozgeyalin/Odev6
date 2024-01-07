package org.example;

import java.util.HashSet;
import java.util.Set;

public class TekrarlayanKarakter {

    public static void main(String[] args) {
        String[] metinDizisi = {"merhaba", "harabe", "bahar", "haber", "ambar"};

        String yeniMetin = TekrarlayanKarakter(metinDizisi);

        System.out.println("Yeni Metin: " + yeniMetin);
    }

    public static String TekrarlayanKarakter(String[] metinDizisi) {

        if (metinDizisi.length < 2) {
            System.out.println("Dizide en az iki metin olmalıdır.");
            return "";
        }

        String metin1 = metinDizisi[0];
        String metin2 = metinDizisi[1];

        Set<Character> tekrarEdenKarakter = new HashSet<>();

        for (char karakter : metin1.toCharArray()) {
            if (metin2.indexOf(karakter) != -1) {
                tekrarEdenKarakter.add(karakter);
            }
        }

        String yeniMetin = "";

        for (char karakter : tekrarEdenKarakter) {
            yeniMetin += karakter;
        }

        return yeniMetin;


    }
}