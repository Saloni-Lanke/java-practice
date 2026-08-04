import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> check = n -> n > 18;

        System.out.println(check.test(20));

        System.out.println(check.test(15));

    }

}
