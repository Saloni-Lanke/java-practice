interface Message {
    void display();
}

public class LambdaExpression {

    public static void main(String[] args) {

        Message msg = () -> System.out.println("Hello Java 8");

        msg.display();

    }

}
