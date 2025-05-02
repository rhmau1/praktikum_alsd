package pertemuan10;

public class StackTugasMahasiswa10 {
    Mahasiswa10[] stack;
    int top, size;

    public StackTugasMahasiswa10(int size) {
        this.size = size;
        stack = new Mahasiswa10[size];
        top = -1;

    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa10 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa10 pop() {
        // jika perlu menggunakan data mahasiswa yang diambil maka return harus object
        // mahasiswa, jika data mhs yg dikeluarkan tidak akan diolah lagi pakai void
        if (!isEmpty()) {
            Mahasiswa10 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public Mahasiswa10 lihatTugasTerbawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public int hitungJumlahTugas() {
        if (!isEmpty()) {
            return top + 1;
        } else {
            System.out.println("Belum ada tugas yang dikumpulkan");
            return 0;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        // for (int i = 0; i <= top; i++) {
        // System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" +
        // stack[i].kelas);
        // }
        System.out.println();
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi10 stack = new StackKonversi10();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai /= 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
