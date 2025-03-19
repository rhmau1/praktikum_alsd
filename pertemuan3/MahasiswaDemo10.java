package pertemuan3;

import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        // Percobaan 1
        // arrOfMahasiswa[0] = new Mahasiswa10();
        // arrOfMahasiswa[0].nim = "244107020069";
        // arrOfMahasiswa[0].nama = "Fijriati Rahmatur Rizqi";
        // arrOfMahasiswa[0].kelas = "TI 1H";
        // arrOfMahasiswa[0].ipk = (float) 4.0;
        // arrOfMahasiswa[1] = new Mahasiswa10();
        // arrOfMahasiswa[1].nim = "23456789000";
        // arrOfMahasiswa[1].nama = "Tiara Salsabilla";
        // arrOfMahasiswa[1].kelas = "TI 1H";
        // arrOfMahasiswa[1].ipk = (float) 4.0;
        // arrOfMahasiswa[2] = new Mahasiswa10();
        // arrOfMahasiswa[2].nim = "244107020192";
        // arrOfMahasiswa[2].nama = "Alsanna Salsabilla";
        // arrOfMahasiswa[2].kelas = "TI 1C";
        // arrOfMahasiswa[2].ipk = (float) 4.0;

        // System.out.println("NIM Mahasiswa: " + arrOfMahasiswa[0].nim);
        // System.out.println("Nama Mahasiswa: " + arrOfMahasiswa[0].nama);
        // System.out.println("Kelas Mahasiswa: " + arrOfMahasiswa[0].kelas);
        // System.out.println("IPK Mahasiswa: " + arrOfMahasiswa[0].ipk);
        // System.out.println("==========");
        // System.out.println("NIM Mahasiswa: " + arrOfMahasiswa[1].nim);
        // System.out.println("Nama Mahasiswa: " + arrOfMahasiswa[1].nama);
        // System.out.println("Kelas Mahasiswa: " + arrOfMahasiswa[1].kelas);
        // System.out.println("IPK Mahasiswa: " + arrOfMahasiswa[1].ipk);
        // System.out.println("==========");
        // System.out.println("NIM Mahasiswa: " + arrOfMahasiswa[2].nim);
        // System.out.println("Nama Mahasiswa: " + arrOfMahasiswa[2].nama);
        // System.out.println("Kelas Mahasiswa: " + arrOfMahasiswa[2].kelas);
        // System.out.println("IPK Mahasiswa: " + arrOfMahasiswa[2].ipk);

        // Percobaan 2
        Scanner sc = new Scanner(System.in);
        Mahasiswa10[] arrOfMahasiswa = new Mahasiswa10[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrOfMahasiswa[i] = new Mahasiswa10();

            System.out.println("masukkan data mahasiswa ke-" + (i + 1) + ": ");
            System.out.print("NIM: ");
            arrOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama: ");
            arrOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas: ");
            arrOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK: ");
            dummy = sc.nextLine();
            arrOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("=======================");
        }

        for (int i = 0; i < 3; i++) {
            // tambahkan method cetak info
            arrOfMahasiswa[i].cetakInfo();
            // System.out.println("data mahasiswa ke-" + (i + 1));
            // System.out.println("NIM Mahasiswa: " + arrOfMahasiswa[i].nim);
            // System.out.println("Nama Mahasiswa: " + arrOfMahasiswa[i].nama);
            // System.out.println("Kelas Mahasiswa: " + arrOfMahasiswa[i].kelas);
            // System.out.println("IPK Mahasiswa: " + arrOfMahasiswa[i].ipk);
            // System.out.println("==========");
        }

        // Error karena belum membuat objek langsung mengisi atribut
        // Mahasiswa10[] myArrayOMahasiswa = new Mahasiswa10[3];
        // myArrayOMahasiswa[0].nim = "244107020079";
        // myArrayOMahasiswa[0].nama = "Test";
        // myArrayOMahasiswa[0].kelas = "TI 1G";
        // myArrayOMahasiswa[0].ipk = (float) 3.75;

    }
}
