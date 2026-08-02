import java.util.Arrays;
import java.util.List;

public class ForEachLambda {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Saloni", "Rahul", "Anjali");

        names.forEach(name -> System.out.println(name));

    }

}
