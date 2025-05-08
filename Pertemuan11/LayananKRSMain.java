package Pertemuan11;

import java.util.Scanner;

public class LayananKRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();
        int pilihan;
        do {
            System.out.println("\n== MENU ANTRIAN KRS ==");
            System.out.println("1. tambah mahasiswa ke antrian");
            System.out.println("2. layani mahasiswa");
            System.out.println("3. tampilkan dua antrian terdepan");
            System.out.println("4. lihat semua antrian");
            System.out.println("5. jumlah mahasiswa dalam antrian");
            System.out.println("6. cek antrian paling belakang");
            System.out.println("7. jumlah mahasiswa sudah KRS");
            System.out.println("8. jumlah mahasiswa belum KRS");
            System.out.println("0. keluar");
            System.out.print("pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.layaniMahasiswa();
                    break;
                case 3:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 7:
                    System.out.println("jumlah mahasiswa sudah KRS: " + antrian.getJumlahSudahKRS());
                    break;
                case 8:
                    System.out.println("jumlah mahasiswa belum KRS: " + antrian.getJumlahBelumKRS());
                    break;
                case 0:
                    System.out.println("terimakasih");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
            }
        } while (pilihan != 0);
    }
}
