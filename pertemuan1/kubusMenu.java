import java.util.Scanner;

public class kubusMenu {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("MENU KUBUS");
        System.out.println("1. hitung volume");
        System.out.println("2. hitung luas permukaan kubus");
        System.out.println("3. hitung keliling kubus");
        System.out.println("=======================");

        System.out.print("Masukkan pilihan anda: ");
        int pilihan = sc.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("hasil volume kubus: " + hitungVolume());
                break;
            case 2:
                System.out.println("hasil luas permukaan kubus: " + hitungLuasPermukaan());
                break;
            case 3:
                System.out.println("hasil keliling kubus: " + hitungKeliling());
                break;
            default:
                System.out.println("pilihan anda tidak tersedia");
                break;
        }
    }

    public static int hitungVolume() {
        System.out.print("masukkan panjang sisi: ");
        int s = sc.nextInt();

        int hasil = s * s * s;
        return hasil;
    }

    public static int hitungKeliling() {
        System.out.print("masukkan panjang sisi: ");
        int s = sc.nextInt();

        int hasil = 12 * s;
        return hasil;
    }

    public static int hitungLuasPermukaan() {
        System.out.print("masukkan panjang sisi: ");
        int s = sc.nextInt();

        int hasil = 6 * (s * s);
        return hasil;
    }
}
