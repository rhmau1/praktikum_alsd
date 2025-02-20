package pertemuan2;

public class Mahasiswa10 {
    String nama, nim, kelas;
    double ipk;

    public Mahasiswa10() {
    }

    public Mahasiswa10(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim; // apabila nama parameter = nama atribut maka tambah sintaks this untuk merujuk
                        // pada atribut
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru < 0.0 || ipkBaru > 4.0) {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
            return;
        }
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
