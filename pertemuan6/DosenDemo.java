package pertemuan6;

import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen list = new DataDosen();

        Dosen[] listMhs = new Dosen[10];
        for (int i = 0; i < listMhs.length; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode: ");
            String kd = sc.nextLine();
            System.out.print("Nama: ");
            String name = sc.nextLine();
            System.out.print("Apakah jenis kelamin perempuan? (true/false) ");
            String jenisKelamin = sc.nextLine();
            boolean jk = Boolean.parseBoolean(jenisKelamin);
            System.out.print("Usia: ");
            String Usia = sc.nextLine();
            int age = Integer.parseInt(Usia);
            listMhs[i] = new Dosen(kd, name, jk, age);
        }
        for (int i = 0; i < listMhs.length; i++) {
            list.tambah(listMhs[i]);
        }

        System.out.println("Data dosen sebelum sorting:");
        list.tampil();

        System.out.println("Data dosen setelah sorting berdasarkan usia menggunakan bubble sort ASC:");
        list.sortingASC();
        list.tampil();

        System.out.println("Data dosen setelah sorting berdasarkan usia menggunakan selection sort DESC:");
        list.sortingDESC();
        list.tampil();

        System.out.println("Data dosen setelah sorting berdasarkan usia menggunakan insertion sort ASC:");
        list.insertionSort();
        list.tampil();
    }
}
