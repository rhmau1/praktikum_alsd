package kuis1;

public class SmartHomeMain {
    public static void main(String[] args) {
        SmartHomeDevice[] arrDevice = new SmartHomeDevice[5];
        arrDevice[0] = new SmartHomeDevice("device 1", 12, 8);
        arrDevice[1] = new SmartHomeDevice("device 2", 10, 5);
        arrDevice[2] = new SmartHomeDevice("device 3", 11, 7);
        arrDevice[3] = new SmartHomeDevice("device 4", 7, 9);
        arrDevice[4] = new SmartHomeDevice("device 5", 8, 10);

        // print data
        for (int i = 0; i < arrDevice.length; i++) {
            arrDevice[i].printData();
        }

        int index = 0;
        double terefisien = arrDevice[0].rasioEfisiensi();
        for (int i = 1; i < arrDevice.length; i++) {
            if (arrDevice[i].rasioEfisiensi() > terefisien) {
                index = i;
                terefisien = arrDevice[i].rasioEfisiensi();
            }
        }
        System.out.println("==============================================");
        System.out.println("device paling efisien yaitu: " + arrDevice[index].nama
                + " dengan nilai rasio efisiensi sebesar: " + terefisien + "%");

        int count = 0;
        double rerata = 0;
        for (int i = 0; i < arrDevice.length; i++) {
            if (arrDevice[i].konsumsiPower > 10) {
                count++;
                rerata += arrDevice[i].totalEnergiAktual();
            }
        }
        rerata /= count;
        System.out.println("==============================================");
        System.out.println("rerata total energi aktual dari device dengan konsumsi power > 10: " + rerata);
    }

}
