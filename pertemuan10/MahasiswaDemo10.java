package pertemuan10;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        int pilih;
        StackTugasMahasiswa10 stack = new StackTugasMahasiswa10(5);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.println("5. Lihat tugas terbawah");
            System.out.println("6. Lihat jumlah tugas saat ini");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan \n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa10 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai 0 - 100: ");
                        int nilai = sc.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai tidak valid");
                            break;
                        }
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d \n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai biner tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa10 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
