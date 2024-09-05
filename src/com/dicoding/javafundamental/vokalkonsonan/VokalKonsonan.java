package com.dicoding.javafundamental.vokalkonsonan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        /*Kamus*/
        String word = "";
        Map<String, Integer> num;
        /*Program*/
        //masukan kalimat
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        word = scanner.nextLine();
        num = numVokalAndKonsonan(word);

        System.out.println("Jumlah vokal: " + num.get("vokal"));
        System.out.println("Jumlah konsonan: " + num.get("konsonan"));
    }

    private static Map<String, Integer> numVokalAndKonsonan(String word) {
        int i;
        Map<String, Integer> num = new HashMap<>();
        num.put("konsonan", 0);
        num.put("vokal", 0);

        for (i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
                // Jika karakter adalah vokal, tambahkan 1 ke nilai "vokal"
                num.put("vokal", num.get("vokal") + 1);
            } else if (Character.isLetter(ch)) {
                // Jika karakter adalah huruf dan bukan vokal, tambahkan 1 ke nilai "konsonan"
                num.put("konsonan", num.get("konsonan") + 1);
            }
        }
        return num;
    }

}
