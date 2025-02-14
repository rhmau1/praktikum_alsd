import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nim: ");
        String nim = sc.nextLine();
        System.out.println("===============================");
        int digitTerakhir = Integer.parseInt(nim.substring(nim.length() - 2, nim.length()));
        if (digitTerakhir < 10) {
            digitTerakhir += 10;
        }
        System.out.println("n : " + digitTerakhir);
        for (int i = 1; i <= digitTerakhir; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else {
                if (i % 2 == 0) {
                    System.out.print(i);
                } else {
                    System.out.print("*");
                }
            }
        }
    }
}
