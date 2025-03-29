package pertemuan7;

import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen yang ingin diinput: ");
        int n = sc.nextInt();
        sc.nextLine();
        DataDosen list = new DataDosen(n);

        for (int i = 0; i < n; i++) {
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
            list.tambah(new Dosen(kd, name, jk, age));
        }

        System.out.println("Data dosen sebelum sorting:");
        list.tampil();
        System.out.println("------------------------");
        System.out.print("masukkan nama dosen yang dicari: ");
        String cari = sc.nextLine();
        int pos = list.pencarianDataSequential10(cari);
        list.tampilPosisi(cari, pos); // jika ada >1 data yang sama, maka tampil posisi hanya akan menampilkan indeks
                                      // dari data terakhir yang ditemukan
        System.out.println("------------------------");
        System.out.print("Masukkan usia dosen yang dicari: ");
        int cari2 = sc.nextInt();
        int pos2 = list.pencarianDataBinary10(cari2, 0, n - 1);
        list.tampilPosisi(String.valueOf(cari2), pos2);

    }
}
