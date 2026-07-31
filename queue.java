import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> people = new LinkedList<>();

        people.add("Saloni");
        people.add("Rahul");
        people.add("Anjali");

        System.out.println(people);

        people.poll();

        System.out.println(people);

    }

}
