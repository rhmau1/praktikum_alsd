package pertemuan13;

import java.util.Scanner;

public class DoubleLinkedListsMain {
    static Mahasiswa10 inputMahasiswa(Scanner sc) {
        System.out.println("Masukkan data mahasiswa: ");
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa10(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu double linked list mahasiswa:");
            System.out.println("1. tambah di awal");
            System.out.println("2. tambah di akhir");
            System.out.println("3. hapus di awal");
            System.out.println("4. hapus di akhir");
            System.out.println("5. tampilkan data");
            System.out.println("6. cari mahasiswa berdasarkan nim");
            System.out.println("7. insert after nim tertentu");
            System.out.println("8. add pada indeks tertentu");
            System.out.println("9. remove pada indeks tertentu");
            System.out.println("10. removeAfter nim tertentu");
            System.out.println("11. tampil data pertama");
            System.out.println("12. tampil data terakhir");
            System.out.println("13. tampil data pada indeks tertentu");
            System.out.println("14. tampilkan jumlah data");
            System.out.println("0. keluar");
            System.out.print("pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa10 mhs = inputMahasiswa(sc);
                    dll.addFirst(mhs);
                    break;
                case 2:
                    mhs = inputMahasiswa(sc);
                    dll.addLast(mhs);
                    break;
                case 3:
                    dll.removeFirst();
                    break;
                case 4:
                    dll.removeLast();
                    break;
                case 5:
                    dll.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node found = dll.search(nim);
                    if (found != null) {
                        System.out.println("data ditemukan");
                        found.data.print();
                        dll.insertAfter(nim, found.data);
                    } else {
                        System.out.println("data tidak ditemukan");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan key NIM yang dicari: ");
                    nim = sc.nextLine();
                    found = dll.search(nim);
                    if (found != null) {
                        System.out.println("data ditemukan");
                        found.data.print();
                        mhs = inputMahasiswa(sc);
                        dll.insertAfter(nim, mhs);
                    } else {
                        System.out.println("data tidak ditemukan");
                    }
                    break;
                case 8:
                    System.out.print("Masukkan index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    mhs = inputMahasiswa(sc);
                    dll.add(index, mhs);
                    break;
                case 9:
                    System.out.print("Masukkan index: ");
                    index = sc.nextInt();
                    sc.nextLine();
                    dll.remove(index);
                    break;
                case 10:
                    System.out.print("Masukkan key NIM: ");
                    nim = sc.nextLine();
                    dll.removeAfter(nim);
                    break;
                case 11:
                    Mahasiswa10 mhsPertama = dll.getFirst();
                    mhsPertama.print();
                    break;
                case 12:
                    Mahasiswa10 mhsTerakhir = dll.getLast();
                    mhsTerakhir.print();
                    break;
                case 13:
                    System.out.print("Masukkan index: ");
                    index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa10 mhsIndex = dll.getIndex(index);
                    mhsIndex.print();
                    break;
                case 14:
                    System.out.println("jumlah data: " + dll.getSize());
                    break;
                case 0:
                    System.out.println("keluar dari program");
                    break;
                default:
                    System.out.println("pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}
