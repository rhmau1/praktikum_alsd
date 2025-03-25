package pertemuan7;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();
        System.out.println("Masukkan jumlah mahasiswa yang ingin diinput: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

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
        list.selectionSort(); // data diurutkan dulu(ASC) sebelum pencarian
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
        int pos2 = (int) posisi2;
        list.tampilPosisi(cari, pos2);
        list.tampilDataSearch(cari, pos2);
        // Mahasiswa10 m1 = new Mahasiswa10("123", "Zidan", "2A", 3.2);
        // Mahasiswa10 m2 = new Mahasiswa10("124", "Ayu", "2A", 3.5);
        // Mahasiswa10 m3 = new Mahasiswa10("125", "Sofi", "2A", 3.1);
        // Mahasiswa10 m4 = new Mahasiswa10("126", "Sita", "2A", 3.9);
        // Mahasiswa10 m5 = new Mahasiswa10("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        // System.out.println("Data mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION
        // SORT(ASC)");
        // list.selectionSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan INSERTION
        // SORT(ASC)");
        // list.insertionSort();
        // list.tampil();
    }
}
