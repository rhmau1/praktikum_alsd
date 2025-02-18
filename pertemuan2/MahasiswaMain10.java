package pertemuan2;

public class MahasiswaMain10 {
    public static void main(String[] args) {
        Mahasiswa10 mhs = new Mahasiswa10();
        mhs.nama = "Fijriati Rahmatur Rizqi";
        mhs.nim = "244107020069";
        mhs.kelas = "TI 1H";
        mhs.ipk = 3.9;

        mhs.tampilkanInformasi();
        mhs.ubahKelas("TI 1C");
        mhs.updateIpk(4.0);
        mhs.tampilkanInformasi();
    }
}
