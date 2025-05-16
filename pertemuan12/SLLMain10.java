package pertemuan12;

import java.util.Scanner;

public class SLLMain10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList10 sll = new SingleLinkedList10();
        Mahasiswa10 mhs1 = new Mahasiswa10("2019001", "Adi", "1A", 3.5);
        Mahasiswa10 mhs2 = new Mahasiswa10("2019002", "Budi", "2B", 3.9);
        Mahasiswa10 mhs3 = new Mahasiswa10("2019003", "Cici", "3C", 3.7);
        Mahasiswa10 mhs4 = new Mahasiswa10("2019004", "Dedi", "4D", 3.8);
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dedi", mhs3);
        sll.print();
        sll.insertAt(3, mhs2);
        sll.print();

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
        Mahasiswa10 mhs = new Mahasiswa10(nim, nama, kelas, ipk);
        sll.addLast(mhs);
        sll.print();

        System.out.println("data index 4 adalah: ");
        sll.getData(4);

        System.out.println();
        System.out.println("data mahasiswa budi ada di index: " + sll.indexOf("budi"));
        System.out.println();

        System.out.println("sebelum remove first");
        sll.print();
        sll.removeFirst();
        System.out.println("sesudah remove first");
        sll.print();

        System.out.println("sebelum remove last");
        sll.print();
        sll.removeLast();
        System.out.println("sesudah remove last");
        sll.print();

        System.out.println("sebelum remove at indeks 0");
        sll.print();
        sll.removeAt(0);
        System.out.println("sesudah remove at indeks 0");
        sll.print();

        System.out.println("sebelum remove adi");
        sll.print();
        sll.remove("Adi");
        System.out.println("sesudah remove adi");
        sll.print();
    }
}
