import java.util.Scanner;

public class MatakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Percobaan 3
        // Matakuliah10[] arrMatakuliah10 = new Matakuliah10[3];
        // String kode, nama, dummy;
        // int sks, jumlahJam;

        // modifikasi agar jumlah elemen ditentukan dari input
        System.out.print("Masukkan jumlah elemen mata kuliah yang ingin dibuat: ");
        int jumlahElemen = sc.nextInt();
        Matakuliah10[] arrMatakuliah10 = new Matakuliah10[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            // membuat object Matakuliah
            arrMatakuliah10[i] = new Matakuliah10();
            // tambah method untuk tambahData
            arrMatakuliah10[i].tambahData();

            // System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ": ");
            // System.out.print("kode: ");
            // kode = sc.nextLine();
            // System.out.print("nama: ");
            // nama = sc.nextLine();
            // System.out.print("sks: ");
            // dummy = sc.nextLine();
            // sks = Integer.parseInt(dummy);
            // System.out.print("jumlah jam: ");
            // dummy = sc.nextLine();
            // jumlahJam = Integer.parseInt(dummy);
            // System.out.println("==============================================");
            // arrMatakuliah10[i] = new Matakuliah10(kode, nama, sks, jumlahJam);

        }
        for (int i = 0; i < jumlahElemen; i++) {
            // menambahkan method cetakInfo
            arrMatakuliah10[i].cetakInfo();
            // System.out.println("==============================================");
            // System.out.println("Data mata kuliah ke-" + (i + 1) + ": ");
            // System.out.println("Kode: " + arrMatakuliah10[i].kode);
            // System.out.println("Nama: " + arrMatakuliah10[i].nama);
            // System.out.println("SKS: " + arrMatakuliah10[i].sks);
            // System.out.println("Jumlah Jam: " + arrMatakuliah10[i].jumlahJam);
        }
    }
}
