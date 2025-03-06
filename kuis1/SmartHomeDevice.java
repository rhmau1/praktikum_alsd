package kuis1;

public class SmartHomeDevice {
    String nama;
    double konsumsiPower, standbyPower;

    public SmartHomeDevice(String nama, double konsumsiPower, double standbyPower) {
        this.nama = nama;
        this.konsumsiPower = konsumsiPower;
        this.standbyPower = standbyPower;
    }

    public void printData() {
        System.out.println("==============================================");
        System.out.println("Nama: " + nama);
        System.out.println("Konsumsi Power: " + konsumsiPower);
        System.out.println("Standby Power: " + standbyPower);
        System.out.println("total energi aktual: " + totalEnergiAktual());
        System.out.println("rasio efesiensi: " + rasioEfisiensi());
    }

    public double totalEnergiAktual() {
        double total = konsumsiPower + standbyPower;
        return total;
    }

    public double rasioEfisiensi() {
        double rasio = standbyPower / (totalEnergiAktual()) * 100;
        return rasio;
    }
}
