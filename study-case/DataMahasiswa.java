public class DataMahasiswa {
    Mahasiswa arrayOfMahasiswa[] = new Mahasiswa[5];

    public DataMahasiswa(Mahasiswa[] arrayOfMahasiswa){
        this.arrayOfMahasiswa = arrayOfMahasiswa;
    }
    public void tampilMahasiswa(){
        System.out.println("=== DATA MAHASISWA ===");
        for(int i = 0; i < arrayOfMahasiswa.length; i++){
            arrayOfMahasiswa[i].tampilData();
        }
    }    
}
