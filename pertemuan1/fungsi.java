import java.util.Scanner;

public class fungsi {
    static Scanner sc = new Scanner(System.in);
    static String namaBunga[] = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static int hargaBunga[] = { 75000, 50000, 60000, 10000 };

    public static void main(String[] args) {
        int stokBunga[][] = new int[4][4];
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.println("Cabang Royal Garden " + (i + 1));
            for (int j = 0; j < stokBunga[1].length; j++) {
                System.out.print("Masukkan stok untuk bunga " + namaBunga[j] + ": ");
                stokBunga[i][j] = sc.nextInt();
            }
            System.out.println("=======================");
        }
        int[] pendapatanTiapCabang = hitungPendapatan(stokBunga);
        for (int i = 0; i < pendapatanTiapCabang.length; i++) {
            System.out.println("Total Pendapatan Cabang Royal Garden " + (i + 1) + ": " + pendapatanTiapCabang[i]);
        }

        System.out.println("=======================");
        System.out.println("Jumlah stock tiap bunga pada cabang 4");
        int jumlahStockCabang4[][] = jumlahStockCabang4(stokBunga);
        System.out.println("-----------------------");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.println(
                    "Total stock untuk bunga " + namaBunga[i] + " sekarang: " + jumlahStockCabang4[3][i]);
        }
        System.out.println("=======================");

    }

    public static int[] hitungPendapatan(int stokBunga[][]) {
        int hasilPendapatan[] = new int[4];
        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[1].length; j++) {
                hasilPendapatan[i] += (stokBunga[i][j] * hargaBunga[j]);
            }
        }
        return hasilPendapatan;
    }

    public static int[][] jumlahStockCabang4(int stokBunga[][]) {
        System.out.println("Masukkan pengurangan stok (dalam bentuk bilangan negatif. cont: -1)");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.print("Bunga "
                    + namaBunga[i] + ": ");
            stokBunga[3][i] += sc.nextInt();
        }
        return stokBunga;
    }
}
