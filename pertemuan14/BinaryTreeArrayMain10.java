public class BinaryTreeArrayMain10 {
    public static void main(String[] args) {
        BinaryTreeArray10 bta = new BinaryTreeArray10();
        Mahasiswa10 mhs1 = new Mahasiswa10("244001", "Ali", "A", 3.57);
        Mahasiswa10 mhs2 = new Mahasiswa10("244002", "Candra", "C", 3.41);
        Mahasiswa10 mhs3 = new Mahasiswa10("244003", "Budi", "B", 3.75);
        Mahasiswa10 mhs4 = new Mahasiswa10("244004", "Dewi", "B", 3.35);
        Mahasiswa10 mhs5 = new Mahasiswa10("244005", "Devi", "A", 3.48);
        Mahasiswa10 mhs6 = new Mahasiswa10("244006", "Ehsan", "D", 3.61);
        Mahasiswa10 mhs7 = new Mahasiswa10("244007", "Fizi", "B", 3.86);

        Mahasiswa10[] dataMhs = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
        int idxLast = 6;
        bta.populateData(dataMhs, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa");
        bta.traverseInOrder(0);
    }
}
