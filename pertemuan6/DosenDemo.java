package pertemuan6;

import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen list = new DataDosen();

        Dosen d1 = new Dosen("D1", "Agus", true, 31);
        Dosen d2 = new Dosen("D2", "Budi", true, 35);
        Dosen d3 = new Dosen("D3", "Cici", false, 22);
        Dosen d4 = new Dosen("D4", "Dedi", true, 45);
        Dosen d5 = new Dosen("D5", "Eka", true, 32);
        Dosen d6 = new Dosen("D6", "Feri", true, 38);
        Dosen d7 = new Dosen("D7", "Gigi", false, 30);
        Dosen d8 = new Dosen("D8", "Hana", false, 28);
        Dosen d9 = new Dosen("D9", "Ika", false, 25);
        Dosen d10 = new Dosen("D10", "Joni", true, 30);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);
        // Dosen[] listMhs = new Dosen[10];
        // for (int i = 0; i < listMhs.length; i++) {
        // System.out.println("Masukkan data dosen ke-" + (i + 1));
        // System.out.print("Kode: ");
        // String kd = sc.nextLine();
        // System.out.print("Nama: ");
        // String name = sc.nextLine();
        // System.out.print("Apakah jenis kelamin perempuan? (true/false) ");
        // String jenisKelamin = sc.nextLine();
        // boolean jk = Boolean.parseBoolean(jenisKelamin);
        // System.out.print("Usia: ");
        // String Usia = sc.nextLine();
        // int age = Integer.parseInt(Usia);
        // listMhs[i] = new Dosen(kd, name, jk, age);
        // }
        // for (int i = 0; i < listMhs.length; i++) {
        // list.tambah(listMhs[i]);
        // }

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
