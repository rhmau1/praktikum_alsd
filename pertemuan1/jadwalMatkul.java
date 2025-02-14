import java.util.Scanner;

public class jadwalMatkul {
    static Scanner sc = new Scanner(System.in);
    static String namaMatkul[], hariKuliah[];
    static int n, SKS[], semester[];

    public static void main(String[] args) {
        System.out.print("Input jumlah mata kuliah: ");
        n = sc.nextInt();
        sc.nextLine();
        namaMatkul = new String[n];
        hariKuliah = new String[n];
        SKS = new int[n];
        semester = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("=======================");
            System.out.print("masukkan nama mata kuliah: ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("masukkan jumlah sks: ");
            SKS[i] = sc.nextInt();
            System.out.print("masukkan semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("masukkan hari kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }
        while (true) {
            System.out.println("==============================================");
            System.out.println("MENU JADWAL");
            System.out.println("1. Menampilkan jadwal kuliah");
            System.out.println("2. Mencari mata kuliah");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("\tA. Menampilkan seluruh jadwal kuliah");
                    System.out.println("\tB. Menampilkan berdasarkan hari tertentu");
                    System.out.println("\tC. Menampilkan jadwal kuliah berdasarkan semester tertentu");
                    System.out.print("\tMasukkan pilihan anda: ");
                    char choice = sc.nextLine().toUpperCase().charAt(0);
                    switch (choice) {
                        case 'A':
                            seluruhJadwalKuliah();
                            break;
                        case 'B':
                            print(berdasarkanHari());
                            break;
                        case 'C':
                            print(berdasarkanSemester());
                            break;
                        default:
                            System.out.println("Pilihan anda tidak valid");
                            break;
                    }
                    break;
                case 2:
                    print(mencariMatkul());
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid");
                    return;
            }
        }
    }

    public static void seluruhJadwalKuliah() {
        System.out.println("==============================================");
        System.out.println("JADWAL SELURUH MATA KULIAH");
        System.out.printf("%-20s %-15s %-15s %-20s\n", "Nama Matkul", "SKS", "Semester", "Hari Kuliah");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("%-20s %-15s %-15s %-20s\n", namaMatkul[i], SKS[i], semester[i], hariKuliah[i]);
        }
        System.out.println("==============================================");
    }

    public static void print(int arr[]) {
        System.out.printf("%-20s %-15s %-15s %-20s\n", "Nama Matkul", "SKS", "Semester", "Hari Kuliah");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-20s %-15s %-15s %-20s\n", namaMatkul[arr[i]], SKS[arr[i]], semester[arr[i]],
                    hariKuliah[arr[i]]);
        }
    }

    public static int[] berdasarkanHari() {
        System.out.println("==============================================");
        System.out.print("masukkan hari yang ingin dicari: ");
        String hari = sc.nextLine();
        int foundIndexTemp[] = new int[n];
        int count = 0;
        for (int i = 0; i < hariKuliah.length; i++) {
            if (hari.equalsIgnoreCase(hariKuliah[i])) {
                foundIndexTemp[count] = i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("data matkul dengan hari " + hari + " tidak ditemukan");
        }
        int foundIndex[] = new int[count];
        for (int i = 0; i < count; i++) {
            foundIndex[i] = foundIndexTemp[i];
        }
        return foundIndex;
    }

    public static int[] mencariMatkul() {
        System.out.println("==============================================");
        System.out.print("masukkan nama matkul yang ingin dicari: ");
        String nama = sc.nextLine();
        int foundIndexTemp[] = new int[n];
        int count = 0;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (nama.equalsIgnoreCase(namaMatkul[i])) {
                foundIndexTemp[count] = i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("data matkul dengan nama " + nama + " tidak ditemukan");
        }
        int foundIndex[] = new int[count];
        for (int i = 0; i < count; i++) {
            foundIndex[i] = foundIndexTemp[i];
        }
        return foundIndex;
    }

    public static int[] berdasarkanSemester() {
        System.out.println("==============================================");
        System.out.print("masukkan semester yang ingin dicari: ");
        int smt = sc.nextInt();
        int foundIndexTemp[] = new int[n];
        int count = 0;
        for (int i = 0; i < semester.length; i++) {
            if (smt == semester[i]) {
                foundIndexTemp[count] = i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("data matkul dengan semester " + smt + " tidak ditemukan");
        }
        int foundIndex[] = new int[count];
        for (int i = 0; i < count; i++) {
            foundIndex[i] = foundIndexTemp[i];
        }
        return foundIndex;
    }

}
