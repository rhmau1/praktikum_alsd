package pertemuan2;

public class MataKuliahMain10 {
    public static void main(String[] args) {
        MataKuliah10 mk1 = new MataKuliah10();
        mk1.kodeMK = "MK001";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 150;
        mk1.tampilInformasi();

        System.out.println("==========");
        MataKuliah10 mk2 = new MataKuliah10("MK002", "Basis Data", 3, 150);
        mk2.tampilInformasi();

        System.out.println("==========");
        mk1.ubahSKS(2);
        mk1.tambahJam(50);
        mk1.kurangiJam(100);
        mk1.tampilInformasi();
        mk1.kurangiJam(150);

    }
}
