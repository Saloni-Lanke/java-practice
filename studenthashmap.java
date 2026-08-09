import java.util.HashMap;

public class StudentHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Saloni");
        students.put(2, "Rahul");
        students.put(3, "Anjali");

        System.out.println(students);

        System.out.println("Student with Roll No 2: " + students.get(2));

    }
}
