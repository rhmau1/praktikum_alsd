package pertemuan10;

import java.util.Scanner;

public class SuratDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;
        StackSurat10 stack = new StackSurat10(5);
        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima surat izin");
            System.out.println("2. Proses surat izin");
            System.out.println("3. Melihat surat izin terakhir");
            System.out.println("4. Cari surat berdasarkan nama mahasiswa");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan jenis izin (S/I): ");
                    char jenisIzin = sc.nextLine().toUpperCase().charAt(0);
                    if (jenisIzin != 'S' && jenisIzin != 'I') {
                        System.out.println("Jenis izin tidak valid");
                        break;
                    }
                    System.out.print("Durasi: ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat10 surat = new Surat10(id, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil dikumpulkan \n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat10 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat izin dari " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat10 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("masukkan nama mahasiswa yang dicari: ");
                    String cari = sc.nextLine();
                    stack.sequentialSearching(cari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
