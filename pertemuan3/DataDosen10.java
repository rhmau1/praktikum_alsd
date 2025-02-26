public class DataDosen10 {
    void dataSemuaDosen(Dosen10[] arrDosen10) {
        for (Dosen10 dosen10 : arrDosen10) {
            System.out.println("==============================================");
            System.out.println("Data dosen: ");
            System.out.println("Kode: " + dosen10.kode);
            System.out.println("Nama: " + dosen10.nama);
            System.out.println(dosen10.jenisKelamin);
            if (dosen10.jenisKelamin == true) {
                System.out.println("Jenis Kelamin: Laki-laki");
            } else {
                System.out.println("Jenis Kelamin: Perempuan");
            }
            System.out.println("Usia: " + dosen10.usia);
        }
    }

    void dataDosenPerjenisKelamin(Dosen10[] arrDosen10) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (Dosen10 dosen10 : arrDosen10) {
            if (dosen10.jenisKelamin == true) {
                jumlahPria++;

            } else {
                jumlahWanita++;
            }
        }
        System.out.println("Jumlah dosen berjenis kelamin pria: " + jumlahPria);
        System.out.println("Jumlah dosen berjenis kelamin wanita: " + jumlahWanita);

    }

    void rerataUsiaDosenPerjenisKelamin(Dosen10[] arrDosen10) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        double usiaPria = 0;
        double usiaWanita = 0;
        for (Dosen10 dosen10 : arrDosen10) {
            if (dosen10.jenisKelamin == true) {
                usiaPria += dosen10.usia;
                jumlahPria++;
            } else {
                usiaWanita += dosen10.usia;
                jumlahWanita++;
            }
        }
        if (jumlahPria == 0) {
            jumlahPria = 1;
        }
        if (jumlahWanita == 0) {
            jumlahWanita = 1;
        }
        double rerataPria = (usiaPria / jumlahPria);
        System.out.printf("Jumlah rerata usia dosen berjenis kelamin pria: %.2f \n", rerataPria);
        double rerataWanita = (usiaWanita / jumlahWanita);
        System.out.printf("Jumlah rerata usia dosen berjenis kelamin wanita: %.2f \n", rerataWanita);
    }

    void infoDosenTertua(Dosen10[] arrDosen10) {
        int tertua = arrDosen10[0].usia;
        for (int i = 1; i < arrDosen10.length; i++) {
            if (arrDosen10[i].usia > tertua) {
                tertua = arrDosen10[i].usia;
            }
        }
        System.out.println("usia dosen tertua adalah: " + tertua);
    }

    void infoDosenTermuda(Dosen10[] arrDosen10) {
        int termuda = arrDosen10[0].usia;
        for (int i = 1; i < arrDosen10.length; i++) {
            if (arrDosen10[i].usia < termuda) {
                termuda = arrDosen10[i].usia;
            }
        }
        System.out.println("usia dosen termuda adalah: " + termuda);
    }
}
