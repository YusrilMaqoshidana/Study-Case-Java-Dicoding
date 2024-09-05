package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        SegitigaSiku segitigaSiku = new SegitigaSiku();
        Lingkaran lingkaran = new Lingkaran();
        int s1, s2, r;

        mainMenu();

        switch (pilihan) {
            case '1':
                System.out.print("Masukan panjang persegi panjang: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi panjang: ");
                s2 = scanner.nextInt();
                displayPersegiPanjang(s1, s2, persegiPanjang);
                break;
            case '2':
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                displaySegitigaSiku(s1, s2, segitigaSiku);
                break;
            case '3':
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                displayLingkaran(r, lingkaran);
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }

    private static void mainMenu() {
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }

    private static void displayPersegiPanjang(Integer s1, Integer s2, PersegiPanjang p) {
        System.out.println("Luas: " + p.luas(s1, s2));
        System.out.println("Keliling: " + p.keliling(s1, s2)
        );
    }

    private static void displaySegitigaSiku(Integer s1, Integer s2, SegitigaSiku s) {
        System.out.println("Luas: " + s.luas(s1, s2));
        System.out.println("Keliling: " + s.keliling(s1, s2)
        );
    }

    private static void displayLingkaran(Integer r, Lingkaran l) {
        System.out.println("Luas: " + l.luas(r));
        System.out.println("Keliling: " + l.keliling(r));
    }

}

