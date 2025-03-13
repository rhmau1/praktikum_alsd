package pertemuan5;

public class Tugas {
    public int utsTinggi(String[][] arr, int l, int r) {
        if (l == r) {
            return Integer.parseInt(arr[l][3]);
        }
        int mid = (l + r) / 2;
        int lmax = utsTinggi(arr, l, mid);
        int rmax = utsTinggi(arr, mid + 1, r);
        if (lmax > rmax) {
            return lmax;
        } else {
            return rmax;
        }
    }

    public int utsRendah(String[][] arr, int l, int r) {
        if (l == r) {
            return Integer.parseInt(arr[l][3]);
        }
        int mid = (l + r) / 2;
        int lmin = utsRendah(arr, l, mid);
        int rmin = utsRendah(arr, mid + 1, r);
        if (lmin < rmin) {
            return lmin;
        } else {
            return rmin;
        }
    }

    public double rataUas(String[][] nilaiUAS) {
        double rerata = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            rerata += Integer.parseInt(nilaiUAS[i][4]);
        }
        rerata /= nilaiUAS.length;
        return rerata;
    }

    public static void main(String[] args) {
        String[][] data = {
                { "Ahmad", "220101001", "2022", "78", "82" },
                { "Budi", "220101002", "2022", "85", "88" },
                { "Cindy", "220101003", "2022", "90", "87" },
                { "Dian", "220101004", "2022", "76", "79" },
                { "Eko", "220101005", "2022", "92", "95" },
                { "Fajar", "220101006", "2022", "88", "85" },
                { "Gina", "220101007", "2022", "80", "83" },
                { "Hani", "220101008", "2022", "82", "84" }
        };
        Tugas nm = new Tugas();
        System.out.println("Nilai UTS tertinggi dengan Divide and Conquer: "
                + nm.utsTinggi(data, 0, data.length - 1));
        System.out.println("Nilai UTS terendah dengan Divide and Conquer: "
                + nm.utsRendah(data, 0, data.length - 1));
        System.out.println("Rerata nilai UAS: " + nm.rataUas(data));
    }
}
