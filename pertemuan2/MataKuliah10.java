package pertemuan2;

public class MataKuliah10 {
    String kodeMK, nama;
    int sks, jumlahJam;

    public MataKuliah10() {
    }

    public MataKuliah10(String kode, String nama, int sks, int jam) {
        kodeMK = kode;
        this.nama = nama;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam <= jam) {
            System.out.println("Jumlah jam tidak cukup untuk dikurangi");
            return;
        }
        jumlahJam -= jam;
        System.out.println("Pengurangan jam berhasil dilakukan. Jumlah jam sekarang: " + jumlahJam);
    }
}
