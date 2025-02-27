import java.util.Scanner;

public class Dosen10 {
    String kode, nama, dummy;
    boolean jenisKelamin;
    int usia;
    Scanner sc = new Scanner(System.in);

    public Dosen10() {
    }

    public Dosen10(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // public void inputDosen() {
    // System.out.print("kode: ");
    // kode = sc.nextLine();
    // System.out.print("nama: ");
    // nama = sc.nextLine();
    // System.out.print("Apakah jenis kelamin laki-laki? (true/false): ");
    // dummy = sc.nextLine();
    // jenisKelamin = Boolean.parseBoolean(dummy);
    // System.out.print("usia: ");
    // dummy = sc.nextLine();
    // usia = Integer.parseInt(dummy);
    // System.out.println("==============================================");
    // }
}
