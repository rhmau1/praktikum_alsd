import pertemuan12.NodeMahasiswa10;

public class DoubleLinkedLists {
    Node head, tail;

    DoubleLinkedLists() {
        head = tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Mahasiswa10 data) {
        Node baru = new Node(data);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            baru.next = head;
            head.prev = baru;
            head = baru;
        }
    }

    void addLast(Mahasiswa10 data) {
        Node baru = new Node(data);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    void insertAfter(String key, Mahasiswa10 data) {
        Node current = head;
        // cari node dengan nim = key
        while (current != null && !current.data.nim.equalsIgnoreCase(key)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("data " + key + " tidak ditemukan");
        }
        Node baru = new Node(data);
        // jika current adalah tail, tambahkan di akhir
        if (current == tail) {
            current.next = baru;
            baru.prev = current;
            tail = baru;
        } else {
            // sisipkan di tengah
            baru.next = current.next;
            baru.prev = current;
            current.next.prev = baru;
            current.next = baru;
        }
        System.out.println("node berhasil disisipkan setelah NIM " + key);
    }

    Node search(String nim) {
        Node current = head;
        while (current != null && !current.data.nim.equalsIgnoreCase(nim)) {
            current = current.next;
        }
        return current;
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("double Linked list masih kosong");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("double linked list masih kosong tidak bisa dihapus");
            return;
        } else if (head == tail) {
            System.out.println("data sudah berhasil dihapus. data yang terhapus adalah NIM: " + head.data.nim);
            head = tail = null;
        } else {
            System.out.println("data sudah berhasil dihapus. data yang terhapus adalah NIM: " + head.data.nim);
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("double linked list masih kosong tidak bisa dihapus");
            return;
        } else if (head == tail) {
            System.out.println("data sudah berhasil dihapus. data yang terhapus adalah NIM: " + tail.data.nim);
            head = tail = null;
        } else {
            System.out.println("data sudah berhasil dihapus. data yang terhapus adalah NIM: " + tail.data.nim);
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("double linked list masih kosong tidak bisa dihapus");
        } else if (index == 0) {
            removeFirst();
        } else if (index > getSize()) {
            System.out.println("indeks melebihi panjang linked list!");
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                System.out.println("data sudah berhasil dihapus. data yang terhapus adalah NIM: " + temp.data.nim);
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    void removeAfter(String key) {
        Node temp = head;
        while (temp != null && !temp.data.nim.equalsIgnoreCase(key)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("data " + key + " tidak ditemukan");
        } else if (temp == tail) {
            System.out.println("tidak ada data setelah " + key + " karena data tersebut adalah data terakhir");
        } else {
            if (temp.next == tail) {
                removeLast();
            } else {
                System.out.println("data berhasil dihapus. data yang terhapus adalah NIM: " + temp.next.data.nim);
                temp.next = temp.next.next;
                temp.next.prev = temp;
            }
        }
    }

    Mahasiswa10 getFirst() {
        if (isEmpty()) {
            System.out.println("double linked list masih kosong");
            return null;
        } else {
            return head.data;
        }
    }

    Mahasiswa10 getLast() {
        if (isEmpty()) {
            System.out.println("double linked list masih kosong");
            return null;
        } else {
            return tail.data;
        }
    }

    Mahasiswa10 getIndex(int index) {
        if (isEmpty()) {
            System.out.println("double linked list masih kosong");
            return null;
        } else if (index >= getSize()) {
            System.out.println("indeks melebihi panjang linked list!");
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    int getSize() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public void add(int index, Mahasiswa10 input) {
        if (index < 0) {
            System.out.println("indeks salah!");
            return;
        } else if (index > getSize()) {
            System.out.println("indeks melebihi panjang linked list! data tidak ditambahkan!");
            return;
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(temp.prev, input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
