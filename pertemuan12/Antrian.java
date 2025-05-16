package pertemuan12;

public class Antrian {
    NodeMahasiswa10 head, tail;
    int maks;

    Antrian(int max) {
        maks = max;
        head = null;
        tail = null;
    }

    boolean isFull() {
        return (getSize() == maks);
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa10 tmp = head;
            System.out.println("Isi antrian:");
            System.out.println("nama\tnim\t\tkelas\tIPK");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked list masih kosong");
        }
    }

    public void addLast(Mahasiswa10 input) {
        if (!isFull()) {
            NodeMahasiswa10 ndInput = new NodeMahasiswa10(input, null);
            System.out.println(ndInput.data.nama + " masuk antrian");
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                tail.next = ndInput;
                tail = ndInput;
            }
        } else {
            System.out.println("Antrian penuh");
        }
    }

    public int getSize() {
        int size = 0;
        NodeMahasiswa10 tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }
        // System.out.println("Size: " + size);
        return size;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            System.out.println("Melayani mahasiswa " + head.data.nama);
            head = tail = null;
        } else {
            System.out.println("Melayani mahasiswa " + head.data.nama);
            head = head.next;
        }
    }

    public void antrianTerdepan() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat ditampilkan");
        } else {
            System.out.println("nama\tnim\t\tkelas\tIPK");
            head.data.tampilInformasi();
        }
    }

    public void antrianTerakhir() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat ditampilkan");
        } else {
            System.out.println("nama\tnim\t\tkelas\tIPK");
            tail.data.tampilInformasi();
        }
    }

    public void kosongkanAntrian() {
        head = tail = null;
        System.out.println("Antrian telah kosong");
    }
}
