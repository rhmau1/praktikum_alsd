package pertemuan5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.println("masukkan keuntungan ke-" + (i + 1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("total keuntungan menggunakan bruteforce: " + sm.totalBF());
        System.out.println(
                "total keuntungan menggunakan divide and conquer: " + sm.totalDC(sm.keuntungan, 0, elemen - 1));
    }
}
