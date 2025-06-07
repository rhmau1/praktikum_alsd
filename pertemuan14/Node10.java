public class Node10 {
    Mahasiswa10 data;
    Node10 left, right;

    Node10() {
    }

    Node10(Mahasiswa10 mahasiswa) {
        data = mahasiswa;
        left = right = null;
    }

    Node10(Node10 left, Mahasiswa10 mahasiswa, Node10 right) {
        data = mahasiswa;
        this.left = left;
        this.right = right;
    }
}
