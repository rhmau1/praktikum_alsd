public class Mahasiswa10 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa10(){}

    Mahasiswa10(String nm, String name, String kls, double ipk){
        nim = nm;
        nama = name;
        kelas = kls;
        this.ipk = ipk;
    }

    void tampilInformasi(){
        System.out.println("NIM: " + nim + " Nama: " + nama + " Kelas: " + kelas + " IPK: "+ ipk);
    }
}
