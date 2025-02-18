import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[][] = new String[8][2];
        int bobotSks[] = new int[8];
        int totalSKS = 0;
        double nilaiSetara[] = new double[8];
        double IPK = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print("masukkan nama matkul: ");
            String inputNamaMatkul = sc.nextLine();
            if (inputNamaMatkul.isEmpty() || inputNamaMatkul.isBlank()) {
                System.out.println("Nama matkul tidak boleh kosong\n INPUT ULANG");
                i--;
                continue;
            } else {
                arr[i][0] = inputNamaMatkul;
            }
            System.out.print("masukkan nilai huruf: ");
            arr[i][1] = sc.nextLine();
            if (arr[i][1].equalsIgnoreCase("A")) {
                nilaiSetara[i] = 4;
            } else if (arr[i][1].equalsIgnoreCase("B+")) {
                nilaiSetara[i] = 3.5;
            } else if (arr[i][1].equalsIgnoreCase("B")) {
                nilaiSetara[i] = 3;
            } else if (arr[i][1].equalsIgnoreCase("C+")) {
                nilaiSetara[i] = 2.5;
            } else if (arr[i][1].equalsIgnoreCase("C")) {
                nilaiSetara[i] = 2;
            } else if (arr[i][1].equalsIgnoreCase("D")) {
                nilaiSetara[i] = 1;
            } else if (arr[i][1].equalsIgnoreCase("E")) {
                nilaiSetara[i] = 0;
            } else {
                System.out.println("nilai huruf tidak valid\n INPUT ULANG");
                i--;
                continue;
            }
            System.out.print("masukkan bobot sks: ");
            bobotSks[i] = sc.nextInt();
            totalSKS += bobotSks[i];
            sc.nextLine();
            IPK += bobotSks[i] * nilaiSetara[i];
            System.out.println("===============================");

        }

        System.out.printf("%-20s %-15s %-15s %-10s\n", "MK", "Nilai Huruf", "Nilai setara", "Bobot SKS");
        for (int j = 0; j < arr.length; j++) {
            System.out.printf("%-20s %-15s %-15.1f %-10d\n", arr[j][0], arr[j][1], nilaiSetara[j], bobotSks[j]);
        }

        IPK = IPK / totalSKS;

        System.out.printf("IPK: " + String.format("%.2f", IPK));
    }
}
