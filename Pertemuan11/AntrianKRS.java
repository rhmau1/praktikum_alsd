package Pertemuan11;

public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max, sudahKRS;

    public AntrianKRS() {
        max = 10;
        data = new Mahasiswa[max];
        front = size = sudahKRS = 0;
        rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        } else {
            System.out.println("queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa dt) {
        if (isMaxDilayaniDPA()) {
            System.out.println("jumlah mahasiswa dilayani sudah maksimal, tidak bisa menambah mahasiswa");
            return;
        } else {
            if (isFull()) {
                System.out.println("antrian sudah penuh, tidak bisa menambah mahasiswa");
                return;
            }
            rear = (rear + 1) % max;
            data[rear] = dt;
            size++;
            System.out.println(dt.nama + " berhasil masuk ke antrian");
        }
    }

    public void layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("antrian masih kosong");
        } else {
            System.out.println("Melayani KRS 2 mahasiswa terdepan: ");
            if (size < 2) {
                for (int i = 0; i < size; i++) {
                    Mahasiswa tmp = data[front];
                    System.out.println(
                            (i + 1) + ". " + tmp.nim + " - " + tmp.nama + " - " + tmp.prodi + " - " + tmp.kelas);
                    sudahKRS++;
                    front = (front + 1) % max;
                    size--;
                }
                return;
            }
            for (int i = 0; i < 2; i++) {
                Mahasiswa tmp = data[front];
                System.out.println((i + 1) + ". " + tmp.nim + " - " + tmp.nama + " - " + tmp.prodi + " - " + tmp.kelas);
                sudahKRS++;
                front = (front + 1) % max;
                size--;
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("antrian masih kosong");
        } else {
            System.out.println("Tampilkan 2 mahasiswa terdepan: ");
            if (size < 2) {
                for (int i = 0; i < size; i++) {
                    Mahasiswa tmp = data[front];
                    System.out.println(
                            (i + 1) + ". " + tmp.nim + " - " + tmp.nama + " - " + tmp.prodi + " - " + tmp.kelas);
                    front = (front + 1) % max;
                }
                return;
            }
            for (int i = 0; i < 2; i++) {
                Mahasiswa tmp = data[front];
                System.out.println((i + 1) + ". " + tmp.nim + " - " + tmp.nama + " - " + tmp.prodi + " - " + tmp.kelas);
                front = (front + 1) % max;
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("antrian kosong");
        } else {
            System.out.println("mahasiswa antrian terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("antrian kosong");
            return;
        }
        System.out.println("daftar mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return sudahKRS;
    }

    public boolean isMaxDilayaniDPA() {
        return (sudahKRS + size) == 30;
    }

    public int getJumlahBelumKRS() {
        return 30 - sudahKRS;
    }
}
