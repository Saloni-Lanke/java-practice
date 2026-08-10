import java.util.ArrayList;

public class StudentUpdate {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Saloni");
        students.add("Rahul");
        students.add("Anjali");

        System.out.println("Before Update: " + students);

        students.set(1, "Amit");

        System.out.println("After Update: " + students);

    }
}
