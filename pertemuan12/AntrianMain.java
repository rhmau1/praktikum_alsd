package pertemuan12;

import java.util.Scanner;

public class AntrianMain {
    public static void main(String[] args) {
        Antrian antrian = new Antrian();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("antrian layanan unit kemahasiswaan");
            System.out.println("1. menambah antrian");
            System.out.println("2. memanggil antrian");
            System.out.println("3. melihat antrian terdepan");
            System.out.println("4. melihat antrian terakhir");
            System.out.println("5. jumlah mahasiswa yang masih mengantri");
            System.out.println("6. lihat semua antrian");
            System.out.println("0. keluar");
            System.out.println("-------------------");
            System.out.print("pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Daftarkan data mahasiswa: ");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas, ipk);
                    antrian.addLast(mhs);
                    break;
                case 2:
                    System.out.println("Memanggil antrian terdepan: ");
                    antrian.removeFirst();
                    break;
                case 3:
                    System.out.println("Melihat antrian terdepan: ");
                    antrian.antrianTerdepan();
                    break;
                case 4:
                    System.out.println("Melihat antrian terakhir: ");
                    antrian.antrianTerakhir();
                    break;
                case 5:
                    System.out.println("Jumlah mahasiswa yang masih mengantri: " + antrian.getSize());
                    break;
                case 6:
                    antrian.print();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    return;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }
}
