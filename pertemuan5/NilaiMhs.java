package pertemuan5;

public class NilaiMhs {
    public int nilaiUtsTertinggiDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            int lmax = nilaiUtsTertinggiDC(arr, l, mid);
            int rmax = nilaiUtsTertinggiDC(arr, mid + 1, r);
            if (lmax > rmax) {
                return lmax;
            } else {
                return rmax;
            }
        }
    }

    public int nilaiUtsTerendahDC(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else {
            int mid = (l + r) / 2;
            int lmin = nilaiUtsTerendahDC(arr, l, mid);
            int rmin = nilaiUtsTerendahDC(arr, mid + 1, r);
            if (lmin < rmin) {
                return lmin;
            } else {
                return rmin;
            }
        }
    }

    public double rerataNilaiUAS(int[] nilaiUAS) {
        double rerata = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            rerata += nilaiUAS[i];
        }
        rerata /= nilaiUAS.length;
        return rerata;
    }

    public static void main(String[] args) {
        int[] nilaiUTS = { 78, 85, 90, 76, 92, 88, 80, 82 };
        int[] nilaiUAS = { 82, 88, 87, 79, 95, 85, 83, 84 };
        NilaiMhs nm = new NilaiMhs();
        System.out.println("Nilai UTS tertinggi dengan Divide and Conquer: "
                + nm.nilaiUtsTertinggiDC(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("Nilai UTS terendah dengan Divide and Conquer: "
                + nm.nilaiUtsTerendahDC(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("Rerata nilai UAS: " + nm.rerataNilaiUAS(nilaiUAS));
    }
}
