package pertemuan10;

public class StackSurat10 {
    Surat10[] stack;
    int top, size;

    public StackSurat10(int size) {
        this.size = size;
        stack = new Surat10[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat10 data) {
        if (isFull()) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            stack[top] = data;
        }
    }

    public Surat10 pop() {
        if (isEmpty()) {
            System.out.println("stack kosong");
            return null;
        } else {
            Surat10 data = stack[top];
            top--;
            return data;
        }
    }

    public Surat10 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada surat yang dikumpulkan");
            return null;
        }
    }

    void sequentialSearching(String cari) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.toLowerCase().contains(cari)) {
                System.out.println("------------------------");
                stack[i].cetakSurat();
                found = true;
            }
        }
        if (found == false) {
            System.out.println("Data surat untuk nama mahasiswa \"" + cari + "\" tidak ditemukan.");
        }
    }
}
