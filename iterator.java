import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        Iterator<String> it = fruits.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());

        }

    }

}
