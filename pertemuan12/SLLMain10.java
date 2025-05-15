package pertemuan12;

public class SLLMain10 {
    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10();
        Mahasiswa10 mhs1 = new Mahasiswa10("2019001", "Adi", "1A", 3.5);
        Mahasiswa10 mhs2 = new Mahasiswa10("2019002", "Budi", "2B", 3.9);
        Mahasiswa10 mhs3 = new Mahasiswa10("2019003", "Cici", "3C", 3.7);
        Mahasiswa10 mhs4 = new Mahasiswa10("2019004", "Dedi", "4D", 3.8);
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dedi", mhs3);
        sll.print();
        sll.insertAt(3, mhs2);
        sll.print();
        Mahasiswa10 mhs5 = new Mahasiswa10("2019005", "Eli", "5E", 3.6);
        sll.addLast(mhs5);
        sll.print();

        System.out.println("data index 1 adalah: ");
        sll.getData(1);

        System.out.println("data mahasiswa eli ada di index: " + sll.indexOf("eli"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        sll.remove("Adi");
        sll.print();
    }
}
