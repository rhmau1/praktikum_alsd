package pertemuan2;

public class DosenMain10 {
    public static void main(String[] args) {
        Dosen10 dsn1 = new Dosen10();
        dsn1.idDosen = "D001";
        dsn1.nama = "Joko Widodo";
        dsn1.bidangKeahlian = "Pendidikan Kewarganegaraan";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2014;
        dsn1.tampilInformasi();

        System.out.println("==========");
        Dosen10 dsn2 = new Dosen10("D002", "Megawati Putri", "Pendidikan Kewarganegaraan", false, 2010);
        dsn2.tampilInformasi();

        System.out.println("==========");
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Pancasila");
        dsn2.tampilInformasi();

        System.out.println("==========");
        System.out.printf("Dosen %s memiliki masa kerja %d tahun\n", dsn1.nama, dsn1.hitungMasaKerja(2025));
    }
}
