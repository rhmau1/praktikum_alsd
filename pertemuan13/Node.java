public class Node {
    Mahasiswa10 data;
    Node prev, next;

    Node() {
    }

    Node(Mahasiswa10 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    Node(Node prev, Mahasiswa10 data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
