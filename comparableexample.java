import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {

    int id;

    Student(int id) {
        this.id = id;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return "" + id;
    }
}

public class ComparableExample {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3));
        list.add(new Student(1));
        list.add(new Student(2));

        Collections.sort(list);

        System.out.println(list);

    }

}
