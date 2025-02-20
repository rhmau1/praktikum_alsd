package pertemuan2;

public class Dosen10 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen10() {
    }

    public Dosen10(String id, String nama, String bidang, boolean status, int tahun) {
        idDosen = id;
        this.nama = nama;
        bidangKeahlian = bidang;
        statusAktif = status;
        tahunBergabung = tahun;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}
