import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiakhir;
        String nilaiHuruf = "";
        System.out.println("Program menghitung nilai akhir");
        System.out.println("===============================");
        System.out.print("Masukkan nilai tugas: ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan nilai uts: ");
        uts = sc.nextDouble();
        System.out.print("Masukkan nilai uas: ");
        uas = sc.nextDouble();
        System.out.println("===============================");
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
            System.out.println("===============================");
        } else {
            nilaiakhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            System.out.println("Nilai akhir: " + nilaiakhir);
            if (nilaiakhir <= 39) {
                nilaiHuruf = "E";
            } else if (nilaiakhir > 39 && nilaiakhir <= 50) {
                nilaiHuruf = "D";
            } else if (nilaiakhir > 50 && nilaiakhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiakhir > 60 && nilaiakhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiakhir > 65 && nilaiakhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiakhir > 73 && nilaiakhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiakhir > 80 && nilaiakhir <= 100) {
                nilaiHuruf = "A";
            }
            System.out.println("Nilai huruf: " + nilaiHuruf);
            System.out.println("===============================");

            if (nilaiHuruf.equals("E") || nilaiHuruf.equals("D")) {
                System.out.println("Anda tidak lulus");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
    }
}
