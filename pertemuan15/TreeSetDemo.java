import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();

        fruits.add("mangga");
        fruits.add("apel");
        fruits.add("jeruk");
        fruits.add("jambu");
        fruits.add("bambu");

        for (String temp : fruits) {
            System.out.println(temp); // urut abjad
        }

        System.out.println("First: " + fruits.first());
        System.out.println("Last: " + fruits.last());

        fruits.remove("Jeruk");
        System.out.println("setelah remove " + fruits);

        fruits.pollFirst(); // menghapus elemen pertama
        System.out.println("setelah poll first " + fruits);
        fruits.pollLast(); // menghapus elemen terakhir
        System.out.println("setelah poll last" + fruits);
    }
}
