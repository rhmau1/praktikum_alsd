package pertemuan7;

public class DataDosen {
    Dosen[] dataDosen;
    int idx;

    DataDosen(int n) {
        dataDosen = new Dosen[n];
    }

    void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen dsn : dataDosen) {
            dsn.tampil();
            System.out.println("------------------");
        }
    }

    int pencarianDataSequential10(String cari) {
        int posisi = -1;
        int count = 0;

        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                posisi = i;
                count++;
                System.out.println("data dosen bernama " + cari + " ditemukan pada indeks " + i);
                dataDosen[i].tampil();
                System.out.println("=================================================");
            }
        }
        if (count > 1) {
            System.out.println("PERINGATAN!\ndata yang sesuai dengan hasil pencarian ada lebih dari 1");
            System.out.println("ada " + count + " data dosen yang bernama " + cari);
        }
        return posisi;
    }

    void tampilPosisi(String cari, int pos) {
        if (pos != -1) {
            System.out.println("data dosen " + cari + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }

    int pencarianDataBinary10(int cari, int left, int right) {
        insertionSort();
        int mid;
        int count = 0;
        int posisi = -1;

        while (right >= left) {
            mid = (left + right) / 2;
            if (cari == dataDosen[mid].usia) {
                for (int i = 0; i < dataDosen.length; i++) {
                    if (cari == dataDosen[i].usia) {
                        count++;
                        posisi = i;
                        System.out.println("data dosen berusia " + cari + " ditemukan pada indeks " + i);
                        dataDosen[i].tampil();
                        System.out.println("=================================================");
                    }
                }
                break;
            } else if (dataDosen[mid].usia > cari) { // data urut desc pakai tanda <, jika asc pakai tanda >
                return pencarianDataBinary10(cari, left, mid - 1);
            } else {
                return pencarianDataBinary10(cari, mid + 1, right);
            }
        }
        if (count > 1) {
            System.out.println("PERINGATAN!\ndata yang sesuai dengan hasil pencarian ada lebih dari 1");
            System.out.println("ada " + count + " data dosen yang berusia " + cari);
        }
        return posisi;
    }

    void sortingASC() {
        // mengurutkan dari termuda ke tertua dengan bubble sort
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDESC() {
        // mengurutkan dari tertua ke termuda dengan selection/insertion sort
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen tmp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            // while (j > 0 && dataDosen[j - 1].usia < temp.usia) { DESC
            while (j > 0 && dataDosen[j - 1].usia > temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}
