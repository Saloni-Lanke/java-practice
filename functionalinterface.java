@FunctionalInterface
interface Demo {

    void show();

}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {

        Demo d = () -> System.out.println("Functional Interface");

        d.show();

    }

}
