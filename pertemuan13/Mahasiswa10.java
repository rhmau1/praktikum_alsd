package pertemuan13;

public class Mahasiswa10 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa10(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void print() {
        System.out.println(nim + " - " + nama + " - " + kelas + " - " + ipk);
    }
}
