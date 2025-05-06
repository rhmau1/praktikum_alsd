package Pertemuan11;

public class AntrianLayanan {
    Mahasiswa[] data;
    int front, rear, size, max;

    public AntrianLayanan(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
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
        if (isFull()) {
            System.out.println("antrian sudah penuh, tidak bisa menambah mahasiswa");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        System.out.println(dt.nama + " berhasil masuk ke antrian");
    }

    public Mahasiswa layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("antrian masih kosong");
        }
        Mahasiswa dt = data[front];
        front = (front + 1) % max;
        size--;
        return dt;
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("antrian kosong");
        } else {
            System.out.println("mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
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
}
