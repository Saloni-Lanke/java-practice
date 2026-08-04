import java.util.Arrays;
import java.util.List;

public class StreamCount {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Saloni", "Rahul", "Anjali");

        long count = names.stream().count();

        System.out.println("Total Elements: " + count);

    }

}
