|            | Algorithm and Data Structure                      |
| ---------- | ------------------------------------------------- |
| NIM        | 244107020069                                      |
| Nama       | Fijriati Rahmatur Rizqi                           |
| Kelas      | TI - 1H                                           |
| Repository | [link] (https://github.com/rhmau1/praktikum_alsd) |

# 3.2.3 Pertanyaan

1. Tidak harus selalu memiliki method namun tetap memiliki atribut
2. Kode tersebut yaitu membuat array dari object mahasiswa
3. Karena meskipun class tersebut tidak mendeklarasikan sebuah konstruktor, sebuah class sudah memiliki default konstruktor yang tidak berparameter
4. Kode tersebut melakukan instansiasi objek mahasiswa dan mengisi value terhadap objeknya
5. Karena pada java tidak bisa membuat 2 class di dalam 1 file yang sama

# 3.3.3 Pertanyaan

1.
2. Karena pada kode tersebut kita langsung mengisikan atribut pada objek di dalam array, sehingga hal tersebut menimbulkan error. Untuk mengatasi hal tersebut maka sebelum mengisi atributnya kita harus membuat objeknya terlebih dahulu

# 3.4.3 Pertanyaan

1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya

   - iya bisa, contohnya sebagai berikut

   ```
   public Dosen10() { //konstruktor default
   }

   public Dosen10(String id, String nama, String bidang, boolean status, int tahun) { //konstruktor parameter
       idDosen = id;
       this.nama = nama;
       bidangKeahlian = bidang;
       statusAktif = status;
       tahunBergabung = tahun;
   }
   ```

2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method
   tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah
3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method
   tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
   array of object Matakuliah ditentukan oleh user melalui input dengan Scanner
