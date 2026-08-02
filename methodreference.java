interface Sayable {

    void say();

}

public class MethodReference {

    public static void message() {

        System.out.println("Welcome to Java");

    }

    public static void main(String[] args) {

        Sayable s = MethodReference::message;

        s.say();

    }

}
