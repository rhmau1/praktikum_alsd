|            | Algorithm and Data Structure                      |
| ---------- | ------------------------------------------------- |
| NIM        | 244107020069                                      |
| Nama       | Fijriati Rahmatur Rizqi                           |
| Kelas      | TI - 1H                                           |
| Repository | [link] (https://github.com/rhmau1/praktikum_alsd) |

# 5.2.3 Pertanyaan

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
   - bagian if melakukan pengecekan apakah nilai n saat itu == 1 apabila terpenuhi maka akan langsung return nilai 1, namun jika tidak terpenuhi maka akan lanjut ke else dimana melakukan pemanggilan terhadap fungsi itu sendiri dengan parameter nilai n yang berbeda
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
   - bisa menggunakan perulangan lain seperti while atau menggunakan fungsi rekursif, jika menggunakan fungsi rekursif maka akan sama seperti method faktorialDC(), jika menggunakan perulangan lain seperti ini
   ```
    int fakto = 1;
    int i = 1;
    while (i <= n) {
        fakto *= i;
        i++;
    }
    return fakto;
   ```
3. Jelaskan perbedaan antara fakto _= i; dan int fakto = n _ faktorialDC(n-1); !
   - fakto \*= i dilakukan dalam perulangan mulai nilai 1 sampai n yang menggunakan pendekatan brute force
   - fakto = n \* faktorialDC(n-1) adalah pemanggilan rekursif, pemanggilan akan terus dilakukan sampai nilai n == 1, apabila belum terpenuhi maka akan memanggil diri sendiri lagi namun dengan mengirimkan parameter yang berbeda yaitu nilai n-1
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
   - cara kerja faktorialBF menggunakan pendekatan brute force dimana akan melakukan pengulangan untuk semua data dimulai dari data awal sampai data akhir sampai hasil akhirnya ditemukan, cara kerja faktorialDC menggunakan pendekatan divide and conquer dimana menggunakan cara memecah nilai n menjadi nilai yang lebih kecil ditunjukkan dengan kode ketika dalam pemanggilan fungsi rekursif nilai n akan dipecah menjadi kecil dengan mengirimkan parameter n-1

# 5.3.3 Pertanyaan

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
   - method pangkatBF menggunakan pendekatan brute force dimana melakukan perulangan ke semua data mulai nilai i = 0 sampai nilai i < n, method pangkatDC menggunakan pendekatan divide conquer dimana memecah nilai n menjadi nilai yang lebih kecil sampai ditemukan best case n == 1 lalu melakukan return a, apabila belum terpenuhi maka akan melakukan pemanggilan rekursif
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
   - sudah, pada bagian return kode termasuk combine karena akan mengembalikan dan menggabungkan nilai dari hasil fungsi rekursif
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
   - bisa tanpa parameter
   ```
   int pangkatBF() {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil * nilai;
        }
        return hasil;
    }
   ```
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
   - pangkatBF menggunakan pendekatan brute force akan mengkalikan hasil dengan nilai mulai i = 0 sampai i < pangkat
   - pangkatDC menggunakan pendekatan divide conquer akan memecah nilai n sampai mencapai best case apabila n == 1 maka akan return a apabila tidak maka akan menjalankan kode else lalu melakukan pengecekan apakah nilai n ganjil atau genap, apabila ganjil maka akan menjalankan kode pemanggilan dua kali fungsi rekursif dengan mengirimkan nilai a dan nilai n/2 sebagai parameter lalu dikali a, namun jika nilai n genap maka hanya melakukan dua kali fungsi rekursif dengan mengirimkan nilai a dan nilai n/2 sebagai parameter

# 5.4.3 Pertanyaan

1. Kenapa dibutuhkan variable mid pada method TotalDC()?
   - sebagai nilai tengah untuk patokan data untuk memecah menjadi nilai yang lebih kecil untuk dihitung dipisah menjadi data sebelah kanan dan kiri dari nilai mid
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
   - untuk menghitung jumlah sebelah kanan lalu disimpan di rsum, dan menghitung jumlah sebelah kiri lalu disimpan di lsum
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
   - karena awalnya dipecah menjadi 2 bagian yaitu kanan dan kiri, untuk mendapatkan hasil totalnya maka harus menjumlahkan keduanya
4. Apakah base case dari totalDC()?
   - base case nya adalah ketika nilai kanan == kiri maka akan mengembalikan value dari array[kiri] atau bisa juga array[kanan] karena sama saja, namun lebih umum menggunakan yang kiri karena bagian awal array
5. Tarik Kesimpulan tentang cara kerja totalDC()
   - cara kerjanya pertama akan melakukan pengecekan terlebih dahulu apakah nilai l == r apabila iya maka akan return value dari array indeks ke l, apabila tidak maka akan masuk ke bagian kode else lalu akan mencari nilai mid dari data, setelah itu akan dibagi menjadi bagian kanan dan kiri, lalu melakukan pemanggilan fungsi rekursif untuk bagian kanan akan mengirimkan parameter berupa array aslinya, nilai l awal sebagai parameter l, lalu nilai mid sebagai parameter r. untuk bagian kiri maka akan melakukan fungsi rekursif untuk bagian kiri akan mengirimkan parameter berupa array aslinya, nilai mid+1 sebagai parameter l, lalu nilai r awal sebagai parameter r

# 4.5 Latihan praktikum

1. Nilau UTS tertinggi tertinggi menggunakan Divide and Conquer!
2. Nilai UTS terendah menggunakan Divide and Conquer!
3. Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force!
