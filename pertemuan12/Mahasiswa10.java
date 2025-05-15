package pertemuan12;

public class Mahasiswa10 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa10() {
    }

    Mahasiswa10(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.print(nama + "\t" + nim + "\t\t" + kelas + "\t" + ipk);
        System.out.println();
    }
}
