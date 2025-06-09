public class BinaryTreeArray10 {
    Mahasiswa10[] dataMahasiswa;
    int idxLast;

    BinaryTreeArray10() {
        this.dataMahasiswa = new Mahasiswa10[10];
    }

    void populateData(Mahasiswa10 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa10 data) {
        int i = 0;
        while (i < dataMahasiswa.length && dataMahasiswa[i] != null) {
            if (data.ipk < dataMahasiswa[i].ipk) {
                i = 2 * i + 1;
            } else {
                i = 2 * i + 2;
            }
        }
        if (i >= dataMahasiswa.length) {
            System.out.println("\narray sudah penuh");
            return;
        }
        dataMahasiswa[i] = data;
        idxLast++;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart >= dataMahasiswa.length) {
            return;
        }

        if (dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
