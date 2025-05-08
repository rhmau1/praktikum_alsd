package Pertemuan11;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    if (Q.isFull()) {
                        System.out.println("Queue sudah penuh");
                        return;
                    } else {
                        Q.enqueue(dataMasuk);
                    }
                    break;
                case 2:
                    if (Q.isEmpty()) {
                        System.out.println("Queue masih kosong");
                        return;
                    } else {
                        int dataKeluar = Q.dequeue();
                        if (dataKeluar != 0) {
                            System.out.println("Data yang dikeluarkan: " + dataKeluar);
                            break;
                        }
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih > 0 && pilih < 6);
    }
}
