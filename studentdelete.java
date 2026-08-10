import java.util.ArrayList;

public class StudentDelete {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Saloni");
        students.add("Rahul");
        students.add("Anjali");

        System.out.println("Before Delete: " + students);

        students.remove("Rahul");

        System.out.println("After Delete: " + students);

    }
}
