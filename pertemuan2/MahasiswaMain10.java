package pertemuan2;

public class MahasiswaMain10 {
    public static void main(String[] args) {
        Mahasiswa10 mhs1 = new Mahasiswa10(); // menggunakan konstruktor default
        mhs1.nama = "Fijriati Rahmatur Rizqi";
        mhs1.nim = "244107020069";
        mhs1.kelas = "TI 1H";
        mhs1.ipk = 3.9;

        mhs1.tampilkanInformasi(); // sebelum diubah
        System.out.println("==========");
        mhs1.ubahKelas("TI 1C");
        mhs1.updateIpk(4.0);
        mhs1.tampilkanInformasi(); // setelah diubah

        System.out.println("==========");
        Mahasiswa10 mhs2 = new Mahasiswa10("Nina", "123", 3.5, "TI 1D"); // menggunakan konstruktor berparameter
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi(); // setelah diubah

        System.out.println("==========");
        Mahasiswa10 mhsFijriati = new Mahasiswa10("Fijriati Rahmatur Rizqi", "244107020069", 4, "TI 1H");
        mhsFijriati.tampilkanInformasi();
        System.out.printf("Hasil nilai kinerja Fijriati adalah: %s\n", mhsFijriati.nilaiKinerja());
    }
}
