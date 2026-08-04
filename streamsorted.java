import java.util.Arrays;
import java.util.List;

public class StreamSorted {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(40, 10, 30, 20);

        numbers.stream()
               .sorted()
               .forEach(System.out::println);

    }

}
