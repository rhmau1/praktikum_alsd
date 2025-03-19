package pertemuan6;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi10 list = new MahasiswaBerprestasi10();

        // Mahasiswa10[] listMhs = new Mahasiswa10[5];
        // for (int i = 0; i < listMhs.length; i++) {
        // listMhs[i] = new Mahasiswa10();
        // System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
        // System.out.print("NIM: ");
        // listMhs[i].nim = sc.nextLine();
        // System.out.print("Nama: ");
        // listMhs[i].nama = sc.nextLine();
        // System.out.print("Kelas: ");
        // listMhs[i].kelas = sc.nextLine();
        // System.out.print("IPK: ");
        // String ipk = sc.nextLine();
        // listMhs[i].ipk = Double.parseDouble(ipk);
        // }
        // for (int i = 0; i < listMhs.length; i++) {
        // list.tambah(listMhs[i]);
        // }

        Mahasiswa10 m1 = new Mahasiswa10("123", "Zidan", "2A", 3.2);
        Mahasiswa10 m2 = new Mahasiswa10("124", "Ayu", "2A", 3.5);
        Mahasiswa10 m3 = new Mahasiswa10("125", "Sofi", "2A", 3.1);
        Mahasiswa10 m4 = new Mahasiswa10("126", "Sita", "2A", 3.9);
        Mahasiswa10 m5 = new Mahasiswa10("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        // System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC)");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("Data yang sudah terurut menggunakan SELECTION
        // SORT(ASC)");
        // list.selectionSort();
        // list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT(ASC)");
        list.insertionSort();
        list.tampil();
    }
}
