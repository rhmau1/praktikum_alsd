public class BinaryTreeMain10 {
    public static void main(String[] args) {
        BinaryTree10 bst = new BinaryTree10();
        bst.add(new Mahasiswa10("244001", "Ali", "A", 3.57));
        bst.add(new Mahasiswa10("244002", "Budi", "B", 3.85));
        bst.add(new Mahasiswa10("244003", "Candra", "C", 3.21));
        bst.add(new Mahasiswa10("244004", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal)");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa");
        System.out.print("Cari mahasiswa dengan ipk: 3.54: ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22: ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa10("244005", "Devi", "A", 3.72));
        bst.add(new Mahasiswa10("244006", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa10("244007", "Fizi", "B", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa");
        System.out.println("InOrder Traversal");
        bst.traverseInOrder(bst.root);
        System.out.println("\nPreOrder Traversal");
        bst.traversePreOrder(bst.root);
        System.out.println("\nPostOrder Traversal");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);
        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa in order traversal");
        bst.traverseInOrder(bst.root);

        bst.addRekursif(bst.root, new Mahasiswa10("244008", "Gina", "C", 3.46));
        System.out.println("\nDaftar semua mahasiswa setelah penambahan 1 mahasiswa rekursif in order traversal");
        bst.traverseInOrder(bst.root);

        System.out.println("\nMenampilkan data mahasiswa dengan ipk terbesar dan terkecil");
        System.out.println("Mahasiswa dengan IPK terkecil: " + bst.cariMinIPK().data.nama + " dengan IPK: "
                + bst.cariMinIPK().data.ipk);
        System.out.println("Mahasiswa dengan IPK terbesar: " + bst.cariMaxIPK().data.nama + " dengan IPK: "
                + bst.cariMaxIPK().data.ipk);

        System.out.println("\nMenampilkan data mahasiswa dengan ipk di atas 3.41");
        bst.tampilMahasiswaIPKdiAtas(3.41, bst.root);
    }
}
