import java.util.Scanner;

public class platNomor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char kode[] = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char kota[][] = new char[10][12];

        for (int i = 0; i < kota.length; i++) {
            System.out.print("masukkan nama kota: ");
            String namaKota = sc.nextLine();
            for (int j = 0; j < namaKota.length(); j++) {
                kota[i][j] = namaKota.charAt(j);
            }
        }

        System.out.println("=======================");
        System.out.print("masukkan kode plat nomor: ");
        char plat = sc.nextLine().toUpperCase().charAt(0);
        boolean isFound = false;
        int foundIndex = -1;
        for (int i = 0; i < kode.length; i++) {
            if (plat == (kode[i])) {
                isFound = true;
                foundIndex = i;
                break;
            }
        }
        if (isFound) {
            System.out.println(kota[foundIndex]);
        } else {
            System.out.println("kode plat nomor tidak ditemukan");
        }
    }
}
