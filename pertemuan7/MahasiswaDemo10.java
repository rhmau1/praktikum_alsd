package pertemuan7;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang ingin diinput: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah(new Mahasiswa10(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("--------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pos = (int) posisi;
        list.tampilPosisi(cari, pos);
        list.tampilDataSearch(cari, pos);

        System.out.println("--------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pos2 = (int) posisi2;
        list.tampilPosisi(cari, pos2);
        list.tampilDataSearch(cari, pos2);
    }
}
