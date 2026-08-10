import java.util.ArrayList;

class Student {

    String name;

    Student(String name) {

        this.name = name;

    }

    void display() {

        System.out.println(name);

    }
}

public class StudentList {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Saloni"));
        students.add(new Student("Rahul"));
        students.add(new Student("Anjali"));

        for (Student s : students) {

            s.display();

        }

    }
}
