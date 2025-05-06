package Pertemuan11;
import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);
        int pilihan;

        do {
            System.out.println("\n== MENU ANTRIAN LAYANAN AKADEMIK ==");
            System.out.println("1. tambah mahasiswa ke antrian");
            System.out.println("2. layani mahasiswa");
            System.out.println("3. lihat mahasiswa terdepan");
            System.out.println("4. lihat semua antrian");
            System.out.println("5. jumlah mahasiswa dalam antrian");
            System.out.println("0. keluar");
            System.out.println("pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("NIM: ");
                    String nim = sc.nextLine();
                    System.out.println("Nama: ");
                    String nama = sc.nextLine();
                    System.out.println("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("melayani mahasiswa");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("jumlah dalam antrian: " + antrian.getJumlahAntrian());
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
