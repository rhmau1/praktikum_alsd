import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        String kode, nama, dummy;
        boolean jenisKelamin;
        int usia;
        Scanner sc = new Scanner(System.in);
        Dosen10 arrOfDosen[] = new Dosen10[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1) + ": ");
            System.out.print("kode: ");
            kode = sc.nextLine();
            System.out.print("nama: ");
            nama = sc.nextLine();
            System.out.print("Apakah jenis kelamin laki-laki? (true/false): ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("usia: ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("==============================================");
            arrOfDosen[i] = new Dosen10(kode, nama, jenisKelamin, usia);
        }

        DataDosen10 dataDosen10 = new DataDosen10();
        dataDosen10.dataSemuaDosen(arrOfDosen);
        dataDosen10.dataDosenPerjenisKelamin(arrOfDosen);
        dataDosen10.rerataUsiaDosenPerjenisKelamin(arrOfDosen);
        dataDosen10.infoDosenTertua(arrOfDosen);
        dataDosen10.infoDosenTermuda(arrOfDosen);

        // for (Dosen10 dosen10 : arrOfDosen) {
        // System.out.println("==============================================");
        // System.out.println("Data dosen: ");
        // System.out.println("Kode: " + dosen10.kode);
        // System.out.println("Nama: " + dosen10.nama);
        // if (dosen10.jenisKelamin == true) {
        // System.out.println("Jenis Kelamin: Laki-laki");
        // } else {
        // System.out.println("Jenis Kelamin: Perempuan");
        // }
        // System.out.println("Usia: " + dosen10.usia);
        // }
    }
}
