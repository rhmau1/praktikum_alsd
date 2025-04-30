package pertemuan10;

public class Mahasiswa10 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa10() {
    }

    Mahasiswa10(String nim, String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
        this.nim = nim;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
