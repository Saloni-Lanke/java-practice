import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String name = null;

        Optional<String> value = Optional.ofNullable(name);

        System.out.println(value.orElse("No Value"));

    }

}
