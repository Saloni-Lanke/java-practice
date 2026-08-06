import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        Comparator<Integer> comp = (a, b) -> a - b;

        Collections.sort(numbers, comp);

        System.out.println(numbers);

    }

}
