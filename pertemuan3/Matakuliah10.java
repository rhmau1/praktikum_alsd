package pertemuan3;

import java.util.Scanner;

public class Matakuliah10 {
    public String kode, nama, dummy;
    public int sks, jumlahJam;

    public Matakuliah10() {

    }

    public Matakuliah10(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan data mata kuliah: ");
        System.out.print("kode: ");
        kode = sc.nextLine();
        System.out.print("nama: ");
        nama = sc.nextLine();
        System.out.print("sks: ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("jumlah jam: ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
    }

    public void cetakInfo() {
        System.out.println("==============================================");
        System.out.println("Data mata kuliah: ");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
}
