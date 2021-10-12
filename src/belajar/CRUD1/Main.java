package belajar.CRUD1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      /*  Scanner inputUser=new Scanner(System.in);
        System.out.println("apa yang anda cari: ");
        String inputData= inputUser.next(); */
        boolean isLanjutkan= true;
        while (isLanjutkan) {
            System.out.println("belajar data perpustakaan");
            System.out.println("1.\tlihat seluruh buku");
            System.out.println("2.\tcari data buku");
            System.out.println("3.\ttambah data bukku");
            System.out.println("4.\tubah data buku");
            System.out.println("5.\thapus data buku");
            System.out.println("\n\n masukkan pilihan anda: ");
            Scanner inputUser = new Scanner(System.in);
            System.out.println("apa yang anda cari: ");
            String inputData = inputUser.next();
            switch (inputData.toUpperCase()) {
                case "1":
                    System.out.println("list seluruh buku ");
                    break;
                case "2":
                    System.out.println("cari buku  ");
                    break;
                case "3":
                    System.out.println("tambah data buku ");
                    break;
                case "4":
                    System.out.println("ubah data buku ");
                    break;
                case "5":
                    System.out.println("hapus data buku ");
                    break;
                default:
                    System.err.println("input tidak ditemukan\n" + "pilih diantara 1- 5");
            }
            System.out.println("apakah anda ingin melanjutkan (y/n) ");
inputData=inputUser.next();
isLanjutkan=inputData.equalsIgnoreCase("y");
        }
    }
        private static void bacabuku ()throws IOException {
            FileReader fileReader;
            BufferedReader bufferedReader;


            try {
                fileReader = new FileReader("Database.txt");
                bufferedReader = new BufferedReader(fileReader);
            } catch (Exception e) {
                System.err.println("databasse tidak ditemukan");
                return;
            }
        }
    }
