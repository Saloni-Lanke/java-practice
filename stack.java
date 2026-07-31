import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        books.push("Java");
        books.push("Python");
        books.push("C");

        System.out.println(books);

        books.pop();

        System.out.println(books);

    }

}
